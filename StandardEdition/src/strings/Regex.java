package strings;

public class Regex {

	public static void main(String[] args) {
		String message = "check";
		if (message.matches(".hec.")) {
			System.out.println("match");
		}
	}
}
