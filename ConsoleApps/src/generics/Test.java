package generics;

class Dier <V extends Voedsel>{
	public void eet(V voedsel){
	}
}

class Voedsel {
}

class Vlees extends Voedsel{
}

class Plant extends Voedsel {
}

class Gras extends Plant{
}

class Mens {
}

public class Test {
	public static void main(String[] args) {
		/**Dier<Mens> menseneter = new Dier();**/
		Dier<Voedsel> alleseter = new Dier<Voedsel>();
		Dier<Vlees> carnivoor = new Dier<>();
		Dier<Plant> herbivoor = new Dier<>();
		/**alleseter.eet(new Mens());**/
		alleseter.eet(new Voedsel());
		alleseter.eet(new Plant());
		alleseter.eet(new Vlees());
		/**carnivoor.eet(new Plant());**/
		carnivoor.eet(new Vlees());
		/**herbivoor.eet(new Voedsel());**/
		/**herbivoor.eet(new Vlees("steak"));**/
		herbivoor.eet(new Plant());
		herbivoor.eet(new Gras());
	}
}