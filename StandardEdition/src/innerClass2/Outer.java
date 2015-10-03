package innerClass2;

public class Outer {

	/**
	 * Om via de outer klasse aan de inner klasse te geraken moet de compiler er
	 * zeker van zijn dat er ook een instantie is van deze inner klasse
	 */
	private Inner inner = new Inner("inner");
	private int getal;

	public Outer(int getal) {
		this.getal = getal;
	}

	public void printInnerProperty() {
		System.out.println(inner.woord);
	}

	public int getGetal() {
		return getal;
	}

	class Inner {
		private String woord;

		public Inner(String woord) {
			super();
			this.woord = woord;
		}
	}
}
