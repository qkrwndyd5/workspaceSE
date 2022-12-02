
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		/*
		int a=345;
		Account acc = new Account(888, "KIN", 50000, 3.2);
		int[] ia=new int[5];
		ia[0]=23;
		*/
		
		Account[] accArray = new Account[5];
		accArray[0] = new Account(1111, "KIM",  90000, 1.3);
		accArray[1] = new Account(2222, "PARK", 80000, 3.2);
		accArray[2] = new Account(3333, "KANG", 70000, 4.2);
		accArray[3] = new Account(4444, "SANG", 20000, 8.1);
		accArray[4] = new Account(5555, "HYUN", 50000, 5.4);
		Account.headerPrint();
		for(int i=0;i<accArray.length;i++) {
			accArray[i].print();
		}
		

	}

}
