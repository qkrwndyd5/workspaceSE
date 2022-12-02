import java.util.Iterator;

/*
 배열:  
      - 같은데이타형을 가진 멤버필드(기억장소) 여러개의 모음타입 
      - 배열타입변수의 선언형식
           데이타타입[] 이름; ex) int[] ia; , char[] ca;
	  - 사용: 
	       1.배열타입객체의생성	
		   2.배열객체멤버필드의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */

public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		int intType;
		intType=90;
		
		int[] intArray;
		intArray = new int[5];
		System.out.println("int배열객체의 주소값:"+intArray);
		intArray[0]=90;
		intArray[1]=80;
		intArray[2]=70;
		intArray[3]=60;
		intArray[4]=50;
		
		
		System.out.println("-----------for문------------");
		for(int i=0;i<5;i++) {
			System.out.println("intArray["+i+"]==> "+intArray[i]);
		}
		/*
		 * 모든배열객체는 public int length; 를 멤버변수로 가진다.
		 */
		System.out.println("배열객체의 멤버필드 갯수:"+intArray);
		for(int i=0;i<intArray.length;i++) {
			System.out.println("intArray["+i+"]==> "+intArray[i]);
		}
		
		System.out.println("-----기본형 1차원[] 배열-----");
		System.out.println("-----int[]--------");
		int[] korArray=new int[10];
		korArray[0]=80;
		korArray[1]=70;
		korArray[2]=60;
		korArray[3]=50;
		korArray[4]=40;
		korArray[5]=30;
		korArray[6]=20;
		korArray[7]=10;
		korArray[8]=17;
		korArray[9]=56;
		
		int korTot=0;
		for (int i = 0;i < korArray.length;i++) {
			korTot+=korArray[i];
			
		}
		System.out.println("우리반 국어총점:"+korTot);
		double korAvg = (double)korTot/korArray.length;
		System.out.println("우리반 국어평균:"+korAvg);
		
		System.out.println("-----------char[]----------");
		char[] ca=new char[6];
		ca[0]='A';
		ca[1]='C';
		ca[2]='D';
		ca[3]='A';
		ca[4]='B';
		ca[5]='F';
		for (int i =0 ;i < ca.length;i++) {
			System.out.println(ca[i]+" ");
		}
		System.out.println();
		System.out.println("-----------boolean[]-----------");
		boolean[] ba=new boolean[5];
		ba[0]=true;
		ba[1]=true;
		ba[2]=false;
		ba[3]=true;
		ba[4]=false;
		int trueCount=0;
		for (int i = 0; i < ba.length; i++) {
			if(ba[i]) {
				trueCount++;
			}
		}
		System.out.println("true count:"+trueCount);
		
		System.out.println("----------String[]----------");
		
		String[] strArray = new String[5];
		strArray[0]="KIM";
		strArray[1]="SIM";
		strArray[2]="HANG";
		strArray[3]="KANG";
		strArray[4]="PARK";
		
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]);
			
		}
		

	}

}
