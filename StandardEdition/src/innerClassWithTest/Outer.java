package innerClassWithTest;

public class Outer {
	private int getal;

	public Outer(int getal) {
		this.getal = getal;
	}

	public void blabla() {

	}

	class Inner {

		private String woord;

		public Inner(String woord) {
			super();
			this.woord = woord;
		}

		public void printOuterProperty() {
			System.out.println(getal);
		}

		public void blablaUse() {
			blabla();
		}

		public String getWoord() {
			return woord;
		}
	}
}
