package interfaces;

public interface Oppervlak {

	/**
	 * Velden in interfaces worden per definitie static final
	 * 
	 * Methodes in een interface mogen geen body bevatten (tenzij default
	 * methode)
	 * 
	 * Default methodes mogen overschreven worden
	 * 
	 * Iedere methode in een interface moet door de implementatie overschreven
	 * worden (behalve default methodes)
	 */

	double PI = 3.14159265359;

	double getOppervlakte();

	default void defaultMethod() {
		System.out.println("Default");
	}
}
