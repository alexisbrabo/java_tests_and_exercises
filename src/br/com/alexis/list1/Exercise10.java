package br.com.alexis.list1;

import java.util.Scanner;

public class Exercise10 {

	/**
	 * Do a program to calculate the reduction of lifetime of a smoker. Ask a quantity of cigars smoked per day and 
	 * years smoked. Considerate  that a smoker loses 10 minutes of lifetime each cigar.
	 * Show the days total.
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Cigars Smoked per day:");
		double cigarsSmoked = scanner.nextDouble();
		System.out.println("Years Smoking:");
		double yearsSmoking = scanner.nextDouble();
		System.out.printf("Days lost: %.2f %n", ((yearsSmoking * 365 * cigarsSmoked * 10) / 1440));
		scanner.close();
	}

}
