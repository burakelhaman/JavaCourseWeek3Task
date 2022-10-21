
//S-> O <-LID (Open-Clos)
//Bir sisteme yeni bir özellik getirdiğin zaman, mevcuttaki hiçbir kodu değiştiremezsin

public class Main {

	public static void main(String[] args) {
		CostumerManager costumerManager = new CostumerManager();
		costumerManager.databaseManager = new SqlServerDatabaseManager();
		costumerManager.getCostumers();

	}

}
