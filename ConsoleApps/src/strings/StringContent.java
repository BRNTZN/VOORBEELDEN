package strings;

public class StringContent {

	public static void main(String[] args) {
		String a = new String();
		String b = "content";
		
		a = b.intern();
		
		System.out.println(a);
		System.out.println(a==b?"same address":"different addresses");
		
		a = b;
		
		System.out.println(a);
		System.out.println(a==b?"same address":"different addresses");
	}
}
