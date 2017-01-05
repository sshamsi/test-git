package com.practice.misc;

public class PowerOf2Test {

    public static void main(String args[]) {

        int[] numbers = {4};//{0,1,2,6,8};
      
        for(int num: numbers){
            System.out.println("isPowerOfTwo()-- is " + num + " power of two in Java :" + isPowerOfTwo(num));
            //System.out.println("powerOfTwo()-- is " + num + " power of two in Java :" + powerOfTwo(num));
            //System.out.println("checkPowerOfTwo()-- is " + num + " power of two in Java :" + checkPowerOfTwo(num));
            System.out.println("-----------------------------------------------------------");
        }         

    }
    /*
     * checking if number is power of 2 using bit shift operator in java
     * e.g. 4 in binary format is "0000 0000 0000 0000 0000 0000 0000 0100";
     * and -4 is                  "1111 1111 1111 1111 1111 1111 1111 1100";
     * and 4&-4 will be           "0000 0000 0000 0000 0000 0000 0000 0100"
     */
    private static boolean isPowerOfTwo(int number) {
        if(number <0){
            throw new IllegalArgumentException("number: " + number);
        }
        if ((number & -number) == number) {
            return true;
        }
        return false;
    }
  
    /*
     * checking if number is power of 2 using brute force
     * starts with 1, multiplying with 2 it will eventually be same as original number
     */
    private static boolean powerOfTwo(int number){
        int square = 1;
        while(number >= square){
            if(number == square){
                return true;
            }
            square = square*2;
        }
        return false;
    }
  
    /*
     * find if an integer number is power of 2 or not using bit shift operator
     */
  
    private static boolean checkPowerOfTwo(int number){
         if(number <0){
            throw new IllegalArgumentException("number: " + number);
        }
        return ((number & (number -1)) == 0);
    }
}


