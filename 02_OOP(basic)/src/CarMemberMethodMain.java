
public class CarMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 1. 차량번호 1234차량 12시입차
		 */
		Car car1=new Car();
		/*
		 * 입차시데이타(번호,시간)대입
		 */
		car1.setIpChaData("1234", 12);
		
		//car1.no="1234";
		//car1.inTime=12;
		/*
		 * 2. car1차량 16시 출차
		 */
		/*
		 * 2-1. 출차시간대입 메쏘드호출
		 */
		car1.setOutTime(16);
		//car1.outTime=16;
		/*
		 * 2-2. 주차요금계산 메쏘드호출
		 */
		car1.calculateFee();
		//car1.fee=(car1.outTime-car1.inTime)*1000;
		/*
		 * 주차요금계산영수증 메쏘드호출
		 */
		
		
		car1.print();

	}

}
