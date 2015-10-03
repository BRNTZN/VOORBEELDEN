package loops;

public class ContinueBreak {
	/**
	 * break breekt uit de volledige lus
	 * continue stopt die individuele iteratie en gaat naar de volgende 
	 *
	 */

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			System.out.println("loop "+i);
			if (i>10) {
				break;
			}
			if (i>5) {
				continue;
			}
			System.out.println(i);
		}

	}

}
