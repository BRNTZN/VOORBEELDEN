package innerClass;

public class Test {

	public static void main(String[] args) {
		Outer outer = new Outer(4);
		Outer.Inner inner = outer.new Inner("inner");
		inner.printOuterProperty();
		
		Outer.Inner inner2 = new Outer(2).new Inner("inner 2");
		inner2.printOuterProperty();
	}
}