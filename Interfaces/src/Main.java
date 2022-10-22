
public class Main {

	public static void main(String[] args) {
		// burada gösterilmeye çalışılan şey: Oracle'ın referansını tutabiliyor
		ICostumerDal[] costumer = {new MySqlCostumerDal(), new OracleCostumerDal()};
		CostumerManager costumerManager = new CostumerManager(costumer[0]);
		costumerManager.add();

	}

}
