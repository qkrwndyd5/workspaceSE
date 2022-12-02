import java.util.Arrays;

public class ArraysMain {

	public static void main(String[] args) {
		int[] intArray1= {1,3,5,7,9};
		int[] intArray2= {1,3,5,7,9};
		String[] strArray1= {"one","two","three"};
		String[] strArray2= {"one","two","three"};
		
		System.out.println("1.배열내용비교");
		boolean isSame = Arrays.equals(intArray1, intArray2);
		System.out.println(isSame);
		isSame = Arrays.equals(strArray1, strArray2);
		System.out.println(isSame);
		
		System.out.println("2.배열원소채우기(fill)");
		Arrays.fill(intArray1, 1);
		for(int e : intArray1) {
			System.out.println(e+" ");
		}
		System.out.println();
		System.out.println("3.배열복사(기본형)");
		int[] intArray3=Arrays.copyOf(intArray2, intArray2.length+1);
		for(int e : intArray3) {
			System.out.println(e+" ");
		}
		System.out.println();
		
		
		int[] scoreArray= {90,67,88,23,56,12,34};
		String[] nameArray= {"공경호","홍경호","JWMSE","김경호","김경효"};
		
		Account[] accountArray = {
				new Account(1111,"KIM", 50000, 8.9),
				new Account(2222,"LEE",58000,1.3),
				new Account(3333,"PARK",40000,1.5),
				new Account(4444,"HANG",18000,2.3),
				new Account(5555,"GU",28000,3.3),
				new Account(6666,"JANG",38000,4.3),
				new Account(7777,"HYOUN",78000,2.3),
				new Account(8888,"KIM",52000,8.3),
				new Account(9999,"SUNG",51000,9.3)
				};
		
		
		System.out.println("3.배열복사(참조형)");
		Account[] newAccountArray = 
				Arrays.copyOf(accountArray, accountArray.length+1);
		for(Account account : newAccountArray) {
			System.out.println(account);
		}
		
		Account[] descAccounts=new Account[accountArray.length+1];
		System.arraycopy(accountArray, 0, descAccounts, 0, accountArray.length);
		
		for(Account account : descAccounts) {
			System.out.println(account);
		}
		
		
		System.out.println("4.sort[기본타입]");
		Arrays.sort(scoreArray);
		for(int score:scoreArray) {
			System.out.println(score+" ");
		}
		System.out.println();
		Arrays.sort(nameArray);
		for(String name : nameArray) {
			System.out.println(name+" ");
		}
		System.out.println("5.sort[Account] - ");
		Arrays.sort(accountArray);
		/*
		<< Arrays.sort(accountArray); >>
			- Account[] 안에있는 element(Account) 는 
		      반드시 Comparable interface를 구현해야한다.
		    - Array.sort(accountArray)메쏘드 정렬메카니즘
		    	A. 첫번째객체와 두번째객체를 ComParable 인터페이스타입으로 형변환한다.
			    B. 첫번째Account객체와 두번째Account객체를 비교한다. 
			     	Comparable firstAccount=(Comparable)accountList.get(0);
			     	Comparable secondAccount=(Comparable)accountList.get(1);
			        int result=firstAccount.compareTo(secondAccount);
			    B. 비교의 결과값 정수가 양수이면 첫번째와 두번째를 교환   한다. 
			       비교의 결과값 정수가 음수이면 첫번째와 두번째를 교환 안한다. 
			   
			    A. 두번째Account객체와 세번째Account객체를 비교한다. 
			     	Account secondAccount=accountList.get(1);
			    	Account thirdAccount=accountList.get(2);
			       int result=secondAccount.compareTo(thirdAccount);
			    B. 비교의 결과값 정수가 양수이면 두번째와 세번째를 교환   한다. 
			       비교의 결과값 정수가 음수이면 두번째와 세번째를 교환 안한다. 
		 */
		
		
		Account.headerPrint();
		for (Account account : accountArray) {
			account.print();
		}
		
		System.out.println("5.sort[Account] - Comparator");
		Arrays.sort(accountArray, 
					new AccountBalanceDescComparator());
		System.out.println("-------AccountBalanceDescComparator-------");
		for (Account account : accountArray) {
			account.print();
		}
		
		System.out.println("-------AccountOwnerAscComparator-------");
		Arrays.sort(accountArray, 
					new AccountOwnerAscComparator());
		for (Account account : accountArray) {
			account.print();
		}
		
		

	}

}
