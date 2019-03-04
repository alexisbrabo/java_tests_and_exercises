package br.com.alexis.list1;

import java.math.BigDecimal;

public class Exercise11 {

	/**
	 * Do a program to determine how many digits is in 2 to the power of 1000000
	 * @param args
	 */
	public static void main(String[] args) {
		BigDecimal number = new BigDecimal(2);
		System.out.println(number.pow(1000000).toString().length());
	}

}
