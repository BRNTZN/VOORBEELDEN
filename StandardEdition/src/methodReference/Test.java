package methodReference;

public class Test {

	public static void main(String[] args) {
		Drukkerij d = new Drukkerij();
		d.drukken(SlechtePrinter::print);
	}
	/**
	 * Sinds Java 8
	 * 
	 * De referenced method moet static zijn
	 */
}
