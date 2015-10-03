package lambdaInterface;

@FunctionalInterface
public interface TestInterface {
	/**
	 * Functionele interfaces zijn interfaces met slechts ��n methode
	 * 
	 * Functionele interfaces mogen nog steeds constanten bevatten
	 * 
	 * @FuncionalInterface is optioneel en wordt gebruikt om compilation errors
	 *                     te vermijden
	 * 
	 */
	String getInfo();
}
