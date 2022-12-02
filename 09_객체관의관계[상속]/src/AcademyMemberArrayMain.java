
public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		
		AcademyStudent[] students = new AcademyStudent[3];
		AcademyGangsa[] gangsas = new AcademyGangsa[2];
		AcademyStaff[] staffs = new AcademyStaff[2];
		
		students[0] = new AcademyStudent(1, "KIN", "JAVA");
		students[1] = new AcademyStudent(2, "PARK", "ANDROAD");
		students[2] = new AcademyStudent(3, "LEE", "IOS");
		
		gangsas[0] = new AcademyGangsa(1, "김강사", "웹디자인");
		gangsas[1] = new AcademyGangsa(2, "박강사", "오피스");
		
		staffs[0] = new AcademyStaff(1, "천상용", "홍보부");
		staffs[1] = new AcademyStaff(2, "조은주", "총무부");
		
		System.out.println("-----------AcademyMember 전체출력-------------");
		System.out.println("-----------Student[for]-------------");
		for(int i=0;i<students.length;i++) {
			AcademyStudent academyStudent = students[i];
			academyStudent.studentPrint();
		}
		System.out.println("-----------Student[for]-------------");
		for(AcademyStudent academyStudent:students) {
			academyStudent.studentPrint();
		}
		
		
		System.out.println("-----------Gangsa-------------");
		for(AcademyGangsa gangsa:gangsas) {
			gangsa.gangsaPrint();
		}
		System.out.println("-----------Staff-------------");
		for(AcademyStaff staff:staffs) {
			staff.staffPrint();
		}
		

	}

}
