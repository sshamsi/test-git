package com.practice.misc;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Locale;

import org.junit.Test;

public class BigDecimalTest {

	@Test
	public void bigDecimalNumberFormat(){
		BigDecimal payment = new BigDecimal("1115.37");
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
		String s = n.format(payment);
		System.out.println(s);
	}
	
	@Test
	public void bigDecimalMutualFundTransaction() {
		BigDecimal shares = new BigDecimal("754.495");
		BigDecimal purchaseAmount = new BigDecimal("200.00");
		BigDecimal pricePerShare = new BigDecimal("10.38");
		BigDecimal sharesPurchased = purchaseAmount.divide(pricePerShare, 2, RoundingMode.HALF_UP);
		System.out.println("Shares Purchased: "+sharesPurchased);
		shares = shares.add(sharesPurchased);
		BigDecimal accountValue = shares.multiply(pricePerShare); 
		NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("Number of shares = " + shares.toString()); 
	    System.out.println("Account value = " + n.format(accountValue)); 
	}
	
	@Test
	public void average(){
		Double[] numbers = new Double[]{-1.01, -1.01, 23.01, 40.61, 16.54, -23.00, 123.1, 55.0, 10.0, .9};
		
		BigDecimal sum = new BigDecimal(0.0);
		int divisor = 0;
		for(Double num : numbers){
			if(num>0){
				sum = sum.add(new BigDecimal(num));
				divisor++;
			}
		}
		BigDecimal average = sum.divide(new BigDecimal(divisor), 2, RoundingMode.HALF_UP);
		System.out.println(average);
	}

}
