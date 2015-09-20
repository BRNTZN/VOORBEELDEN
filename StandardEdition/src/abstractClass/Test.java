package abstractClass;

public class Test {
	public static void main(String[] args) {
		AbstractClass a = new SubClass("word");
		a.print();
		a.method();
	}
}
