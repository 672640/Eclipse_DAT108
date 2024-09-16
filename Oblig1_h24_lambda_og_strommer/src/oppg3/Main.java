package oppg3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import oppg2.Ansatt;
import oppg2.Kjonn;

public class Main {

	public static List<Ansatt> ansatteList = Arrays.asList(new Ansatt("Henrik", "Ibsen", Kjonn.m, "lyrikarsjef", 600000),
			new Ansatt("Jonas", "Holland", Kjonn.m, "fotballspelar", 700000),
			new Ansatt("Mari", "Kålnes", Kjonn.f, "skodespelar", 900000),
			new Ansatt("Mika", "Surnes", Kjonn.i, "kaptein", 500000),
			new Ansatt("Frøydis", "Skurda", Kjonn.f, "lærar", 1000000),
			new Ansatt("Henry", "Bendri", Kjonn.m, "bemanningssjef", 1000000));

	public static void main(String[] args) {
//Oppgåve a
		String berreEtternamn = ansatteList
				.stream()
				.map(a -> a.getEtternavn())
				.reduce("", (akku, etternavn) -> akku.isEmpty() ? etternavn: akku + ", " + etternavn);
		
		System.out.println("Etternamna til dei ansette: " + berreEtternamn);
		
//Oppgåve b
		long berreKvinner = ansatteList
				.stream()
				.filter(a -> a.getKjonn() == a.getKjonn().f)
				.count();
		if(berreKvinner == 1) {
			System.out.println("Det er " + berreKvinner + " kvinne blant dei ansette");
		} else {
			System.out.println("Det er " + berreKvinner + " kvinner blant dei ansette");
		}
//Oppgåve c
		Double gjennomsnittslonnKvinner = ansatteList
				.stream()
				.filter(a -> a.getKjonn().equals(a.getKjonn().f))
				.collect(Collectors.averagingLong(a -> a.getAarslonn()));
			System.out.println("Gjennomsnittslønna til kvinnene er " + gjennomsnittslonnKvinner + ",-");
				
	
//Oppgåve d
		List<Ansatt> sjefLonnsauking = ansatteList
        .stream()
        .filter(a -> a.getStilling().contains("sjef"))
        .peek(a -> a.setAarslonn((int)(a.getAarslonn() * 1.07)))
        .collect(Collectors.toList());
		
			System.out.println(sjefLonnsauking);
		

//Oppgåve e
		long tenerMeirEnn800000 = ansatteList
				.stream()
				.filter(a -> a.getAarslonn() > 800000)
				.count();
			if(tenerMeirEnn800000 == 0) {
				System.out.println("Ingen ansatte tener meir enn 800000,-");
			}
		System.out.println("Det er " + tenerMeirEnn800000 + " ansette som tener meir enn 800000,-");
		
//Oppgåve f
		List<String> alleAnsatte = ansatteList
				.stream()
				.map(a -> a.getFornavn() + " " + a.getEtternavn())
				.collect(Collectors.toList());
				
				System.out.println("Alle ansette: " + alleAnsatte);
				
//Oppgåve g
				
		Optional<Ansatt> ansattLagastLonn = ansatteList
				.stream()
				.min(Comparator.comparingInt(Ansatt::getAarslonn));
		
		System.out.println(ansattLagastLonn);
		
//Oppgåve h
				int sumAlleHeiltalDeleleg3eller5 = IntStream.range(1, 1000)
						.filter(n -> n % 3 == 0 || n % 5 == 0)
						.sum();
				System.out.println("Det er " + sumAlleHeiltalDeleleg3eller5 +
						" heiltal i [1, 1000> som er delelege med 3 eller 5");		
	}
}		