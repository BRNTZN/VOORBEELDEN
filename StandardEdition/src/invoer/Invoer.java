package invoer;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Invoer {

	public static void main(String[] args) {
		String invoer = JOptionPane.showInputDialog("invoer:");
		System.out.println(invoer);
		
		Scanner sc = new Scanner(System.in);
		String invoer2 = sc.nextLine();
		System.out.println(invoer2);
		sc.close();
	}
}
