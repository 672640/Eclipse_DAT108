package oppg2;

public class Main {

	public static void main(String[] args) {
		final String[] kokkar = {"Anne", "Erik", "Knut"};
		final String[] servitorar = {"Mia", "Per"};
		final int kapasitet = 4;
		
		skrivUtHeader(kokkar, servitorar, kapasitet);
		
		HamburgerBrett brett = new HamburgerBrett(kapasitet);
		
		for(String namn: kokkar) {
			new Kokk(brett, namn).start();
		}
		for(String namn: servitorer) {
			new Servitor(brett, namn).start();
		}
	}
}
