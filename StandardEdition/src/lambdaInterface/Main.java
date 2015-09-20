package lambdaInterface;

public class Main {

	public static void main(String[] args) {
		Persoon p = new Persoon();
		p.printInfo(() -> "info");
	}

}
