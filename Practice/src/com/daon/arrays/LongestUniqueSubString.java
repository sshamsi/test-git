package com.daon.arrays;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubString {

	public static void main(String[] args) {
		
		System.out.println(longestSubString("shazebshamsi"));

	}
	
	public static int longestSubString(String input){
		
		int max=0, i=0, j=0;
		
		Set<Character> set = new HashSet<Character>();
		
		while(i<input.length() && j<input.length()){
			if(!set.contains(input.charAt(j))){
				set.add(input.charAt(j++));
				max = Math.max(max, j-i);
			}
			else{
				set.remove(input.charAt(i++));
			}
			System.out.println(set);
		}
		return max;
	}

}
