package strings;

public class Immutable {

	public static void main(String[] args) {
		String immutable = "Strings are immutable";
		immutable.concat(", NOT!");
		System.out.println(immutable);
	}
}
