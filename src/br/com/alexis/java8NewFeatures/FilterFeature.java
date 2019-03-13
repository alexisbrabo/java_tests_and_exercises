package br.com.alexis.java8NewFeatures;

import java.util.Arrays;

public class FilterFeature {

	public static void main(String[] args) {
		// Initialize first array
		String[] stringArray = new String[] { "Alexis", "Brena", "Bilbo" };
		//Filter only string with length bigger than 5
		String[] stringMoreThan5CaractersArray = Arrays.stream(stringArray).filter(s -> s.length() > 5).toArray(String[]::new);
		
		//print array filtered
		System.out.println(Arrays.toString(stringMoreThan5CaractersArray));
		
	}

}
