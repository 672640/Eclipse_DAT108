package oppg3;

import java.util.Random;

public class Kokk extends Thread{
	private HamburgerBrett brett;
	private String namn;
	
	public Kokk(HamburgerBrett brett, String namn) {
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

			
			if (!brett.erFull()) {
				brett.leggTilHamburger();
				Hamburger sisteHamburger = null;
				try {
					sisteHamburger = brett.hentSisteHamburger();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			System.out.println(namn + " (kokk) legg på hamburgar ◖" + sisteHamburger.getId() + "◗. Brett: " + brett.hentHamburgerListe());
			} else {
				System.out.println(namn + " (kokk) er klar med hamburgaren, men brettet er fullt. Ventar!");
			}
			
		}
	}
}
