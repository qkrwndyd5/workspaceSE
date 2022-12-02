package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		/*************************
		회원번호 : 236514
		이    름 : 홍길동
		주민번호 : 201212-3495039
		성    별 : 남
		결혼횟수 : 0
		흡연여부 : true
		키       : 178.3
		학     점: A
		용     모: 상(중)
		*************************/
	
		/*
		 * 변수선언
		 */
		int no;
		String name;
		String IDno;
		char gender;
		int marry;
		boolean smoke;
		double height;
		char grade;
		String face;


		/*
		 * 변수에데이타 대입
		 */
		no=236514;
		name="홍길동";
		IDno="201212-3495039";
		gender='남';
		marry=0;
		smoke=true;
		height=178.3;
		grade='A';
		face="상(중)";
		


		/*
		 * 변수내용출력
		 */
		System.out.println("*************************");
		System.out.println("회원번호 :"+no);
		System.out.println("이 름 :"+name);
		System.out.println("주민번호 :"+IDno);
		System.out.println("성 별 :"+gender);
		System.out.println("결혼횟수 :"+marry);
		System.out.println("흡연여부 :"+smoke);
		System.out.println("키 :"+height);
		System.out.println("학점 :"+grade);
		System.out.println("용모 :"+face);
		System.out.println("*************************");


	}

}
