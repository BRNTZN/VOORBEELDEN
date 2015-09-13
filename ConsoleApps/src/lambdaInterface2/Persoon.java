package lambdaInterface2;

public class Persoon {
	private int a,b;
	
	public Persoon(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void printInfo(TestInterface test){
		System.out.println(test.getSom(a, b));
	}
	
	void test(){
		
	}
}
