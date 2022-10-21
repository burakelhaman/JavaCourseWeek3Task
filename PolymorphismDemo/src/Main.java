
//Inheritence kullanıldı, Polymorphism öğrenildi, Overriding kullanıldı


public class Main {
	public static void main(String[] args) {
		
//		BaseLogger[] loggers = new BaseLogger[] { new DatabaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger() };
//		
//		for (BaseLogger logger : loggers) {
//			logger.log("Log mesajı");
//		}
		
		CostumerManager costumerManager = new CostumerManager(new FileLogger());
		costumerManager.add();
	}
}