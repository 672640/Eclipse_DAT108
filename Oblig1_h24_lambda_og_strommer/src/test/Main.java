package test;

import java.lang.*;
import java.util.*;

@FunctionalInterface
interface Kalkulator {
	int addere(int a, int b);
}
public class Main {

	public static void main(String[] args) {
//		List<Integer> tall = Arrays.asList(1, 2, 3, 4, 5, 6);
//		int sum = 0;
//		
//		for(int t: tall) {
//			if(t % 2 == 0) {
//				sum += t * 2;
//			}
//		}
//		System.out.println(sum);
		
//		int sum = Arrays.asList(1, 2, 3, 4, 5, 6).stream().filter(t -> t % 2 == 0).mapToInt(t -> t * 2).sum();
//		
//		System.out.print(sum);
		
		Kalkulator addisjon = (a, b) -> a + b;
		System.out.print(addisjon.addere(5, 3));
	}
}