package generic;

import java.util.ArrayList;

public class ArrayListStringWrapperMain {

	public static void main(String[] args) {
		System.out.println("-----------String-----------");
		ArrayList<String> nameList=new ArrayList<String>();
		System.out.println("-----------1.add-----------");
		nameList.add("KIM");
		nameList.add("HIM");
		nameList.add("JIM");
		nameList.add("BIN");
		nameList.add("BIM");
		nameList.add("MIM");
		nameList.add("CIM");
		nameList.add(new String("KIM"));
		System.out.println(nameList);
		System.out.println("-----------2.get(index)-----------");
		System.out.println(nameList.get(1));
		System.out.println(nameList.get(3));
		System.out.println(nameList.get(5));
		System.out.println("-----------3.remove(index)-----------");
		nameList.remove(1);
		System.out.println(nameList);
		System.out.println("-----------3-1.remove(element)-----------");
		nameList.remove("JIM");
		System.out.println(nameList);
		nameList.remove("KIM");
		System.out.println(nameList);
		
		
		System.out.println("-----------Wrapper-----------");
		ArrayList<Integer> scoreList=new ArrayList<Integer>();
		scoreList.add(90);
		scoreList.add(30);
		scoreList.add(45);
		scoreList.add(78);
		scoreList.add(89);
		scoreList.add(12);
		scoreList.add(new Integer(90));
		scoreList.add(new Integer(100));
		System.out.println(scoreList);
		System.out.println("-----------1.get-----------");
		int score1 = scoreList.get(2);
		System.out.println(score1);
		int score2 = scoreList.get(scoreList.size()-1);
		System.out.println(score2);
		
		System.out.println("-----------2.set-----------");
		scoreList.set(2, 99);
		System.out.println(scoreList);
		
		System.out.println("-----------3.remove-----------");
		scoreList.remove(5);
		/*
		scoreList.remove(new Integer(90));
		*/
		System.out.println(scoreList);
		
		
		
	}

}
