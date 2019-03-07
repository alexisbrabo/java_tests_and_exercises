package br.com.alexis.java8NewFeatures;

import java.util.Arrays;
import java.util.stream.Stream;

public class MapFeature {

	public static void main(String[] args) {
		//Initialize array
		String[] stringArray = new String[] {"Alexis", "Brena", "Bilbo"};
		//Convert Array to String
		Stream<String> stringStream = Arrays.stream(stringArray);
		
		//Create a new Stream transforming all Strings in stringStream to UpperCase
		Stream<String> uppercaseStringStream = stringStream.map(s -> s.toUpperCase());
		
		//Convert the Stream to Array
		String[] uppercaseStringArray = uppercaseStringStream.toArray(String[]::new);
		
		//Show the array with all Strings in UpperCase
		System.out.println(Arrays.toString(uppercaseStringArray));
	}
}