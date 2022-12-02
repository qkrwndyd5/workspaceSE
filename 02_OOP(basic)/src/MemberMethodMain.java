
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main stat1");
		MemberMethod mm1=new MemberMethod();
		/*
		 * 멤버메쏘드 실행(호출)
		 * 	 - 형식: 참조(주소)변수.메쏘드이름();
		 * 	 - main실행흐름을 mm1주소에있는 객체의
		 * 	   method1이라는 이름의 메쏘드(실행코드블록)로 보낸다.
		 * 
		 */
		
		mm1.method1();
		System.out.println("main stat2");
		mm1.method2();
		System.out.println("main stat3");
		System.out.println("***********매개변수가있는 메쏘드호출**********");
		mm1.method3(3);
		System.out.println("main stat4");
		mm1.method3(5);
		System.out.println("main stat5");
		mm1.method4("안녕하세요!",3);
		System.out.println("main stat6");
		mm1.method4("수업끝--------",10);
		/*
		 * Quiz:
		 *   김경호 님 누구세요!
		 *   김경호 님 누구세요!
		 *   김경호 님 누구세요!
		 */
		System.out.println("main stat7");
		mm1.method5("김경호","님","누구세요!",3);
		System.out.println("main stat8");
		mm1.method5("이효리","님","누구세요!",3);
		
		
		System.out.println("main block end");
		return;

	}

}
