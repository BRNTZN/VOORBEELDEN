package strings;

public class Stringbuilder {

	/**
	 * Sinds Java 5
	 * 
	 * StringBuffer en StringBuilder zijn mutable
	 * 
	 * StringBuffer is synchronized, StringBuilder niet
	 */

	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("blabla");
		builder.append("bla");
		System.out.println(builder.toString());
	}
}
