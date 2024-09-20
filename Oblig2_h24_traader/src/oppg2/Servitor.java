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
		for (int i =0; i<100; i++) {
			Random time = new Random();
			try {
				Thread.sleep(time.nextInt(100));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			synchronized(brett) {
				try {
					brett.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (brett.getTalBrett()!=0)
					brett.telNedBrett();
				else
					System.out.println("BS IS EMPTY FFS");
				System.out.println("BS OUT "+brett.getTalBrett());
				brett.notifyAll();
			}
		}
	}
}
