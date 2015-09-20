package primitiveVsReference;

public class Intndouble {

	public static void main(String[] args) {
		int a = 7;
		int b = 2;
		double c = 7 / 2;
		double d = (double) 7 / 2;
		System.out.println(a / b);
		System.out.println((double) a / b);
		System.out.println(a / (double) b);
		System.out.println((double) a / b);
		System.out.println(c);
		System.out.println(d);
	}
}
