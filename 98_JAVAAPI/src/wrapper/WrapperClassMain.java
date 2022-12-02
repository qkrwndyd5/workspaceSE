package wrapper;

import java.util.Iterator;

/*
- Wrapper 클래스

	자바데이타형은 기본데이타형과 레퍼런스 데이타 형으로 구분됩니다.
	기본데이타형으로는 int,boolean,double 등이 제공됩니다.
	이런기본 데이타형을 객체로 사용할수있는 방법으로 
	Wrapper 클래스가 제공됩니다.
	Wrapper 클래스는 각종유용한 기능들을 메서드로 제공받을수있다는
	장점이있습니다.
	
	Integer,Boolean,Double,Character,Float,Long,Byte,Short
	
 */
public class WrapperClassMain {

	public static void main(String[] args) {
		System.out.println("--------Boxing, UnBoxing---------");
		/*
		 * Boxing[기본형 --> Wrapper객체
		 */
		Character wc=new Character('김');
		Integer wi=new Integer(1231);
		Double wd=new Double(3.141592);
		Boolean wb=new Boolean(true);
		/*
		 * UnBoxing[Wrapper객체 --> 기본형]
		 */
		char c1=wc.charValue();
		int i1=wi.intValue();
		double d1=wd.doubleValue();
		boolean b1=wb.booleanValue();
		System.out.println("--------AutoBoxing, AutoUnBoxing---------");
		/*
		 * Auto Boxing[기본형 --> Wrapper객체]
		 */
		Character wc2='김';
		Integer wi2=1231;
		Double wd2=3.141592;
		Boolean wb2=true;
		/*
		 * Auto UnBoxing[Wrapper객체 --> 기본형]
		 */
		char c2=wc2;
		int i2=wi2;
		double d2=wd2;
		boolean b2=wb2;
		
		System.out.println("*************Auto Boxing**************");
		int a=89;
		int b=75;
		int c=64;
		int d=48;
		int e=39;
		
		Integer ia=new Integer(a);
		Integer ib=b;
		Integer ic=c;
		Integer id=d;
		Integer ie=e;
		
		System.out.println("*************자동형변환**************");
		Object oa=ia;
		Object ob=ib;
		Object oc=ic;
		Object od=id;
		Object oe=ie;
		
		System.out.println("*************Auto Boxing, 자동형변환**************");
		Object ooa=89;
		Object oob=75;
		Object ooc=64;
		Object ood=48;
		Object ooe=39;
		
		System.out.println("*************Object[]**************");
		Object[] scoreArray=new Object[5];
		scoreArray[0]=89;
		scoreArray[1]=75;
		scoreArray[2]=64;
		scoreArray[3]=48;
		scoreArray[4]=39;
		
		for (int i = 0; i < scoreArray.length; i++) {
			/*
			Integer tempScore=(Integer)scoreArray[i];
			int score=tempScore.intValue();
			System.out.println(score+" ");
			*/
			int score=(Integer)scoreArray[i];
			System.out.println(score+" ");
			
			/******************참고*****************/
			
			Integer wi11=new Integer(123);
			Integer wi22=new Integer(123);
			
			System.out.println(wi11==wi22);
			System.out.println(wi11.equals(wi22));
			
		}
		

	}

}
