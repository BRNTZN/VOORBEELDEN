package dubbelKlasse;

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