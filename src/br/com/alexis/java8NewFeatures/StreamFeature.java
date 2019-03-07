package br.com.alexis.java8NewFeatures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFeature {

	public static void main(String[] args) {
		// Create ArrayList
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(2);
		numberList.add(5);
		numberList.add(1);

		// convert it to a Stream
		Stream<Integer> myStreamFromList = numberList.stream();

		// Create Array
		Integer[] numberArray = { 2, 5, 1, 7 };

		// convert it to Stream
		Stream<Integer> myStreamFromArray = Arrays.stream(numberArray);

		System.out.println("Stream from List");
		myStreamFromList.forEach(System.out::println);

		System.out.println("Stream from Array");
		myStreamFromArray.forEach(System.out::println);
	}

}
