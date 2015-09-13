package abstractClass;

public class SubClass extends AbstractClass {
	public SubClass(String woord) {
		/**this.woord = woord;
		 * not visible => compilation error**/
		setWoord(woord);
	}

	@Override
	public void abstractMethod() {
		System.out.println("must be overridden");
	}

	@Override
	public void method() {
		System.out.println("sorry");
	}
}
