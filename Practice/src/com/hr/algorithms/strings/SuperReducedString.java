package com.hr.algorithms.strings;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * @author sshamsi
 * Problem: https://www.hackerrank.com/challenges/reduced-string/problem
 * Delete any pair of adjacent letters with same value.
 * Repeat the above operation as many times as it can be performed. 
 * Examples:
 * aaabccddd should become abd
 * aa should become empty string
 * baab should become empty string
 */
public class SuperReducedString {

	/**
	 * brute force solution
	 * @param s
	 * @return reduced string
	 */
	 static String super_reduced_string(String s){
		   
	        StringBuilder sb = new StringBuilder(s);
	        
	        int i=0;
	        while(i<sb.length()-1){
	            if(sb.charAt(i)==sb.charAt(i+1)){
	                sb.deleteCharAt(i);
	                sb.deleteCharAt(i);
	                i = 0;
	            }
	            else{
	            	i++;
	            }
	        }
	        
	        if(sb.length()==0){
	        	return "Empty String";
	        }
	        else{
	        	return sb.toString();
	        }
	        
	    }
	 
		/**
		 * 
		 * efficient stack solution
		 * @param s
		 * @return reduced string
		 */
		 static String super_reduced_string_stack(String s){
			   
			   Deque<Character> stack = new ArrayDeque<Character>();
			   
			   for(int i=0; i<s.length() ;i++){
				   if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
					   stack.pop();
				   }
				   else{
					   stack.push(s.charAt(i));
				   }
			   }
			   
			   StringBuilder sb = new StringBuilder();
			   while(!stack.isEmpty()){
				   sb.append(stack.pop());
			   }
			 
			   if(sb.length()==0){
		        	return "Empty String";
		        }
		        else{
		        	return sb.reverse().toString();
		        }
		        
		    }

	    public static void main(String[] args) {
	        String s = "aaabccddd";
	        String result = super_reduced_string_stack(s);
	        System.out.println(result);
	    }

}
