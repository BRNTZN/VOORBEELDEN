package inheritance;

public class Test {
	public static void main(String[] args) {
		/**
		 * Het aanroepen van een constructor roept steeds de constructors van de
		 * superklasses op
		 * 
		 * De constructor van de hoogste superklasse wordt eerst aangeroepen,
		 * dan de tweedehoogste etc.
		 */
		Persoon leerkracht = new Leerkracht();
		if (leerkracht instanceof Persoon) {
			System.out.println("Een leerkracht is een persoon");
		}
		if (leerkracht instanceof Werknemer) {
			System.out.println("Een leerkracht is een werknemer");
		}
		if (leerkracht instanceof Leerkracht) {
			System.out.println("Een leerkracht is een leerkracht");
		}
	}
}
