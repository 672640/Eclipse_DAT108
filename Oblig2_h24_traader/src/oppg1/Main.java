package oppg1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		final Thread[] t2 = new Thread[1];
		
		t2[0] = new Thread(new MinRunnable()) {
			@Override
			public void run() {
				while(true) {
				String melding = JOptionPane.showInputDialog(null, "Skriv inn ei melding, quit for å avslutte");
					if(melding == null || melding.contains("quit")) {
						System.out.println("\n" + "Programmet har blitt avslutta");
						break;
					} else {
						System.out.println(melding);
					}
			}
		}
	};
	Thread t1 = new Thread(new MinRunnable()) {
		@Override
		public void run() {
			while(true && t2[0].isAlive()) {
				System.out.println("Hallo verden!");
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
			}
		}
	};
	
		t1.start();
		t2[0].start();
}
}
