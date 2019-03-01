package br.com.alexis.list1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type percorred Kms:");
		double cigarssmoked = scanner.nextDouble();
		System.out.println("Type the rent days:");
		double rentDays = scanner.nextDouble();
		System.out.printf("Price to pay: %.2f %n", ((rentDays * 60) + (percorredKm * 0.15)));
		scanner.close();
	}

}
