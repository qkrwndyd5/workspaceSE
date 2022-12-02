import java.io.IOException;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NoRunTimeExceptionThrowMain1 {

	public static void main(String[] args) throws Exception
			/*throws IOException, ClassNotFoundException, SQLException*/{
		
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
		
		/*
		 * 
		 */
		int result=3/0;
		
		
	}

}
