package br.com.alexis.list1;

import java.util.Scanner;

public class Exercise7 {

	/**
	 * Do a program that ask for a degree in Celsius and convert it to Fahrenheit
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type the Celsius degree:");
		double celsiusDegree = scanner.nextDouble();
		System.out.printf("This Celsius degreee corresponds to %.2f Fahrenheit degrees %n", (9 * celsiusDegree / 5 + 32));
		scanner.close();
	}

}
