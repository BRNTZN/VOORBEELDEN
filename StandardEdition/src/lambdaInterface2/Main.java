package lambdaInterface2;

public class Main {

	public static void main(String[] args) {
		Persoon p = new Persoon(1, 2);
		p.printInfo((a, b) -> a + b);
	}

	/**
	 * Meerdere parameters bij een lambda moet je verzamelen binnen ()
	 * 
	 * Bij een enkele parameter is dit niet nodig
	 */
}
