package oppg2;

import java.util.Random;

public class Kokk extends Thread{
	private HamburgerBrett brett;
	private String namn;
			
	public Kokk(HamburgerBrett brett, String namn) {
		this.brett = brett;
		this.namn = namn;
	}
	
	public void run() {
		for (int i =0; i<100; i++) {
			Random time = new Random();
			try {
				Thread.sleep(time.nextInt(500));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized(brett){
				if (!brett.erFull())
					brett.telOppBrett();
				else
					System.out.println("BS IS FULL FFS");
				System.out.println("BS IN "+brett.getTalBrett());
				brett.notifyAll();
		}
		}
	}
}
