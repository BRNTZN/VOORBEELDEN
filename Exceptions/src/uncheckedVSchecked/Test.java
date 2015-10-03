package uncheckedVSchecked;

public class Test {

	public static void main(String[] args) {
		/**
		 * checked exceptions MOETEN opgevangen worden
		 */
		try {
			method1();
		} catch (CheckedException e) {
			e.printStackTrace();
		}

		try {
			method2();
		} catch (CheckedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		method3();

		method4();

		System.out.println("door de unchecked runtime exception wordt dit niet meer afgeprint");
	}

	private static void method1() throws CheckedException {
		throw new CheckedException();
	}

	private static void method2() throws CheckedException {
		throw new CheckedException("bericht");
	}

	private static void method3() {
		/**
		 * Dit maakt geen sense maar het kan wel
		 */
		try {
			throw new CheckedException();
		} catch (CheckedException e) {
			e.printStackTrace();
		}
	}

	private static void method4() {
		throw new UncheckedException();
	}

}
