package oppg1b;



public class beregn implements BeregnInterface {
	public static int beregn(int a, int b, char teikn) {

//		if(teikn != '+' || teikn != '-' || teikn != '*' || teikn != '/') {
//			System.out.print("Dette matteteiknet er ikkje støtta!");
//		}
	
		switch(teikn) {
		case '+': return a + b;
		case '-': return a - b;
		case '*': return a * b;
		case '/': if(b == 0) { return 0; } return a / b;}

		
		return 0;
			}

	@Override
	public int storstTal(int a, int b) {
		
		return Math.max(a, b) ;
	}

	@Override
	public int minstTal(int a, int b) {
		return Math.min(a, b);
	}

	@Override
	public int avstandMellomTal(int a, int b) {
		int sum = a + b; 
		if(sum < 0) {
			return Math.abs(sum);
		}
		return sum;
	}
}
