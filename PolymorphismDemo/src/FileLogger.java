
public class FileLogger extends BaseLogger {
	//Overriding
	public void log(String message) {
		System.out.println("Logged to File : " + message);
	}

}
