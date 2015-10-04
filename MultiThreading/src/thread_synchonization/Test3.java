package thread_synchonization;

public class Test3 {

	private int count = 0;

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.doWork();
	}
	
	private synchronized void increment(){
		count++;
	}
	/**
	 * Keyword synchronized zorgt ervoor dat maar één thread tegelijk deze methode kan uitvoeren
	 */

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					increment();
				}
			}
		});

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(count);
	}

}
