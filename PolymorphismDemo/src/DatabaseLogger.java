
public class DatabaseLogger extends BaseLogger {
	
	//Overriding = Üst sınıfın bir metodu vardır, ancak bir alt sınıf aynı metodu farklı şekilde kullanacaktır
	//Bu sebeple Overriding kullanılır
	
	public void log(String message) {
		System.out.println("Logged to Database : " + message);
	}
}
