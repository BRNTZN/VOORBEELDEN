package invoer;

import java.util.Scanner;

public class Scannerr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your input:");
		String invoer = sc.nextLine();
		System.out.println("You typed: "+invoer);
		sc.close();
	}
}
