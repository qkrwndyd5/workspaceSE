package lang;

public class StringUseMain {

	public static void main(String[] args) {
		String str1="Have a nice day!!";
		String str2="오늘은 금요일 String 클래스를 공부해요.";
		System.out.println("----------lenght----------");
		int lenght1=str1.length();
		int lenght2=str2.length();
		int lenght3="자바가 재미있네요.".length();
		String emString="";
		int lenght4=emString.length();
		System.out.println(lenght1);
		System.out.println(lenght2);
		System.out.println(lenght3);
		System.out.println(lenght4);
		System.out.println("-----------null----------");
		String id=null;
		//String id="";
		if(id==null || id.equals("")) {
			System.out.println("아이디를 입력하세요!");
		}
		System.out.println("----------substring----------");
		System.out.println("Have a nice day!!".substring(7,11));
		System.out.println("오늘은 금요일 String 클래스를 공부해요.".substring(4,7));
		System.out.println("오늘은 금요일 String 클래스를 공부해요.".substring(4));
		
		System.out.println("---------charAt----------");
		String useId="testST10";
		char firstChar = useId.charAt(0);
		System.out.println(">> 아이디의첫글자는 영문대(소)문자여야한다.");
		if((firstChar >='a' && firstChar <='x') || (firstChar>='A' && firstChar <='X')) {
			System.out.println(firstChar+" 는 아이디첫글자로 유효합니다.");
		}else {
			System.out.println(firstChar+" 는 아이디첫글자로 유효안합니다.");
		}
		for(int i=0;i<useId.length();i++) {
			char tempChar = useId.charAt(i);
			System.out.println(tempChar+":"+(int)tempChar);
		}
		System.out.println("-----------split------------");
		String cardNo="123-456-7899-4566";
		String[] cardNoArray = cardNo.split("+");
		for(String tempNo:cardNoArray) {
			System.out.println(tempNo);
		}
		System.out.println("-----replace-----");
		String str3="자바는 객체지향언어입니다. 우리는 자바를 공부합니다.";
		String result3=str3.replace('자', '멀');
		System.out.println(result3);
		System.out.println(str3.replace("자바","파이썬"));
		System.out.println(str3);
		System.out.println("-----------------toUpperCase,toLowerCase---------------");
		System.out.println("jaVa".toUpperCase());
		System.out.println("JAVa".toLowerCase());
		System.out.println("------------startwith,endwith------------");
		String name="박주용";
		if(name.startsWith("박")) {
			System.out.println("박씨인사람:"+name);
		}
		System.out.println("--------친구들-------");
		String[] names= {"박주용", "김땡땡", "박땡땡", "최땡땡", "이땡땡"};
		for(int i=0;i<names.length;i++) {
			if(names[i].startsWith("김")) {
				System.out.println(names[i]);
			}
		}
		/*
		 * QUIZ:
		 * 		김씨를 새로운배열에담아보세요
		 */
		String[] kimArray=null;
		
		
		System.out.println("------------endswith-------------");
		String fileName="a.jpg";
		if(fileName.endsWith(".jpg") || fileName.endsWith(".gif")) {
			System.out.println("이미지파일입니다:"+fileName);
		}
		System.out.println("---------trim---------");
		String id2=" guar d ";
		System.out.println(id2.length());
		System.out.println(id2.trim().length());
		String chatMessage="           ";
		if(chatMessage.trim().length()==0) {
			System.out.println("전송안함~~");
		}
		if(chatMessage.trim().equals("")) {
			System.out.println("전송안함~~~");
		}
		

	}

}
