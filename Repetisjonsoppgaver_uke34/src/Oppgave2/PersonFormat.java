package Oppgave2;

public class PersonFormat implements Tallformat {
	
	public String somStreng(int tall) {
		return String.valueOf(tall);
			}
	
	void skrivUtFodselsaaret(Tallformat format, Person person) {
		String aarFormat = format.somStreng(person.fodselsaar());
		System.out.println(person.fornamn() + " " + person.etternamn() + ", født i " + aarFormat);
	}
	}
