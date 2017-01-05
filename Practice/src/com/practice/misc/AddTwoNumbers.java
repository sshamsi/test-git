package com.practice.misc;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AddTwoNumbers {

	public static void main(String[] args) {
		 System.out.println(add(45,20.23));

	}
	
	public static BigDecimal add(Number a, Number b){
		if(a==null || b==null){
			throw new IllegalArgumentException("Number cannot be null");
		}
		BigDecimal x = new BigDecimal(a.doubleValue()).setScale(2,RoundingMode.HALF_UP);
		BigDecimal y = new BigDecimal(b.doubleValue()).setScale(2,RoundingMode.HALF_UP);
		BigDecimal result = x.add(y);
		return result;
	}

}
