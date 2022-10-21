
public class Main {

	public static void main(String[] args) {
		//burada gösterilmeye çalışılan şey: Oracle'ın referansını tutabiliyor
		ICostumerDal costumerDal = new OracleCostumerDal();

	}

}
