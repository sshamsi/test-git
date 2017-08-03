package com.ts;

import java.util.Arrays;
import java.util.List;

public class MaxChainLength {
	
	static int max=0;

	public static void main(String[] args) {
		 String[] words = {"bdca", "bda", "bca", "ba", "a", "b"};
	        
		    
        //int currentMax = longest_chain(words[0],words,words[0].length(), 0);
        longest_chain_old(words[0],words,words[0].length());
        //System.out.println("Longest Chain Length : " + currentMax);
        System.out.println("Longest Chain Length : " + max);

	}
	
	public static void longest_chain_old(String currentWord, String[] words, int maxChainLength){
		
		System.out.println("Current word is : " + currentWord);
		System.out.println("Current max is : " + max);
		
		List<String> wordsList = Arrays.asList(words);

		for(int i=0 ; i<currentWord.length() ; i++){
			if(max>=maxChainLength){
				break;
			}
			else if(currentWord.length()==1){
				if(wordsList.contains(currentWord)){
					max++;
				}
			}
			else{
				StringBuilder sb = new StringBuilder(currentWord);
				sb.deleteCharAt(i);
				if(wordsList.contains(sb.toString())){
					max++;
					longest_chain_old(sb.toString(), words, maxChainLength);
				}
			}
			
		}
		
	}
	
	public static int longest_chain(String currentWord, String[] words, int maxChainLength, int currentMax){
		
		System.out.println("Current word is : " + currentWord);
		System.out.println("Current max is : " + currentMax);
		
		List<String> wordsList = Arrays.asList(words);

		for(int i=0 ; i<currentWord.length() ; i++){
			if(currentMax>=maxChainLength){
				break;
			}
			else if(currentWord.length()==1){
				if(wordsList.contains(currentWord)){
					currentMax++;
				}
			}
			else{
				StringBuilder sb = new StringBuilder(currentWord);
				sb.deleteCharAt(i);
				if(wordsList.contains(sb.toString())){
					currentMax++;
					longest_chain(sb.toString(), words, maxChainLength, currentMax);
				}
			}
			
		}
		
		return currentMax;
		
	}
	

}
