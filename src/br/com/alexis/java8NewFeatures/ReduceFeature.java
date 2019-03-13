package br.com.alexis.java8NewFeatures;

import java.util.Arrays;

public class ReduceFeature {

	public static void main(String[] args) {
		// initialize a int array
		int intArray[] = { 1, 1, 4, 5, 7, 8 };
		// print the sum of all elements in array
		System.out.println(Arrays.stream(intArray).sum());

		// Initialize a String array
		String[] stringArray = new String[] { "Alexis", "Brena", "Bilbo" };
		// print the concatenation of all elements in array
		System.out.println(Arrays.stream(stringArray).reduce("", (a, b) -> a + b));
	}

}
