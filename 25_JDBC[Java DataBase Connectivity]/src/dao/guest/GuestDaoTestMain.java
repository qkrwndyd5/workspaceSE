package dao.guest;

import java.util.List;

public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
				
		GuestDao guestDao=new GuestDao();
		System.out.println("1.insert");
		int rowCount = guestDao.insert(new Guest(0,"짱구",null,"guard7@gmail.com","http://www.itwill.co.kr","타타타이틀","모두"));
		rowCount = guestDao.insert(new Guest(0,"스펀지밥",null,"abcd@gmail.com","http://www.itwill.co.kr","타이이이틀","화이팅"));
		System.out.println("insert : " + rowCount);
		System.out.println("2.delete");
		rowCount = guestDao.delete(0);
		System.out.println("3.update");
		rowCount = guestDao.update(new Guest(3,"이름수정",null,"1234@naver.com","http://www.itwill.co.kr","타이틀변경1","변경사항"));
		System.out.println("4.findByPrimarykey");
		Guest findGuest = guestDao.findByGuest(3);
		System.out.println(findGuest);
		System.out.println("5.findAll");
		List<Guest> guestList = guestDao.findByAllGuest();
		System.out.println(guestList);
			
	}

}
