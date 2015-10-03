package lambdaInterface;

public class Main {

	public static void main(String[] args) {
		Persoon p = new Persoon();
		p.printInfo(() -> "info");
		/**
		 * Dit kan alleen met functionele interfaces
		 * 
		 * Dit kan pas sinds Java 8
		 */

		/**
		 * Gebruik () om lambda zonder params te gebruiken
		 */
	}

}
