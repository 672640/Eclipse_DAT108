package busywait;

public class Main {

	static String tekst;
	static Object lock = new Object();
	
	public static void main(String[] args) {
		
		Thread skrivUtTraad = new Thread() {
			@Override
			public void run() {
				while(tekst == null) {
					synchronized (lock) {
					
					try {
//						Thread.sleep(10);
						lock.wait();
					} catch (InterruptedException e) {
					}
				}
				}
				System.out.println(tekst);
			}
		};
			
//		Thread giVerdiTraad = new Thread(() -> tekst = "Hallo!");
		Thread giVerdiTraad = new Thread(() -> 
		{
			synchronized (lock) {
				tekst = "Hallo!";
				lock.notifyAll();
			}
		});
		
		skrivUtTraad.start();
		giVerdiTraad.start();
		
	}

}
