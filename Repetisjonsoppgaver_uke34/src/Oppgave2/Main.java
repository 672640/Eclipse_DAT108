package Oppgave2;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person("Johann", "Hansen", 1985);
		Person person2 = new Person("Ola", "Nordmann", 2003);
		Person person3 = new Person("Kari", "Øyna", 2000);
		Person person4 = new Person("Johann", "Hundson", 1950);
		
		List<Person> personListe = List.of(person1, person2, person3, person4);
		
		PersonFormat personFormat = new PersonFormat();
		
		for(Person person: personListe) {
			personFormat.skrivUtFodselsaaret(personFormat, person);
		}
//Korleis kan vi ta i bruk desse når vi har ein toString-metode
//i Person-klassa?
		
	}

		
}
