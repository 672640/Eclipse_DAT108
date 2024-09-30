package oppg2;

import java.util.Random;

public class Servitor extends Thread{
	
	private HamburgerBrett brett;
	private String namn;
			
	public Servitor(HamburgerBrett brett, String namn) {
		this.brett = brett;
		this.namn = namn;
	}

	public void run() {
		Random time = new Random();
		for (int i =0; i<100; i++) {
						try {
				int delay = 2000 + time.nextInt(4000);
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(brett) {
				try {
					brett.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (brett.harHamburger()) {
					brett.fjernHamburger();
					Hamburger sisteHamburger = brett.hentSisteHamburger();
					if(sisteHamburger != null) {
						System.out.println(namn + " (servitør) tar av hamburger ◖" + sisteHamburger.getId() + "◗. Brett: " + brett.hentHamburgerListe());
					} else {
					System.out.println(namn + " (servitør) ønskar å ta hamburgaren, men brettet er tomt. Ventar!");
				brett.notifyAll();
					}
				}
			}
		}
	}
}
