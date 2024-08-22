package Oppgave3;

public interface IntervallInterface<T> {
	void add(T ting);
	boolean isEmpty();
	int size();
	void Intervall(T minst, T storst);
	boolean contains(T poeng);
	boolean over(Intervall<T> andre);
	T getMinst();
	T getMax();
	
}
