package com.itwill.tmr_house.order;

import java.util.ArrayList;
import java.util.List;

import com.itwill.tmr_house.cart.Cart;
import com.itwill.tmr_house.cart.CartDao;
import com.itwill.tmr_house.product.Product;
import com.itwill.tmr_house.product.ProductDao;

public class OrdersService {
	private OrdersDao ordersDao;
	private ProductDao productDao;
	private CartDao cartDao;
	
	public OrdersService() throws Exception {
		ordersDao = new OrdersDao();
		productDao = new ProductDao();
		cartDao = new CartDao();
	}
	
		//주문번호로 주문 한개 삭제
		public int deleteByOrderNo(int o_no) throws Exception {
			return ordersDao.deleteByOrderNo(o_no);
		}
		//주문자 이름으로 주문자 주문 전체 삭제
		public int deleteByM_id(String m_id) throws Exception {
			return ordersDao.deleteByMemberId(m_id);
		}
		//주문리스트 아이디로 찾기
		public List<Orders> orderList(String m_id) throws Exception {
			return ordersDao.findById(m_id);
		}
		//주문상세보기
		public Orders orderListDetail(String m_id,int o_no) throws Exception {
			return ordersDao.findByOrderNo(m_id, o_no);
		}
		
		//상품에서 직접주문
		public int directOrder(String m_id,int p_no,int oi_qty) throws Exception { 
			Product product = productDao.findByProductNo(p_no); // 상품번호를 이용해서 상품정보 가져온다.
			OrderItem orderItem = new OrderItem(0, oi_qty, p_no, product); //가져온 상품정보를 오더 아이템에 대입한다.
			List<OrderItem> orderItemList = new ArrayList<OrderItem>(); //오더 아이템리스트 객체를 생성한다.
			orderItemList.add(orderItem); // 오더아이템을 아이템리스트에 넣는다.
			Orders newOrders = null;
			
			if(product.getP_freeDelivery().equals("N")) { //상품정보에서 무료배송이 N이면 총 금액에서 배송비 3000원을 추가한다.
				newOrders =	new Orders(0, // 주문번호
							    orderItemList.get(0).getProduct().getP_name(), // 오더 아이템 리스트에 0번째 인덱스에 있는 상품의 이름
							   oi_qty, // 상품수량
							   (orderItemList.get(0).getOi_qty()*orderItemList.get(0).getProduct().getP_price()) + 3000, // 오더 아이템 리스트에 0번째 인덱스에 있는 상품의 가격+배송비(3000원)
							   null, //주문날짜 고정값(sysdate)
							   m_id); //멤버 아이디
							newOrders.setOrderItemList(orderItemList); // 오더 아이템 리스트에 담긴 상품들 newOrders에 추가
			}else { 
				newOrders =	new Orders(0, 
					    orderItemList.get(0).getProduct().getP_name(),
					   oi_qty,
					   orderItemList.get(0).getOi_qty()*orderItemList.get(0).getProduct().getP_price(),
					   null,
					   m_id);
				
			}
			
			return ordersDao.insertOrder(newOrders);
		}
		
		//cart에서 주문
		public int cartOrder(String m_id) throws Exception{
			Product product = new Product();
			List<Cart> cartList=cartDao.findByUserId(m_id); // ??멤버 카트에 있는 아이템 정보를 카트리스트에 담는다 
			List<OrderItem> orderItemList=new ArrayList<OrderItem>();
			int o_tot_price=0;
			int oi_tot_count=0;
			for (Cart cart : cartList) {
				OrderItem orderItem=new OrderItem(0,cart.getC_qty(),0, cart.getProduct()); //카트에서 가져온 상품 정보를 오더 아이템에 대입한다.
				orderItemList.add(orderItem);// 오더아이템을 아이템리스트에 넣는다.
				o_tot_price+=orderItem.getOi_qty()*orderItem.getProduct().getP_price(); // 주문 총 가격 : 상품수량*상품가격
				oi_tot_count+=orderItem.getOi_qty(); 
			}
			if(cartList.get(0).getProduct().getP_freeDelivery().equals("N")) { //상품정보에서 무료배송이 N이면 총 금액에서 배송비 3000원을 추가한다.
				o_tot_price += 3000;
			}else {
				
			}
			String o_desc = orderItemList.get(0).getProduct().getP_name()+"외 "+(oi_tot_count-1)+" 개"; // 오더 아이템 리스트에 0번째 인덱스에 있는 상품이름외 상품토탈개수-1개  
			
			Orders newOrder=new Orders(0, o_desc, oi_tot_count, o_tot_price, null, m_id);
			newOrder.setOrderItemList(orderItemList); // 오더 아이템 리스트에 담긴 상품들 newOrders에 추가
			
			
			cartDao.deleteByUserId(m_id); // 주문이 완료되면 카트를 비워야하기에 그 유저의 카트를 비운다
			return ordersDao.insertOrder(newOrder);
		}
		//cart에서 선택주문
		public int cartSelectOrder(String m_id,String[] cart_item_checks) throws Exception{ // 체크박스 선택시 숫자가 String값으로 반환해서 String배열에다가 넣는다
			Product product = new Product();
			List<OrderItem> orderItemList=new ArrayList<OrderItem>(); 
			int o_tot_price=0;
			int oi_tot_count=0;
			
			
			for(int i =0; i < cart_item_checks.length;i++) { 
				Cart  cartItem = cartDao.findByCartNo(Integer.parseInt(cart_item_checks[i])); // String값으로 반환된 값을 int값으로 반환을해주고 그 값을 대입한다.
				OrderItem orderItem=new OrderItem(0, cartItem.getC_qty(),0,cartItem.getProduct());
				orderItemList.add(orderItem);
				o_tot_price+=orderItem.getOi_qty()*orderItem.getProduct().getP_price();
				oi_tot_count+=orderItem.getOi_qty();
			}
			if(orderItemList.get(0).getProduct().getP_freeDelivery().equals("N")) {
				o_tot_price += 3000;
			}else {
				
			}
			String o_desc = orderItemList.get(0).getProduct().getP_name()+"외 "+(oi_tot_count-1)+" 개";
			
			Orders newOrder=new Orders(0,o_desc, oi_tot_count, o_tot_price,null, m_id);
			newOrder.setOrderItemList(orderItemList);
			
			
			for(int i = 0;i<cart_item_checks.length;i++) {
				cartDao.deleteByCartNo(Integer.parseInt(cart_item_checks[i])); //// 주문이 완료되면 카트를 비워야하기에 그 유저의 카트를 비운다
			}
			return ordersDao.insertOrder(newOrder);
		}

}