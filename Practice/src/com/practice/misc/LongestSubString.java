package com.practice.misc;

import java.util.ArrayList;
import java.util.List;

public class LongestSubString {

	public static void main(String[] args) {
	
		System.out.println(longestSubString("abcdefghijklmnopq"));
	}
	
	public static int longestSubString(String sample){
		List<Character> list = new ArrayList<Character>();
		int longest=0;
		int i,j=0;
		do{
			i=j;
			while(i<sample.length()){
				if(!list.contains(sample.charAt(i))){
					list.add(sample.charAt(i));
					i++;
					longest = list.size();
				}
				else{
					list.clear();
					break;
				}
			}
			j++;
		}
		while(longest<sample.length()-j);
		return longest;
	}	

}
