
public class BaseKrediManager {
	//Override edilmesini istemiyorsak final kullanırız aksi taktirde Overridable
	//public final double hesapla(double tutar) {
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
}
