package interfaces;

public class Cirkel implements Oppervlak {
	private double straal;
	
	public Cirkel(double straal) {
		super();
		this.straal = straal;
	}

	@Override
	public double getOppervlakte() {
		return straal*straal*PI;
	}
	
	@Override
	public void defaultMethod(){
		System.out.println("Not default anymore");
	}
}
