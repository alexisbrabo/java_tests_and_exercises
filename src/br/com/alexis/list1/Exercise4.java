package br.com.alexis.list1;

import java.util.Scanner;

public class Exercise4 {

	/**
	 * Do a program that asks a salary, a raise (in percentage)
	 * and show the raise value and the new salary in $
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type the salary:");
		double salary = scanner.nextDouble();
		System.out.println("Type the raise in percentage:");
		double raise = scanner.nextDouble();
		System.out.printf("The raise value is %.2f and the new salary is %.2f %n",  (raise * salary / 100), ((raise * salary / 100) + salary));
		scanner.close();
	}

}
