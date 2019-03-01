package br.com.alexis.list1;

import java.util.Scanner;

public class Exercise2 {
	
	/**
	 * Do a program that asks a value in millimeters and convert to meters
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type the value in milimeters:");
		double mm = scanner.nextDouble();
		System.out.printf("The values corresponds to %.2f meters %n", (mm * 1000));
		scanner.close();
	}
}
