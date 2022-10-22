
public class CostumerManager {
	private ICostumerDal costumerDal;

	public CostumerManager(ICostumerDal costumerDal) {
		this.costumerDal = costumerDal;
	}

	public void add() {
		// İş kodları
		this.costumerDal.add();

	}
}
