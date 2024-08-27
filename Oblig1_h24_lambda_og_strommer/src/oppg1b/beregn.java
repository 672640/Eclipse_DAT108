package oppg1b;



public class beregn {
	public static int beregn(int a, int b, char teikn) {

		//if(teikn != '+' || teikn != '-' || teikn != '*' || teikn != '/') {
			//System.out.print("Dette matteteiknet er ikkje støtta!");
		//}
//Treng eg dette her, eller dette på denne måten?		
		if( b == 0 && teikn == '/') {
			System.out.print("Kan ikkje dele på 0!");
		}
		
		return a + teikn + b;
		
	}
}
