public class StudentPrint {

	public static void main(String[] args) {

		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호(int), 이름(String), 국어, 영어, 수학, 총점, 평균(double), 평점(A,B,C)(char), 석차(int)
		 */
		
		int no1,no2;
		String name1,name2;
		int korscore1,korscore2;
		int engscore1,engscore2;
		int mathscore1,mathscore2;
		int total1,total2;
		double average1,average2;
		char grade1,grade2;
		int rank1,rank2;
	
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		
		no1=1;
		no2=2;
		name1="김경호";
		name2="김경수";
		korscore1=42;
		korscore2=44;
		engscore1=56;
		engscore2=53;
		mathscore1=78;
		mathscore2=48;
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균 계산 후 대입 (평점은 F , 석차는 0을 대입)
		 */
		
		total1= korscore1 + engscore1 + mathscore1;
		total2= korscore2 + engscore2 + mathscore2;
		average1=((total1/3)*10+5)/10;
		average2=((total2/3)*10+5)/10;
		grade1='F';		
		grade2='F';
		rank1=0;
		rank2=0;
		
		/*
		- 출력포맷
 		- 평균은 소수점이하 자리수를 잘라버리세요
 		- 석차,평점은 구하지마세요
 		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  89   A    3  
		 2   김경수   45   53   76   334  78   A    2  
		-----------------------------------------------
		*/
		

		System.out.println("------------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점  평균  평점 석차");
		System.out.println("-------------------------------------------------");
		System.out.println( no1+"    "+name1+"   "+korscore1+"   "+engscore1+"   "+mathscore1+"  "+total1+"    "+average1+"   "+grade1+"   "+rank1);
		System.out.println( no2+"    "+name2+"   "+korscore2+"   "+engscore2+"   "+mathscore2+"  "+total2+"    "+average2+"   "+grade2+"   "+rank2);
		System.out.println("-------------------------------------------------");

		average1=total1/3;
		average2=total2/3;
		
		System.out.println("------------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점  평균  평점 석차");
		System.out.println("-------------------------------------------------");
		System.out.printf(" %d   %s   %d   %d   %d   %d  %.1f  %c    %d\n",no1,name1,korscore1,engscore1,mathscore1,total1,average1,grade1,rank1);
		System.out.printf(" %d   %s   %d   %d   %d   %d  %.1f  %c    %d\n",no2,name2,korscore2,engscore2,mathscore2,total2,average2,grade2,rank2);
		System.out.println("-------------------------------------------------");
	}

}
