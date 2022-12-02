
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		/****************존재하지않는 객체생성*************
		AcademyMember academyMember = new AcademyMember(0,"누구게");
		academyMember.print();
		System.out.println();
		**************************************************/
		
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "PARK", "JAVA");
		
		AcademyGangsa gs1 = new AcademyGangsa(3, "GUN", "자바");
		AcademyGangsa gs2 = new AcademyGangsa(4, "JANG", "오피스");
		
		AcademyStaff sf1 = new AcademyStaff(5, "LEE", "영업팀");
		AcademyStaff sf2 = new AcademyStaff(6, "HYUN", "취업팀");
		
		
		System.out.println("-------------Student-------------");		
		st1.print();
		st2.print();		
		System.out.println("--------------Gansa---------------");
		gs1.print();
		gs2.print();
		System.out.println("--------------Staff---------------");
		sf1.print();
		sf2.print();

	}

}
