package Oppgave1;

public class Stjerneformat implements Tallformat {

	@Override
	public String somStreng(int tall) {
		String stjerner = "";
			for(int i = 0; i < tall; i++) {
				stjerner += "*";
			}
		return stjerner;
	}
	
	void skrivUtTallene(int[] tabell, Tallformat format) {
		for(int i: tabell) {
			System.out.println(somStreng(i));
		}
	}
}
