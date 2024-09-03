package oppg2;

import java.util.function.Function;

public class Ansatt {
	String fornavn;
	String etternavn;
	String stilling;
	int aarslonn;
	Kjonn kjonn;
	Function<Ansatt, Integer> lonna = a -> aarslonn;
	
	
	
	public Function<Ansatt, Integer> getLonna() {
		return lonna;
	}

	public void setLonna(Function<Ansatt, Integer> lonna) {
		this.lonna = lonna;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getStilling() {
		return stilling;
	}

	public void setStilling(String stilling) {
		this.stilling = stilling;
	}

	public int getAarslonn() {
		return aarslonn;
	}

	public void setAarslonn(int aarslonn) {
		this.aarslonn = aarslonn;
	}

	public Kjonn getKjonn() {
		return kjonn;
	}

	public void setKjonn(Kjonn kjonn) {
		this.kjonn = kjonn;
	}
		
	@Override
	public String toString() {
		return "Ansatt " + fornavn + " " + etternavn + ", " + kjonn + ", har stillinga " + stilling
				+ " og skal ha ei lønn på " + lonna;
	}
}