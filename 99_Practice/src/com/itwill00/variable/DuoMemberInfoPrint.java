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
		
		
		
		int IDnumber;
		String name;
		String IDcardnumber;
		char gender;
		int numberofmarriages;
		boolean smoking;
		double height;
		char credit;
		String appearance;
		
		/*
		 * 변수선언
		 */
		
		IDnumber=236514;
		name="홍길동";
		IDcardnumber="201212-3495039";
		gender='남';
		numberofmarriages=0;
		smoking=true;
		height=178.3;
		credit='A';
		appearance="상(중)";
		
		/*
		 * 변수에데이타 대입
		 */
		
		System.out.println("*************************");
		System.out.println("회원번호 : "+IDnumber);
		System.out.println("이    름 :"+name);
		System.out.println("주민번호 : "+IDcardnumber);
		System.out.println("성    별 : "+gender);
		System.out.println("결혼횟수 : "+numberofmarriages);
		System.out.println("흡연여부 : "+smoking);
		System.out.println("키       : "+height);
		System.out.println("학    점 : "+credit);
		System.out.println("용    모 : "+appearance);
		System.out.println("*************************");
		
		/*
		 * 변수내용출력
		 */

	}
}