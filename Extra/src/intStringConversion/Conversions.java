package intStringConversion;

public class Conversions {

	public static void main(String[] args) {
		String string = "252";
		System.out.println(Integer.parseInt(string)+48);
		
		int integer = 25;
		String string2 = String.valueOf(integer);
		System.out.println(string2);

	}

}
