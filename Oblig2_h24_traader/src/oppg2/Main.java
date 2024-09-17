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
			if(brett > kapasitet) {
				System.out.println(kokkar + " (kokk) er klar med hamburgaren, men brettet er fullt. Ventar!");
			}
			new Kokk(brett, namn).start();
		}
		for(String namn: servitorar) {
			if(brett == null) {
				System.out.println(servitorar + " (servitør) ønskar å ta hamburgar, men brettet er tomt. Ventar!");
			} else {
			new Servitor(brett, namn).start();
		}
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
