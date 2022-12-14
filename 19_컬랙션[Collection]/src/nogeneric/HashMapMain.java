package nogeneric;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;





public class HashMapMain {

	public static void main(String[] args) {
		HashMap carMap = new HashMap();
		System.out.println("#map size:"+carMap.size());
		System.out.println(carMap);
		System.out.println("******************* 1. put ********************");
		Car c1=new Car("1111", 12);
		carMap.put(c1.getNo(), c1);
		carMap.put("2222", new Car("2222",13));
		carMap.put("3333", new Car("3333",15));
		carMap.put("4444", new Car("4444",16));
		carMap.put("5555", new Car("5555",17));
		System.out.println("#map size:"+carMap.size());
		System.out.println(carMap);
		/*
		 * 동일한키값이 존재하지않는다(키객제 중복허용안됨)
		 */
		carMap.put("3333", new Car("삼삼삼삼",20));
		System.out.println("#map size:"+carMap.size());
		System.out.println(carMap);
		
		System.out.println("******************* 2. get(key) ********************");
		Car getCar = (Car)carMap.get("3333");
		getCar.print();
		
		System.out.println();
		System.out.println("******************* 3. remove(key) ********************");
		Car removeCar = (Car)carMap.remove("3333");
		removeCar.print();
		System.out.println("#map size:"+carMap.size());
		System.out.println(carMap);
		
		System.out.println("----------전체차량출력-----------");
		Set entrySet = carMap.entrySet();
		for(Object entryObject : entrySet) {
			Entry entry=(Entry)entryObject;
			String key=(String)entry.getKey();
			Car car=(Car)entry.getValue();
			car.print();
		}
		
		System.out.println("##################차량전체출력[iteration]#####################");
		
		

	}

}
