package Oppgave2;

public record Person(String fornamn, String etternamn, int fodselsaar) {
	
	@Override
	public String toString() {
		return fornamn + etternamn + " , født i " + "fodselsaar";
	}
}
