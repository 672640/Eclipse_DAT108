package oppg2;

public class Main {

	public static void main(String[] args) {
		
		final String[] kokkar = {"Anne", "Erik", "Knut"};
		final String[] servitorar = {"Mia", "Per"};
		final int KAPASITET = 4;
		
		skrivUtHeader(kokkar, servitorar, KAPASITET);
		HamburgerBrett brett = new HamburgerBrett(KAPASITET);
		
		String skrivUtKokkar = String.join(", ", kokkar);
		String skrivUtServitorar = String.join(", ", servitorar);
		
		System.out.print("I denne simuleringa har vi " + "\n     "
				 + kokkar.length + " kokkar: " + skrivUtKokkar + "\n     "
				 + servitorar.length + " servitørar: " + skrivUtServitorar + "\n     "
				 + "Kapasiteten til brettet er: " + KAPASITET + " hamburgarar." + "\n     "
				 + "Vi startar..." + "\n");
		
		for (String navn : kokkar) {
			new Kokk(brett, navn).start();
		}
		for (String navn : servitorar) {
			new Servitor(brett, navn).start();
		}
		
	}
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				
			}
		};
	

	private static void skrivUtHeader(String[] kokkar, String[] servitorar, int kapasitet) {
		
	}
}
