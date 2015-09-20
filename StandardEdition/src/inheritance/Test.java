package inheritance;

public class Test {
	public static void main(String[] args) {
		Persoon leerkracht = new Leerkracht();
		if (leerkracht instanceof Persoon) {
			System.out.println("Een leerkracht is een persoon");
		}
		if (leerkracht instanceof Werknemer) {
			System.out.println("Een leerkracht is een werknemer");
		}
		if (leerkracht instanceof Leerkracht) {
			System.out.println("Een leerkracht is een leerkracht");
		}
	}
}
