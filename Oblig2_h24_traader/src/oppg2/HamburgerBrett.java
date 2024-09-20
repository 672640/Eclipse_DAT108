package oppg2;

import java.util.List;

public class HamburgerBrett {

private int brett;
private int kapasitet;
	
	public void telOppBrett() {
		brett++;
	}
	
	public void telNedBrett() {
		brett--;
	}
	
	public int getTalBrett() {
		return brett;
	}
	
	public HamburgerBrett(int kapasitet) {
		this.brett=0;
		this.kapasitet=kapasitet-1;
	}
	
	public boolean erFull() {
		return this.brett==kapasitet;
	}

}
