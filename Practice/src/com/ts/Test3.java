package com.ts;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		
		String quotes[] = new String[]{"1.1837", "1.3829", "0.6102"};
		double[] doubleValues = Arrays.stream(quotes)
                .mapToDouble(Double::parseDouble)
                .toArray();
		System.out.println("hello world");

	}

}
