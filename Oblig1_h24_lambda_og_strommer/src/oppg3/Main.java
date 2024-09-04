package oppg3;

import java.util.Arrays;
import java.util.List;

import oppg2.Ansatt;
import oppg2.Kjonn;

public class Main {

	public static List<Ansatt> ansatteList = Arrays.asList(new Ansatt("Gareth", "Stones", Kjonn.m, "IT", 600000),
			new Ansatt("Jack", "Stickem", Kjonn.m, "Ing", 700000),
			new Ansatt("John", "Table", Kjonn.m, "IT", 900000),
			new Ansatt("Mark", "Timberk", Kjonn.m, "Ing", 500000),
			new Ansatt("Mary", "Elisabeth", Kjonn.f, "IT", 1000000));

	public static void main(String[] args) {
//Oppgåve a
		String berreEtternamn = ansatteList
				.stream()
				.map(a -> a.getEtternavn())
				.reduce("", (akku, etternavn) -> akku.isEmpty() ? etternavn: akku + " " + etternavn );
		System.out.println("Etternamna: " + berreEtternamn);
		
//Oppgåve b
		long berreKvinner = ansatteList
				.stream()
				.filter(a -> a.getKjonn() == a.getKjonn().f)
				.count();
		if(berreKvinner == 1) {
			System.out.println("Det er " + berreKvinner + " kvinne blant dei ansette");
		} else {
			System.out.println("Det er " + berreKvinner + " kvinner");
		}
//Oppgåve c
//		long gjennomsnittslønnKvinner = ansatteList
//				.stream()
//				.filter(a -> a.getKjonn() == a.getKjonn())
//				.
	
//Oppgåve d
	
	
//Oppgåve e
		long tenerMeirEnn800000 = ansatteList
				.stream()
				.filter(a -> a.getAarslonn() > 800000)
				.count();
		System.out.print("Det er " + tenerMeirEnn800000 + " ansette som tener meir enn 800000,-");
	}
	
//Oppgåve f
		String alleAnsette = ansatteList
				.stream()
				.
}