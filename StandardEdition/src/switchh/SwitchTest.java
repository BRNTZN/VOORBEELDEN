package switchh;

public class SwitchTest {
	public static void main(String[] args) {
		System.out.println("5 ends up in:");
		switchCase(5);
		System.out.println("1 ends up in:");
		switchCase(1);
		System.out.println("3 ends up in:");
		switchCase(3);
	}

	public static void switchCase(int a) {
		switch (a) {
		case 0:
			System.out.println(0);
		case 2:
			System.out.println(2);
		case 3:
			System.out.println(3);
		default:
			System.out.println("default");
		case 5:
			System.out.println(5);
			break;
		case 6:
			System.out.println(6);
			break;
		case 4:
			System.out.println(4);
		case -1:
			System.out.println(-1);
			/**
			 * Toegelaten datatypes in een switch:
			 * 
			 * Byte, short, int, enum, String, Character, Byte, Short en
			 * Integer.
			 * 
			 * Strings kan pas sinds Java 7
			 */
		}
	}
}
