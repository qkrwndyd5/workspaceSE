/*
 * 1. 주차장에서 차객체를 생성할클래스(틀)
 * 2. Car객체의 주소를 지정할 수 있는 타입
 */
/**
 * 주차장에서 차객체를 생성할클래스
 * @author ITWILL
 * @version 0.2
 *
 */
public class Car {
	/*
	 * 클래스의 구성요서
	 *	1. 멤버필드(변수)[속성]: 차객체의 속성데이타를 저장할변수
	 *	2. 멤버메쏘드[기능]	   : 차객체가 외부에 제공하는 기능
	 */
	/*
	 * 멤버필드[속성]
	 */
	private String no;	//차량변호
	private int inTime;	//입차시간
	private int outTime;//출차시간
	private int fee;	//주차요금
	/*
	 * 멤버메쏘드[기능]
	 */
	/*
	 * 입차시데이타(번호,시간)대입
	 */
	public void setIpChaData(String no,int inTime) {
		this.no=no;
		this.inTime=inTime;
	}
	/*
	 * 출차시간 멤버필드outTime에 출차시간데이타 대입(set)
	 */
	public void setOutTime(int outTime) {
		this.outTime=outTime;
	}
	/*
	 * 주차요금계산
	 */
	public void calculateFee() {
		this.fee=(this.outTime-this.inTime)*1000;
	}
	
	
	/*
	 * 차량정보출력
	 */
	public void print() {
		System.out.println("------------------------------------");
		System.out.printf("%s %s %s %s\n","차량변호","입차시간","출차시간","주차요금");
		System.out.println("------------------------------------");
		System.out.printf("%7s %7d %7d %8d",this.no,this.inTime,this.outTime,this.fee);
	}
	
	/*
	 * getter,setter메쏘드 자동생성단축기
	 * Alt+Shift+s --> r
	 */
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public int getInTime() {
		return inTime;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getOutTime() {
		return outTime;
	}
	
	//setter,getter
	
	
}
