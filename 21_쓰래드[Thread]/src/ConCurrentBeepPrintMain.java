
public class ConCurrentBeepPrintMain {

	public static void main(String[] args) {
		System.out.println("1.main thread start");
		System.out.println("2.main thread ConCurrentBeepThread객체생성");
		ConCurrentBeepThread beepThread = new ConCurrentBeepThread();
		System.out.println("3.main thread ConCurrentBeepThread객체.start()메쏘드 실행");
		beepThread.start();
		System.out.println("4.main thread ConCurrentPrintThread객체생성");
		ConCurrentPrintThread printThread = new ConCurrentPrintThread();
		System.out.println("5.main thread ConCurrentPrintThread객체.start()메쏘드 실행");
		printThread.start();		
		System.out.println("9.main thread end jvm return");

	}

}
