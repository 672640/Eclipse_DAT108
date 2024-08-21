package Oppgave1;

public class Main {

	public static void main(String[] args) {
		int[] tabell;
		
		int[] tabell2 = new int[] {1, 6, 10, 4};
		
		skrivUtTallene(tabell2, new Stjerneformat());
		
	}
	
	static void skrivUtTallene(int[] tabell, Tallformat format) {
		for(int i: tabell) {
			System.out.println(format.somStreng(i));
		}
	}
}
