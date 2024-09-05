package oppg2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;



public class Main {
	
	private static void lonnsoppgjor(List<Ansatt> ansatte, Predicate<Ansatt> condisjon, Consumer<Ansatt> lonnsoppgjor){
		for (Ansatt a : ansatte) {
			if(condisjon.test(a))
				lonnsoppgjor.accept(a);
		}
	}
	
	private static void skrivUtAlle(List<Ansatt> ansatte) {
		for (Ansatt a : ansatte) {
			System.out.println(a.toString());
		}
	}
	

	public static void main(String[] args) {
		List<Ansatt> ansatteList = Arrays.asList(new Ansatt("Henrik", "Ibsen", Kjonn.m, "lyrikarsjef", 600000),
			new Ansatt("Jonas", "Holland", Kjonn.m, "fotballspelar", 700000),
			new Ansatt("Mari", "Kålnes", Kjonn.f, "skodespelar", 900000),
			new Ansatt("Mika", "Surnes", Kjonn.i, "kaptein", 500000),
			new Ansatt("Frøydis", "Skurda", Kjonn.f, "lærar", 1000000),
			new Ansatt("Henry", "Bendri", Kjonn.m, "bemanningssjef", 1000000));
		
		
		//Et fast kronetillegg
		//lonnsoppgjor(ansatteList ,x->true,x -> x.setAarslonn(x.getAarslonn()+20));
		//skrivUtAlle(ansatteList);
		
		//Et fast prosenttillegg
		//lonnsoppgjor(ansatteList ,x->true,x -> x.setAarslonn( (int) ((int)x.getAarslonn()*1.5)));
		//skrivUtAlle(ansatteList);
		
		//Et fast kronetillegg hvis du har lav lønn
		//lonnsoppgjor(ansatteList ,x->x.getAarslonn()<=2500,x -> x.setAarslonn(x.getAarslonn()+20));
		//skrivUtAlle(ansatteList);
		
		//Et fast prosenttillegg hvis du er mann
		lonnsoppgjor(ansatteList ,x->x.getKjonn()==Kjonn.m,x -> x.setAarslonn((int) ((int)x.getAarslonn()*1.5)));
		skrivUtAlle(ansatteList);

	}
}
