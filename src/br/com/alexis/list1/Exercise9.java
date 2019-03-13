package br.com.alexis.list1;

import java.util.Scanner;

public class Exercise9 {

	/**
	 * Do a program that asks a km quantity traveled for a rented car, and the days quantity of rent.
	 * Calculate the price to pay, knowing a car costs $60 per day and $0,15 for km traveled
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "UTF-8");
		System.out.println("Type percorred Kms:");
		double percorredKm = scanner.nextDouble();
		System.out.println("Type the rent days:");
		double rentDays = scanner.nextDouble();
		System.out.printf("Price to pay: %.2f %n", ((rentDays * 60) + (percorredKm * 0.15)));
		scanner.close();
	}

}
