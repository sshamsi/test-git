package com.hr.tutorials.crack.concepts;

import java.util.Scanner;

public class Fibonacci {
	
	private static int count=0;

	public static int fibonacci(int n) {
		count++;
        // Complete the function.
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
        
    }
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
        System.out.println("count is "+count);
    }

}
