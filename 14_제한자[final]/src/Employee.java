public abstract class Employee {
	public static final double INCENTIVE_RATE = 0.1; //인센티브율
	
	
    private int no;  	//사원번호
    private String name;	//사원이름
    private int pay;	//사원급여
    public Employee() {
		// TODO Auto-generated constructor stub
	}    	
	public Employee(int no, String name) {
		super();
		this.no = no;
		this.name = name;
		this.pay = pay;
	}
		
	/*
     급여계산메쏘드
     	 - 실제구현작업 불가능
     	 - 자식클래스에서 반드시 재정의(구현)해야하는 메쏘드
     	 - 재정의 강제(규칙,specification)
     */

    public abstract void calculatePay();
    
    /*
      인센티브계산 (급여가 100만원이넘으면 10%인센티브지급)
      	- 
     */
    public double calculateIncentive() {
    	double incentive=0.0;
    	if(this.pay>=100000) {
    		incentive = this.pay*Employee.INCENTIVE_RATE;
    	}
    	return incentive;
    }
    

    public void print(){
    	System.out.print(this.no+"\t"+this.name+"\t"+this.pay+"\t");
    }
    
    public int getNo() {
    	return no;
    }
    public void setNo(int no) {
    	this.no = no;
    }
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getPay() {
    	return pay;
    }
    public void setPay(int pay) {
    	this.pay = pay;
    }

}
