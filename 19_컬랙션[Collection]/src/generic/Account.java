package generic;
/*
 * 계좌객체를 생성하기위한 클래스(틀)
 */
public class Account implements Comparable<Account>{
	/*
	 * 1. 속성[멤버필드(변수)]
	 */
	private int no; 		//계좌번호
	private String owner; 	//계좌주이름
	private int balance; 	//계좌잔고
	private double iyul; 	//이율
	
	public Account() {
		
	}
	
	
	
	public Account(int no, String owner, int balance, double iyul) {
		super();
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}



	/*
	 * 2. 기능[멤더메쏘드]-계좌객체가 가지고있는 기능
	 */
	/*
	 * 계좌데이타를 초기값으로 대입하는 메쏘드
	 */
	public void setAccountData(int no, String owner, int balance, double iyul) {
		this.no=no;
		this.owner=owner;
		this.balance=balance;
		this.iyul=iyul;
	
	}
	/*
	 * 입금
	 */
	public void deposit(int money) {
		this.balance+=money;
	}
	/*
	 * 출금
	 */
	public void withDraw(int money) {
		this.balance-=money;
	}
	
	/*
	 * 계좌해더출력
	 */
	public static void headerPrint() {
		System.out.println("-----------------------");
		System.out.printf("%s %s %s %s \n","번호","이름","잔고","이율"); 
		System.out.println("-----------------------");
		
	}
	/*
	 * 계좌객체정보출력
	 */
	public void print() {
		System.out.printf("%d %4s %4d %.1f\n",this.no,this.owner,this.balance,this.iyul);
	}
	
	
	
	@Override
	public String toString() {
		return "Account [no=" + no + ", owner=" + owner + ", balance=" + balance + ", iyul=" + iyul + "]";
	}



	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}



	@Override
	public int compareTo(Account nextAccount) {
		// TODO Auto-generated method stub
		return this.getNo()-nextAccount.getNo();
	}
	
	
	
}
