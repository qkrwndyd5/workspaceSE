/*
 2.AMain 이라는 이름의 클래스작성
	2-1.AMain 클래스에 메인메쏘드 작성(생성)
		2-1-1.메인메쏘드에 코드작성
                      - A객체생성
		      - A객체멤버변수에 값대입
                      - A객체멤버변수의 값출력
 */
package com.itwill02.constructor;

public class AMain {

	public static void main(String[] args) {
		A a = new A();
		
		a.a = 10;
		a.b = 20;
		
		System.out.println(a.a);
		System.out.println(a.b);

	}

}
