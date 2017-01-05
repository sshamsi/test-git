package com.practice.misc;

public class Average {
	
	private static final String N0_TRANSACTIONS_ERR = "No transactions found.";
	private static final String N0_POSITIVE_ERR = "No positive transactions found.";
 	
	public static void main(String args[]){
		
		Double[] d1 = new Double[]{-1.01, -1.01, 23.01, 40.61, 16.54, -23.00, 123.1, 55.0, 10.0, .9};
		Double[] d2 = new Double[]{-1.01, -1.01, -23.01, -40.61, -16.54, -23.00, -123.1, -55.0, -10.0, -.9, 0.0};
		Double[] d3 = new Double[]{};
		Double[] d4 = null;
		System.out.println(getStatistics(d1));
		
		
		//CreditCard cc = new CreditCard();
		//cc.setCardId(7);
		//System.out.println("cardId is "+cc.getCardId());
		//System.out.println("Hello World");
	}
	
	public static String getStatistics(Double[] inputValues){
		String average = "Average: ";
		
		if(inputValues==null || inputValues.length<1){
			return N0_TRANSACTIONS_ERR;
		}
		
		double sum = 0;
		int divisor = 0; 
		for(int i=0; i<inputValues.length ; i++){
			if (inputValues[i] > 0){
				sum = sum + inputValues[i];
				divisor++;
			}
		}
		if (divisor == 0){
			return N0_POSITIVE_ERR;
		}
		
		double averagePositiveTransactions = sum/divisor;
		return average+decimalFormatter(averagePositiveTransactions);
	}
	
	private static String decimalFormatter(Double value){
		return String.format("%.2f", value);
	}
	
}


