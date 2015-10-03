package generics;

/**
 *
 * Sinds Java 5
 *
 */

class Dier<V extends Voedsel> {
	public void eet(V voedsel) {
	}
}

class Voedsel {
}

class Vlees extends Voedsel {
}

class Plant extends Voedsel {
}

class Gras extends Plant {
}

class Mens {
}

public class Test {
	
	public static void main(String[] args) {
		// Dier<Mens> menseneter = new Dier();
		/**
		 * Dieren kunnen nu alleen voedsel eten (door <V extends Voedsel> in de
		 * klasse Dier)
		 */

		Dier<Voedsel> alleseter = new Dier<Voedsel>();
		Dier<Vlees> carnivoor = new Dier<>();
		@SuppressWarnings({ "unchecked", "rawtypes" })
		Dier<Plant> herbivoor = new Dier();
		

		/**
		 * Alle drie van deze declaraties werken, de laatste geeft wel een
		 * warning Door <V extends Voedsel> mag je ook alle subklasses van
		 * voedsel doorgeven als parameter
		 */

		// alleseter.eet(new Mens());
		/**
		 * De alleseter mag nog steeds alleen voedsel eten
		 */
		alleseter.eet(new Voedsel());
		alleseter.eet(new Plant());
		alleseter.eet(new Vlees());
		
		
		// carnivoor.eet(new Plant());
		carnivoor.eet(new Vlees());
		
		/**
		 * Dier<Vlees> carnivoor mag alleen vlees eten ook al is een plant voedsel
		 */
		
	
		// herbivoor.eet(new Voedsel());
		// herbivoor.eet(new Vlees("steak"));
		herbivoor.eet(new Plant());
		herbivoor.eet(new Gras());
		
		/**
		 * Ook elke subklasse van plant geldt als geldige parameter
		 */
	}
}