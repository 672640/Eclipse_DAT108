package oppg1a;

import java.util.*;

@FunctionalInterface
interface Samanlikn {
	int samanlikn(String a, String b);
}

public class Main{
	
	public static void main(String[] args) {

		List<String> listen = Arrays.asList("10", "1", "20", "110", "21", "12");

		Collections.sort(listen, (a, b) -> Integer.compare(Integer.parseInt(a), Integer.parseInt(b)));
		
		System.out.print(listen);
	}
}
