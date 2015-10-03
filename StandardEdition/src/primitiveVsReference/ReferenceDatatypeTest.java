package primitiveVsReference;

/**
 * Twee objecten vergelijken met == vergelijkt adressen, niet de inhoud. Bij primitieve types wordt de inhoud vergeleken
 * 
 * Primitieve types zijn call by value, anderen zijn call by reference
 * 
 * Om de inhoud van objecten te vergelijken gebruik je best equals(), overschrijf deze indien nodig
 * 
 */
public class ReferenceDatatypeTest {

	public static void main(String[] args) {
		int a = 0;
		ReferenceDatatype rd = new ReferenceDatatype();
		pasAan(a);
		pasAan(rd);

		System.out.println(a);
		System.out.println(rd.getB());
		System.out.println(rd.c);
	}

	public static void pasAan(int getal) {
		getal++;
	}

	public static void pasAan(ReferenceDatatype rd) {
		rd.setB(rd.getB() + 1);
		/**
		 * rd.setA(rd.getB()++); compileerfout: a is private
		 **/
		rd.c++;
	}
}
