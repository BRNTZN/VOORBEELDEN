package questionmark;

public class Questionmark {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(true?"true":"false");
		/**
		 * "false" is hier dead code
		 */
		
		int a = 5;
		System.out.println( a==5 ? "yup" : "nope" );
	}
}
