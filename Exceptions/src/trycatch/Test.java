package trycatch;

public class Test {

	public static void main(String[] args) {
		Persoon p = new Persoon();
		try {
			p.doe();
			System.out.println("dit wordt niet meer uitgevoerd als de exceptie voorkomt");
		} catch (CheckedException1 e) {
			System.out.println("Checked");
		} catch (Exception e) {
			System.out.println("any");
		}

		try {
			p.doeNogWat();
		} catch (Exception e) {
			System.out.println(e.toString());
		} 
//		catch (CheckedException1 e) {
//			
//		}
		
	}

}

class Persoon {

	public void doe() throws CheckedException1 {
		throw new CheckedException1();
	}

	public void doeNogWat() throws Exception {
		if (Math.random() * 2 > 1) {
			throw new CheckedException1();
		}
		throw new CheckedException2();
	}
}