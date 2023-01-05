package com.itwill.member.test;

import javax.swing.JOptionPane;

import com.itwill.member.Member;
import com.itwill.member.MemberService;

public class MemberServiceTestMain {

	public static void main(String[] args) throws Exception{
		MemberService memberService = new MemberService();
		
		boolean addSuccess1 = 
				memberService.addMember(new Member("xxxx","xxxx","엑스맨","경기도민",30,"F",null));
		if(addSuccess1) {
			System.out.println("로그인화면으로이동");
		}else {
			JOptionPane.showConfirmDialog(null, "중복된아이디입니다");
		}
		
		boolean addSuccess2 = 
				memberService.addMember(new Member("bbbb","bbbb","와이맨","강원도민",33,"T",null));
		if(addSuccess2) {
			System.out.println("로그인화면으로이동");
		}else {
			JOptionPane.showConfirmDialog(null, "중복된아이디입니다");
		}
		System.out.println("2.login");
		System.out.println(">> "+memberService.login("bbbb", "bbbb"));
		System.out.println(">> "+memberService.login("bbbb", "gdaf"));
		System.out.println(">> "+memberService.login("gggg", "1234"));
		System.out.println();
		
		System.out.println("3.diplicateId");
		System.out.println(">> "+memberService);
		
		
	}

}
