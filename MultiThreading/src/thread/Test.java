package thread;

public class Test {

	public static void main(String[] args) {
		Runner r1 = new Runner();
		r1.start();
	}

}

class Runner extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
