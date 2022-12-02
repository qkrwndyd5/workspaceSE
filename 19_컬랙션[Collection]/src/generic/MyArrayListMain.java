package generic;



public class MyArrayListMain {

	public static void main(String[] args) {
		
		MyArrayList<Account> myArrayList=
				new MyArrayList<Account>();
		Account acc1 = new Account(1111, "BING", 33000, 0.5);
		Account acc2 = new Account(2222, "KING", 12000, 0.1);
		Account acc3 = new Account(3333, "KING", 89000, 0.8);
		Account acc4 = new Account(4444, "YONG", 45000, 1.2);
		Account acc5 = new Account(5555, "SANG", 99000, 0.9);
		
		
		System.out.println("#list size:"+myArrayList.size());
		Account account=myArrayList.get(0);
		System.out.println(account);
		Account removeAccount=
				myArrayList.remove(0);
		removeAccount.print();

	}

}
