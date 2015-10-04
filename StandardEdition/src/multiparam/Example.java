package multiparam;

public class Example {

	public static void main(String[] args) {
		method("één", "twee", "drie");

	}
	
	private static void method(String arg1, String... args){
		System.out.println(arg1 + " eerste argument");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
	
//	private static void method(String... args, int a){
//		... moet de laatste param zijn
//	}
	
//	private static void method(String... args){ 
//		for (int i = 0; i < args.length; i++) {
//			System.out.println(args[i]);
//		}
//	}

}
