package com.ts;

import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
        String[] words = new String[]{"a", "b", "ba"};
        int longestChain = longest_chain(words);
        System.out.println("longestChain " + longestChain);
    }

    static int longest_chain(String words[]) {
        int max = Integer.MIN_VALUE;
        for (String word:words) {
            int curr = findNextWord(words, word, 0); 
            max = Math.max(max, curr);
        }
        return max;
    }

    static int maxStack=0;

    static int findNextWord(String[] words, String word, int stack) {
    	
    	
    	System.out.println("word "+word);
        if (!Arrays.stream(words).anyMatch(word::contains)) {
            return 0;
        }
        stack++; 
        maxStack = stack;
        System.out.println("1 stack "+stack+" maxStack "+maxStack);
        for (int i = 0; i < word.length(); i++) {
            StringBuilder sb = new StringBuilder(word);
            sb.delete(i, i + 1);
            findNextWord(words, sb.toString(), stack);
        }
        System.out.println("2 stack "+stack+" maxStack "+maxStack);
        
        return maxStack;
    }

    static boolean contains(String[] words, String wordToSearch) {
        for (String currentWord : words) {
            if (currentWord.equals(wordToSearch)) {
                return true;
            }
        }
        return false;
    }

}
