package br.com.alexis.list1;

import java.util.Scanner;

public class Exercise1 {
	
	/**
	 * Do a program that asks two integers numbers and print the sum of this numbers
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type the first number:");
		int number1 = scanner.nextInt();
		System.out.println("Type the second number");
		int number2 = scanner.nextInt();
		scanner.close();
		System.out.println("The sum is " + (number1 + number2));
	}
}
