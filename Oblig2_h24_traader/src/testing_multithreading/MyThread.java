package testing_multithreading;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i = 10; i > 0; i--) {
			System.out.println("Tråd nr.1 " + i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		System.out.println("Tråd nr. 1 er fullført");
	}
}
