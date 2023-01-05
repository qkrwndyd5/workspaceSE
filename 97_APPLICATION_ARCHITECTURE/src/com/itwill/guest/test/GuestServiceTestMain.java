package com.itwill.guest.test;


import java.util.Date;

import com.itwill.guest.Guest;
import com.itwill.guest.GuestService;

public class GuestServiceTestMain {

	public static void main(String[] args) throws Exception{
		GuestService guestService=new GuestService();
		
		System.out.println("1.방명록쓰기");
		Guest newGuest = new Guest(0, "게스트", new Date(), "abcd@gmail.com", "www.itjbs.co.kr", "타타이이틀틀", "화이팅");
		System.out.println(">> "+guestService.guestWrite(newGuest));
		
		System.out.println("4.방명록1개보기");
		Guest findGuest = guestService.guestDetail(10);
		System.out.println(">> "+findGuest);
		
		System.out.println("2.방명록수정");
		findGuest.setGuest_name("이름변경");
		System.out.println(">> "+guestService.guestUpdate(findGuest));
		System.out.println(">> "+guestService.guestDetail(10));
		
		System.out.println("3.방명록삭제");
		System.out.println(">> "+guestService.guestDelete(3));
		
		
		System.out.println("5.방명록이름으로검색 보기");
		System.out.println(">> "+guestService.findByGuestName("나경호"));
		
		System.out.println("6.방명록 리스트보기");
		System.out.println(">> "+guestService.guestList());
	}

}
