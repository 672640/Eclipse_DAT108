package oppg3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class HamburgerBrett {

private BlockingQueue<Hamburger> brett;
private int kapasitet;
private int hamburgerIdTal = 0;

	public HamburgerBrett(int kapasitet) {
		this.brett= new LinkedBlockingDeque<>(kapasitet);
		this.kapasitet=kapasitet;
	}
	
	public boolean erFull() {
		return this.brett.size() == kapasitet;
	}

	public boolean erTom() {
		return this.brett.isEmpty();
	}
	
	public void leggTilHamburger() {
		if(!erFull()) {
			Hamburger hamburger = new Hamburger(++hamburgerIdTal);
			this.brett.add(hamburger);
		}
	}
	
	public void fjernHamburger() {
		if(!erTom()) {
			brett.remove(0);
		}
	}
	
	public String hentHamburgerListe() {
		if(brett.isEmpty()) {
			return "[]";
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Hamburger hamburger: brett) {
			sb.append("◖").append(hamburger.getId()).append("◗, ");
		}
		sb.setLength(sb.length() - 2);
		sb.append("]");
		return sb.toString();
	}
	
	public Hamburger hentSisteHamburger() throws InterruptedException {
		if(!erTom()) {
			return brett.take();
		} else {
		return null;
		}
	}
	public boolean harHamburger() {
		return !brett.isEmpty();
	}
}
