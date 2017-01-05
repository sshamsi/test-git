package com.practice.misc;

import java.math.BigInteger;
import java.util.Scanner;

import org.junit.Test;

public class BigIntegerTest {
	
	@Test
	public void bigIntegerOperation(){
		Scanner scan = new Scanner(System.in);
		String input1 = scan.next();
		String input2 = scan.next();
		scan.close();
		if(input1.isEmpty() || input2.isEmpty()){
			return;
		}
		try{
			BigInteger a = new BigInteger(input1);
			BigInteger b = new BigInteger(input2);
			System.out.println(a.add(b));
			System.out.println(a.multiply(b));
		}
		catch(NumberFormatException nfe){
			System.out.println("Number Format Exception occurred.");
			return;
		}
	}

}
