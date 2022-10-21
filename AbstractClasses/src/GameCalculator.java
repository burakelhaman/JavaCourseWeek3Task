
public abstract class GameCalculator {
	//Neden Abstract kullanırız: 
	//1-) bir sub-class'ın nesnesi olması gerekmiyorsa veya biz istemiyorsak
	//2-) alt-class'ın zorunlu metotlara sahip olmasını istiyorsak(Eğer bu sebeple
	// sub-class'ı Abstract yaparsak sub-class'ın nesnesi olmayacağını kabul etmiş oluruz)
	//
	// Abstract bir class'ta illa bir abstrack metot olmak zorunda değil
	// Her alt sınıf kendine has bir "hesapla" metotu override etmek zorunda
	
	public abstract void hesapla();
	
	public final void gameOver() {
		System.out.println("Oyun Bitti");
	}

}