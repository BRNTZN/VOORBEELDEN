package questionmark;

public class Nesting {

	public static void main(String[] args) {
		
		/**
		 * Voorbeeld 1 (nest in else)
		 */
		int a = 5;
		String string;
		
		if (a<0) {
			string = "jef";
		}else{
			if (a>6) {
				string = "Jan";
			}else {
				string = "Ann";
			}
		}
		System.out.println("oldway:"+string);
		
		string = a<0?"Jef":a>6?"Jan":"Ann";
		System.out.println("questionmarkway:"+string);
		
		/**
		 * Voorbeeld 2 (nest in if)
		 */
		if (a>0) {
			if (a>3) {
				string="Ann";
			}
			if (a>6) {
				string="Jan";
			}
		}else{
			string="Jef";
		}
		System.out.println("oldway"+string);
		
		/**
		 * ? expressie heeft altijd een else optie nodig
		 */
		
		
		/**
		 * gaat niet?
		 * string = a>0?(("Ann"):(a>6?"Jan":null)):"Jef";
		 */
		
		

	}

}
