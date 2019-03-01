package br.com.alexis.list1;

import java.util.Scanner;

public class Exercise3 {

	/**
	 * Do a program that ask a number of days, hours, minutes and seconds
	 * and convert all this to seconds
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type the days:");
		int days = scanner.nextInt();
		System.out.println("Type the hours:");
		int hours = scanner.nextInt();
		System.out.println("Type the minutes:");
		int minutes = scanner.nextInt();
		System.out.println("Type the seconds:");
		int seconds = scanner.nextInt();
		System.out.println("The total in seconds is: " + ((days * 86400) + (hours * 3600) + (minutes * 60) + seconds));
		scanner.close();
	}

}
