package loops;

public class Loops {
	public static int doWhile() {
		int a = 0;
		do {
			a--;
		} while (a > 0);
		System.out.println(a);
		return a;
	}
	public static int whileDo() {
		int a = 0;
		while (a > 0) {
			a--;
		}
		System.out.println(a);
		return a;
	}
	public static int forLoop() {
		int a =0;
		for (int i = 0; i > 5; i++) {
			a--;
		}
		System.out.println(a);
		return a;
	}
	public static void main(String[] args) {
		doWhile();
		whileDo();
		forLoop();
	}
}