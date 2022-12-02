
public class AcademyMemberArrayTypeCastingMain {

	public static void main(String[] args) {
		// members --> AcademyMember배열타입
		AcademyMember[] members= {
			new AcademyStudent(1, "KIM", "JAVA"),
			new AcademyStudent(2, "LEE", "OFFICE"),
			new AcademyStudent(3, "LIM", "ANDROID"),
			new AcademyGangsa(4, "PARK", "JAVA"),
			new AcademyGangsa(5, "KANG", "ACCOUNTING"),
			new AcademyStaff(6, "HANG", "OFFICE"),
			new AcademyStaff(7, "HO", "ANDROID"),
		};
		
		AcademyMember[] receiveMembers = members;
		
		System.out.println("----AcademyMember전체출력----");
		for(int i=0;i<receiveMembers.length;i++) {
			/*
			 * AcademyStudent,AcademyGangsa,AcademyStaff에서 재정의된 print매쏘드 호출
			 */
			receiveMembers[i].print();
		}
		
		System.out.println("------instanceof-------");
		/*
		 * 연산자 --> instanceof
		 * 		- 형태 : 참조변수 instanceof 클래스이름
		 * 		- 연산결과 : true or false
		 * 		- ex > boolean b = receiveMembers[0] instanceof AcademyStudent;
		 */
		AcademyMember am=new AcademyStudent(90,"김학생","정보처리반");
		if(am instanceof AcademyStudent) {
			AcademyStudent tempStudent = (AcademyStudent)am;
			String tempBan = tempStudent.getBan();
			System.out.println("학생반:"+tempBan);
		}
		
		System.out.println("-----AcademyMember배열에있는 객체들중에서 AcademyStudent객체들만출력-----");
		for(int i=0;i<receiveMembers.length;i++) {
			if(receiveMembers[i] instanceof AcademyStudent) {
				receiveMembers[i].print();
				AcademyStudent tempStudent = (AcademyStudent)receiveMembers[i];
				System.out.println("학생반:"+tempStudent.getBan());
			}
		}

	}

}
