package oppg1b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		beregn regnUt = new beregn();
		
		int a;
		int b;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Legg inn det første nummeret");
			a = scanner.nextInt();
		System.out.println("Legg inn det andre nummeret");
			b = scanner.nextInt();
			
		System.out.println("Kva skal eg printe ut?");	
			scanner.close();
	}

}
