package com.practice.misc;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		for(int i=1; i<=1000 ; i++){
			if(isPrime(i)){
				System.out.print(i+" ");
			}
		}
	}
	
	public static boolean isPrime(int number){
		if(number%2==0){
			return false;
		}
		for(int i=3 ; i<number ; i+=2){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
	
}
