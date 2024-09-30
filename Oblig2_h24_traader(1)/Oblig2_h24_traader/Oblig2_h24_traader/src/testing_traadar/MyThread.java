package testing_traadar;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		if(this.isDaemon()) {
		System.out.println("Dette er ein køyrande daemon tråd");
	} else {
		System.out.println("Dette er ein køyrande user-tråd");
	}
}
}