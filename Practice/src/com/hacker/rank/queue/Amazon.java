package com.hacker.rank.queue;

import java.util.HashSet;
import java.util.Set;

public class Amazon {

	public static void main(String[] args) {
		//System.out.println("Hello World");
		String str = "He had	had,quite:enough;of-this.nonsense";
		//str.
	    //String reg = "((?<=[<=|>=|==|\\+|\\*|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\-|<|>|/|=]))";
	    String[] words = str.split("[ ]|[\t]|[,]|[:]|[;]|[-]|[.]");
	    Set<String> setOfWords = new HashSet<String>();
	    for(String word : words)
	    {
            if(!setOfWords.add(word)){
            	System.out.println(word);
            	return;
            }
	    }

	}

}
