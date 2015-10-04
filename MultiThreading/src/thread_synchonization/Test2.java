package thread_synchonization;

public class Test2 {

	private int count = 0;

	public static void main(String[] args) {
		Test2 t = new Test2();
		t.doWork();
	}

	public void doWork() {
		Thread t1 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++;
					/**
					 * 3 stappen:
					 * 
					 * GET count
					 * 
					 * ADD 1
					 * 
					 * STORE BACK count
					 */
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count++;
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
		/**
		 * Door join wacht deze draad op t1 en t2 tot ze klaar zijn en ons joinen
		 */
		System.out.println(count);
	}

}
