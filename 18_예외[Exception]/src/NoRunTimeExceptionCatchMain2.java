import java.io.IOException;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NoRunTimeExceptionCatchMain2 {

	public static void main(String[] args) {
		try {
		System.out.println("stat1");
		
		/*
		 *  예외발생예상코드(IOException)
		 */
		Socket socket = new Socket("www.daum.net", 80);

		System.out.println("stat2");
		/*
		 *  예외발생예상코드(ClassNotFoundException)
		 */
		Class.forName("AClass");
		
		System.out.println("stat3");
		
		/*
		 * 예외발생예상코드(SQLException)
		 */
		DriverManager.getConnection("");
		System.out.println("stat4");
		/*
		 * 예외발생예상코드(ArithmeticException)
		 */
		int result=3/0;
		System.out.println("stat5");
		}catch (Exception e) {
			System.out.println("모든예외를 한곳에서처리-->msg:"+e.getMessage());
			System.out.println("고객님 죄송합니다.!!!");
			System.out.println("**************print stack trace**********");
			e.printStackTrace();
		}
		System.out.println("main end return");
		
	}

}
