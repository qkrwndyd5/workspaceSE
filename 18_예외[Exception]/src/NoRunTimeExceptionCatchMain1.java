import java.io.IOException;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NoRunTimeExceptionCatchMain1 {

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
		 * 예외발생예상코드
		 */
		DriverManager.getConnection("");
		System.out.println("stat4");
		/*
		 * 
		 */
		int result=3/0;
		System.out.println("stat5");
		}catch (IOException e) {
			System.out.println("IOException:"+e.getMessage());
		}catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException:"+e.getMessage());
		}catch (SQLException e) {
			System.out.println("SQLException:"+e.getMessage());
		}catch (Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
		System.out.println("main end return");
		
	}

}
