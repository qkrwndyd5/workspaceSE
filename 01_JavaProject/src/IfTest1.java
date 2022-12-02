/*
제어문
   1. if 문
       -형식 : 
	      stmt0;
		  if(조건문 ){
		      //조건문 -->   논리형데이타가 반환되는 연산 혹은 논리형변수(데이타)
			  stmt1;
		   }else{
		      stmt2;
		   }
		   stmt3;

		   조건데이타가 true인경우  stmt0-->stmt1-->stmt3;
		   조건데이타가 false인경우  stmt0-->stmt2-->stmt3;


 */

public class IfTest1 {
	/*
	 * 정렬: ctrl + shift + f
	 */

	public static void main(String[] args) {
		System.out.println("main block start");
		System.out.println("stat1");
		boolean condition = true;

		if (condition) {
			/*
			 * true일때실행블록
			 */
			System.out.println("stat2");
			System.out.println("stat3");
			System.out.println("stat4");
		}
		System.out.println("stat5");
		if(condition) {
			//true일때실행블록
			System.out.println("stat6");
			System.out.println("stat7");
			
		}else {
			//false일때 실행블록
			System.out.println("stat8");
			System.out.println("stat9");
		}
		System.out.println("stat10");
		
		if(condition)
			System.out.println("stat11");
		
		if(condition)
			System.out.println("stat12");
		else
			System.out.println("stat13");
		System.out.println("stat14");
		
		
		
		
		System.out.println("main block end");
		/*
		 * return; - 현재 return문을 실행하는 실행흐름을 호출한곳으로 반환하다. - return 문 생략가능.
		 */
		return;
//System.out.println("after return statmant");

	}

}
