package interfaces;

public interface Oppervlak {

	double PI = 3.14159265359;

	double getOppervlakte();
	default void defaultMethod(){
		System.out.println("Default");
	}
}
