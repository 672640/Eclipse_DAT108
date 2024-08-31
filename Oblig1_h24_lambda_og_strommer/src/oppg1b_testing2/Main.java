package oppg1b_testing2;

public class Main {

	public static void main(String[] args) {
		
		int sum = Beregn.beregn(12, 13, Integer::sum);
		System.out.println("Summen av 12 og 13 er " + sum);

		int maks = Beregn.beregn(-5, 3, Math::max);
		System.out.println("Den største av -5 og 3 er " + maks);
	
		int avstand = Beregn.beregn(54, 45, (a,b) -> Math.abs(a - b));
		System.out.println("Avstanden mellom 54 og 45 er " + avstand);
	}

}
