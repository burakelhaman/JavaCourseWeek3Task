
public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();

		// Referansımız GameCalculator ama bu bir Woman
		// eger sınıf türü GameCalculator olursa alt sınıflarını referans olarak
		// tutabilir
		// dizi oluşturmak gerektiğinde üst sınıf türünde dizi oluşturursak diğer
		// sınıfların referansını tutabilir

		
		//Ayrıca GameCalculator(); yazmak olmaz, çünkü abstract sınıflar asla başka sınıfta çağırılamaz
		//ancak onların kalıtımları çağırılabilir
		GameCalculator gameCalculator = new WomanGameCalculator();
		gameCalculator.gameOver();
	}

}
