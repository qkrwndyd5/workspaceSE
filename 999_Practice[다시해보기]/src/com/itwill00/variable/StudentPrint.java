package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * 1.성적관리에서 학생2명 데이타를 담을 변수선언
		        - << 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점, 석차 >>
		 * 	- 번호(int), 이름(String), 국어, 영어, 수학, 총점, 평균(double), 평점(A,B,C)(char), 석차(int)
		 */
		int stNo1,stNo2,kor1,kor2,eng1,eng2,math1,math2,tot1,tot2,rank;
		String name1,name2;
		double avg1,avg2;
		char grade1,grade2;
		
		
		
		/*
		 * 2.변수에 데이타 대입
		 *   - 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		stNo1=1;
		name1="김경호";
		kor1=42;
		eng1=56;
		math1=78;
		
		stNo2=2;
		name2="김경수";
		kor2=45;
		eng2=53;
		math2=76;
		
		/*
		 *3. 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 *   총점, 평균 계산 후 대입 (평점은 F , 석차는 0을 대입)
		 */
		tot1=kor1+eng1+math1;
		tot2=kor2+eng2+math2;
		
		avg1=tot1/3;
		avg2=tot2/3;
		
		grade1='F';
		grade2='F';
		
		rank=0;
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 0 자리수까지 출력하세요
 		- 석차,평점은 구하지마세요
 		
 		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  89   A    3  
		 2   김경수   45   53   76   334  78   A    2  
		-----------------------------------------------
		*/
		System.out.println("--------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.println(" 1   김경호   42   56   78   334  89   F    3 ");
		System.out.println(" 2   김경수   44   53   48   321  45   F    3 ");
		System.out.println("-----------------------------------------------");

	}

}
