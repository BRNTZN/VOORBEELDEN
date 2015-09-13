package anonymousClass;

public class Test {

	public static void main(String[] args) {
		Persoon persoon = new Persoon();
		persoon.printInfo(new TestInterface(){

			@Override
			public String getInfo() {
				System.out.println(this.getClass().getCanonicalName());
				return "I don't have a name";
			}
			
		});
	}

}
