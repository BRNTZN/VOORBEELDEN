package innerClass2;

public class Outer {
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
