package oppg1b_testing2;

import java.util.function.BiFunction;

public class Beregn {
	public static int beregn(int a, int b, BiFunction<Integer, Integer, Integer> summerFunksjon) {
		return summerFunksjon.apply(a,  b);
	}
	
	
}
