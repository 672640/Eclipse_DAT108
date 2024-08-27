package oppg1b;



public class beregn implements BeregnInterface {
	public static int beregn(int a, int b, char teikn) {

		if(teikn != '+' || teikn != '-' || teikn != '*' || teikn != '/') {
			System.out.print("Dette matteteiknet er ikkje støtta!");
		}
	
		if( b == 0 && teikn == '/') {
			System.out.print("Kan ikkje dele på 0!");
		}
		
		switch(teikn) {
		case '+': System.out.println(a + b);
		case '-': System.out.println(a - b);
		case '*': System.out.println(a * b);
		case '/': System.out.println(a / b);
		}
//Korleis i svarte skal eg finne ut av ein måte å bruke
//Math.max her?
		
		return teikn;
			}

//	@Override
//	public int adderTal(int a, int b) {
//		return a + b;
//	}
//
//	@Override
//	public int subtraherTal(int a, int b) {
//		
//		return a - b;
//	}
//
//	@Override
//	public int multipliserTal(int a, int b) {
//		
//		return a * b;
//	}
//
//	@Override
//	public int dividerTal(int a, int b) {
//		
//		return a / b;
//	}
//
//	@Override
//	public int storstTal(int a, int b) {
//		
//		return Math.max(a, b) ;
//	}
//
//	@Override
//	public int minstTal(int a, int b) {
//		return Math.min(a, b);
//	}
//
//	@Override
//	public int avstandMellomTal(int a, int b) {
//		int sum = a + b; 
//		if(sum < 0) {
//			return Math.abs(sum);
//		}
//		return sum;
//	}
}
