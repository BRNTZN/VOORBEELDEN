package innerClass;

public class Outer {
	private int getal;

	public Outer(int getal) {
		this.getal = getal;
	}

	public void blabla() {

	}

	class Inner {

		/**
		 * De inner klasse kan aan alle velden en methodes van de outerklasse
		 * 
		 * Om van de outer klasse aan de velden van de inner klasse te kunnen
		 * moeten we iets extra doen (zie innerclass2)
		 */

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
