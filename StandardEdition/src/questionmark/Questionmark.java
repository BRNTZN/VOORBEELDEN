package questionmark;

public class Questionmark {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.println(true?"true":"false");
		/**
		 * "false" is hier dead code
		 */
		
		/**
		 * Deze expressie heeft ALTIJD een else optie nodig
		 * 
		 * if(blabla){
		 * 		dosomething
		 * }
		 * -> gaat niet zonder else in ? expressie
		 */
		
		int a = 5;
		System.out.println( a==5 ? "yup" : "nope" );
		
		
		
		/**
		 * Kan niet:
		 * a>5?System.out.println("groter dan 5"):System.out.println("kleiner of gelijk aan 5");
		 */
	}
}
