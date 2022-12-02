import com.itwill.shop.ShopService;
/*
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
*/
import com.itwill.shop.member.*;
/*
import com.itwill.shop.product.Product;
import com.itwill.shop.product.ProductService;
*/
import com.itwill.shop.product.*;
/*
<<The import com.itwill.shop.admin.Product collides with another import statement>>
import com.itwill.shop.admin.Product;
*/


public class PackageImportMain {

	public static void main(String[] args) {
		/*
		 * <<자동 import 단축키>>
		 * 	ctrl + shift + o
		 */
		ShopService shopService=
				new ShopService();
		System.out.println(shopService);
		
		Member m1=new Member();
		System.out.println(m1);
		
		MemberService memberService=new MemberService();
		System.out.println(memberService);
		
		System.out.println("-------------com.itwill.shop.product.Product, com.itwill.shop.product.ProductService--------------");
		Product product=new Product();
		System.out.println(product);
		ProductService productService=new ProductService();
		
		System.out.println("-----------com.itwill.shop.admin.Product, com.itwill.shop.admin.ProductService----------------");
		com.itwill.shop.admin.Product adminProduct=new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
		com.itwill.shop.admin.ProductService adminProductService=new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);

	}

}
