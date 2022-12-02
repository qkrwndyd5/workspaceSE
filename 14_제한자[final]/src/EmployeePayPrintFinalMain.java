
public class EmployeePayPrintFinalMain {

	public static void main(String[] args) {
		Employee[] emps= {
				new SalaryEmployee(1, "KIM", 3000000),
				new SalaryEmployee(2, "GANG", 4000000),
				new SalaryEmployee(3, "PARK", 5000000),
				new HourlyEmployee(4, "LEE", 100, 20000),
				new HourlyEmployee(5, "KIM", 100, 9000)
		};
		
		for(Employee emp:emps) {
			emp.calculatePay();
			System.out.println("------"+emp.getName()+"님 금여명세표------");
			emp.print();
			double incentive=emp.calculateIncentive();
			System.out.println("\t인센티브:"+incentive);
			System.out.println("-------------------------------------");
			System.out.println();
		}
		System.out.println("사내인센티브율:"+Employee.INCENTIVE_RATE);
		

	}

}
