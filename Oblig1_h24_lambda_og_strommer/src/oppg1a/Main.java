package oppg1a;

import java.util.*;



public class Main{

	
	
	public static void main(String[] args) {

		List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");
		
		List<List<String>> innpakkaListe = new ArrayList<>();
		for(String str: listen) {
			innpakkaListe.add(Collections.singletonList(str));
		}
		
		ComparatorInterface comparator = (List<String> a, List<String> b) ->
		Integer.parseInt(a.get(0)).compareTo(Integer.parseInt(b.get(0)));

		innpakkaListe.sort(comparator::compare);
		
		List<String> sortertListe = new ArrayList<>();
		for(List<String> wrapped : innpakkaListe) {
			sortertListe.add(innpakkaListe.get(0));
		}
		
		System.out.println(sortertListe);
	}


	



}
