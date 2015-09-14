package boxing;

public class Boxing {
	public static void main(String[] args) {
		Integer object;
		int a = 5;
		/**boxing:**/
		object = a;
		/**unboxing:**/
		int b = object;
		System.out.println(b);
	}
}
