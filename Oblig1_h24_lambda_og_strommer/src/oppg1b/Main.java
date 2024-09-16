package oppg1b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("12 + 13 = " + beregn.beregn(12, 13, '+'));
		System.out.println("5 - 3 = " + beregn.beregn(5, 3, '-'));
		System.out.println("5 / 0 = " + beregn.beregn(5, 0, '/'));
		System.out.println("5 * 3 = " + beregn.beregn(5, 3, '*'));
		System.out.println("Kva er størst av -5 eller 3?");
		System.out.println(Math.max(-5, 3) + " er større enn " + Math.min(-5, 0));
		
	}

}
