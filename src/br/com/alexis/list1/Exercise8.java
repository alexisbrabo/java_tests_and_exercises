package br.com.alexis.list1;

import java.util.Scanner;

public class Exercise8 {

	/**
	 * Do a program that ask for a degree in Fahrenheit and convert it to Celsius
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type the Celsius degree:");
		double fahrenheitDegree = scanner.nextDouble();
		System.out.printf("This Fahrenheit degreee corresponds to %.2f Celsius degrees %n",
				((fahrenheitDegree - 32) * 5 / 9));
		scanner.close();
	}
}
