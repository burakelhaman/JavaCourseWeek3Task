//Bir class birden fazla class ı implemente edebilir

public class MySqlCostumerDal implements ICostumerDal{

	@Override
	public void add() {
		System.out.println("My sql veritabanına eklendi");
		
	}

}
