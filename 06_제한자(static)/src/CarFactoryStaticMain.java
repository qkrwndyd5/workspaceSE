
public class CarFactoryStaticMain {

	public static void main(String[] args) {		
		Car c1=new Car(1, "K3", "RED");		
		Car c2=new Car(2, "K5", "RED");		
		Car c3=new Car(3, "K7", "RED");		
		
		System.out.println("차량총생산대수:"+Car.count);
		c1.headerPrint();
		c1.print();
		c2.print();
		c3.print();

	}

}
