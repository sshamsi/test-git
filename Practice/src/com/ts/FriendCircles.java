package com.ts;

import java.util.Scanner;

public class FriendCircles {
	
	   public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        scan.nextLine();
	        char[][] friends = new char[n][n];
	        
	        for(int i=0 ; i<n ;i++){
	            String line = scan.nextLine();
	            for(int j=0 ; j<n ;j++){
	                friends[i][j] = line.charAt(j);
	            }
	        }
	        
	        System.out.println(findCircles(friends));
	    }
	    
	    public static int findCircles(char[][] friends){
	        
	        int circles = 0;
	        
	        for(int i=0 ; i<friends.length ; i++){
	            for(int j=i+1 ; j<friends.length ;j++){
	                if(friends[i][j]=='Y'){
	                    break;
	                }
	                System.out.println(i+" "+j);
	                circles++;
	            }
	            
	        }
	        
	        return circles;
	    }

}
