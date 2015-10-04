package thread_synchonization;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Processor p = new Processor();
		p.start();

		System.out.println("Press return to stop!");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();

		p.shutdown();
		sc.close();
	}

}

class Processor extends Thread {

	private volatile boolean running = true;

	/**
	 * Keyword volatile vermijdt dat de boolean gecachet wordt in de aparte
	 * draad waardoor deze steeds opnieuw moet checken op het originele adres
	 * van de boolean en kan waarnemen of het verandert
	 * 
	 * Meestal is dit niet nodig maar in sommige systemen worden zulke dingen
	 * gecachet!!
	 */

	@Override
	public void run() {
		while (running) {
			System.out.println("Hello");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public void shutdown() {
		running = false;
	}

}
