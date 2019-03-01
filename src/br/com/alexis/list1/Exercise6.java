package br.com.alexis.list1;

import java.util.Scanner;

public class Exercise6 {

	/**
	 * Do a program that asks the distance (in km and the average speed in Km/h)
	 * and calculate the estimated time to go through this distance
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Type the distance in km:");
		double distance = scanner.nextDouble();
		System.out.println("Type the average speed in KM/H:");
		double averageSpeed = scanner.nextDouble();
		System.out.printf("The estimated time is %.2f hours %n",  (distance / averageSpeed));
		scanner.close();
	}

}
