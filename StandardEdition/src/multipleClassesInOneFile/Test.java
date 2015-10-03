package multipleClassesInOneFile;

/**
 * Ieder Java bestand moet één public klasse bevatten
 * 
 * Een publieke klasse MOET in zijn eigen bestand zitten (public class Test in
 * Test.java)
 * 
 * Ook binnen hetzelfde bestand kunnen klassen niet aan elkaars private velden
 * 
 *
 */

class First {
	public void info() {
		System.out.println("First");
	}
}

class Second {
	public void info() {
		System.out.println("Second");
	}
}

public class Test {

	public static void main(String[] args) {
		First first = new First();
		Second second = new Second();

		first.info();
		second.info();
	}
}