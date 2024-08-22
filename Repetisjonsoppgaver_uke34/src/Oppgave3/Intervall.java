package Oppgave3;

public class Intervall<T extends Comparable> implements IntervallInterface<T> {

	private T[] ting;
	private T storst;
	private T minst;
	private int storrelse;
	private int antal;
	
	public Intervall(T minst, T storst) {
		if(minst.compareTo(storst) > 0) {
			throw new IllegalArgumentException("Den minste verdien kan ikkje vere større enn den størst verdien!");
		}
		this.minst = minst;
		this.storst = storst;
	}

	public T getMinst() {
		return minst;
	}
	
	public T getStorst() {
		return storst;
	}
	
	public boolean contains(T poeng) {
		return (minst.compareTo(poeng) <= 0) && (storst.compareTo(poeng) >=0);
	}
	
	@Override
	public boolean isEmpty() {
		return minst.equals(storst);
	}

	@Override
	public int size() {
		if(minst instanceof Integer && storst instanceof Integer) {
			return (Integer) storst - (Integer) minst + 1;
		} else {
			throw new UnsupportedOperationException("Kan berre innehalde heiltal.");
		}
	}
	
	@Override
	public String toString() {
		return "[" + minst + ", " + storst + "]";
	}

	@Override
	public void add(T ting) {
		// TODO Auto-generated method stub
		
	}
}
