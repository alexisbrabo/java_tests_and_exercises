package br.com.alexis.java8NewFeatures;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class MapFeature {

	public static void main(String[] args) {
		// Initialize first array
		String[] stringArray = new String[] { "Alexis", "Brena", "Bilbo" };
		// Convert Array to String
		Stream<String> stringStream = Arrays.stream(stringArray);

		// Create a new Stream transforming all Strings in stringStream to UpperCase
		Stream<String> uppercaseStringStream = stringStream.map(s -> s.toUpperCase(new Locale("pt", "BR")));

		// Convert the Stream to Array
		String[] uppercaseStringArray = uppercaseStringStream.toArray(String[]::new);

		// Show the array with all Strings in UpperCase
		System.out.println(Arrays.toString(uppercaseStringArray));

		// Initialize second array
		String[] stringArray2 = new String[] { "Alexis", "Brena", "Bilbo", "Adam", "Pantera" };

		// Same thing than above but with chained methods
		System.out.println(
				Arrays.toString(Arrays.stream(stringArray2).map(s -> s.toUpperCase(new Locale("pt", "BR"))).toArray()));
	}
}
