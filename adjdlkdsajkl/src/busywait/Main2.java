package busywait;

public class Main2 {

	static Melding melding = new Melding();
	
	public static void main(String[] args) {
		
		Thread skrivUtTraad = new Thread() {
			@Override
			public void run() {
//				synchronized (melding) {
//				while(!melding.harTekst()) {
//					try {
////						Thread.sleep(10);
//						melding.wait();
//					} catch (InterruptedException e) {
//					}
//				}
//				}
				System.out.println(melding.getTekst());
			}
		};
			
//		Thread giVerdiTraad = new Thread(() -> tekst = "Hallo!");
		
		Thread giVerdiTraad = new Thread(() -> melding.setTekst("Hallo!"));
		
//		Thread giVerdiTraad = new Thread(() ->
//		{
//			synchronized (melding) {
//				melding.setTekst("Hallo!");
//				melding.notifyAll();
//			}
//		});
		skrivUtTraad.start();
		giVerdiTraad.start();
		
	}

}
