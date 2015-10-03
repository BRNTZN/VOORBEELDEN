package existingExceptions;

public class Main {

	public static void main(String[] args) {
		/**
		 * Reeds bestaande exceptions zijn steeds unchecked runtime exceptions, deze
		 * moeten dus niet opgevangen worden maar eindigen wel het programma bij
		 * voorkomen
		 */
		method();
		System.out.println("Dit wordt niet uitgevoerd");
	}

	private static void method() {
		throw new IllegalArgumentException();
	}

}
