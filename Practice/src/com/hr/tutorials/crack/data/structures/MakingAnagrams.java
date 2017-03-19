package com.hr.tutorials.crack.data.structures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakingAnagrams {
	
    public static int numberNeeded(String first, String second) {
        List<Character> firstList = new ArrayList<Character>();  
        for(int i=0 ; i<first.length() ; i++){
            firstList.add(first.charAt(i));
        }
          
        List<Character> secondList = new ArrayList<Character>();
        for(int i=0 ; i<second.length(); i++){
            secondList.add(second.charAt(i));
        }
        
        int length = firstList.size() < secondList.size() ? firstList.size() : secondList.size();
          
        for(int i=0 ; i<length ; i++){
            Character character = new Character(first.charAt(i));
            if(secondList.remove(character)){
                firstList.remove(character);
            }
        }
          
        return firstList.size() + secondList.size();  
      }
    
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          String a = in.next();
          String b = in.next();
          in.close();
          System.out.println(numberNeeded(a, b));
      }

}
