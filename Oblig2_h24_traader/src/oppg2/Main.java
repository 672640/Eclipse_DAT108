package oppg2;

public class Main {

	public static void main(String[] args) {
		final String[] kokkar = {"Anne", "Erik", "Knut"};
		final String[] servitorar = {"Mia", "Per"};
		final int kapasitet = 4;

		String skrivUtKokkar = String.join(", ", kokkar);
		String skrivUtServitorar = String.join(", ", servitorar);
		
		skrivUtHeader(kokkar, servitorar, kapasitet);
			System.out.print("I denne simuleringa har vi " + "\n     "
							 + kokkar.length + " kokkar: " + skrivUtKokkar + "\n     "
							 + servitorar.length + " servitørar: " + skrivUtServitorar + "\n     "
							 + "Kapasiteten til brettet er: " + kapasitet + " hamburgarar." + "\n     "
							 + "Vi startar..." + "\n");
		HamburgerBrett brett = new HamburgerBrett(kapasitet);
		
		for(String namn: kokkar) {
			new Kokk(brett, namn).start();
		}
		for(String namn: servitorar) {
			new Servitor(brett, namn).start();
		}
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				
			}
		};
	}

	private static void skrivUtHeader(String[] kokkar, String[] servitorar, int kapasitet) {
		
	}
}
