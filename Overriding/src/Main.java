
public class Main {

	public static void main(String[] args) {
		// Inherit edilen sınıflar burda diziye eklendi
		// Aslında onların Referans değerleri dizide tutuluyor
		
		BaseKrediManager[] krediManagers = new BaseKrediManager[] 
				{ new TarimKrediManager(), new OgretmenKrediManager(), new OgrencıKrediManager() };
		
		//İşte bu polymorphism dir.
		//krediManager ilk once Tarımdır sonra oğretmendır
		
		for(BaseKrediManager krediManager : krediManagers) {
			krediManager.hesapla(1000);
			
		}
	}
}