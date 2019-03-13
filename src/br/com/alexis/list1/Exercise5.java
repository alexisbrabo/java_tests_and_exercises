package br.com.alexis.list1;

import java.util.Scanner;

public class Exercise5 {

	/**
	 * Do  program that asks a value of a product, a discount (in percentage)
	 * and show the discount value in $ and the new value of the product
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in, "UTF-8");
		System.out.println("Type the value:");
		double value = scanner.nextDouble();
		System.out.println("Type the discount percentage:");
		double discount = scanner.nextDouble();
		System.out.printf("The discount value is %.2f and the value to pay is %.2f %n",  (discount * value / 100), (value - (discount * value / 100)));
		scanner.close();
	}

}
