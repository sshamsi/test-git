package com.ts;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		
		
		String[] friendsString = new String[]{"YYNN","YYYN","NYYN","NNNY"}; 
		
		char[][] friends = convertto2DCharArray(friendsString);
		
		System.out.println(Arrays.deepToString(friends));
		
		int length = getFriendCircles(friends);
		
		System.out.println(length);

	}
	
	public static int getFriendCircles(char[][] friends) {
			
			        if (friends == null || friends.length < 1)
			            return 0;
			
			        int noOfCircles = 0;
			
			        boolean visited[] = new boolean[friends.length];
			
			        for (int i = 0; i < visited.length; i++)
			            visited[i] = false;
			
			        for (int i = 0; i < friends.length; i++) {
			        	// Skip 
			            if (!visited[i]) {
			                noOfCircles++;
			                visited[i] = true;
			                findFriends(friends, visited, i);
			            }
			        }
			
			        return noOfCircles;
		
			    }
			
    public static void findFriends(char[][] friends, boolean[] visited, int id) {

        for (int i = 0; i < friends.length; i++) {
            if (!visited[i] && i != id && 'Y' == friends[id][i]) {
                visited[i] = true;
                findFriends(friends, visited, i);
            }
        }

    }
    
    public static char[][] convertto2DCharArray(String friends[]){
    	
    	char[][] result = new char[friends.length][];
    	
    	for(int i=0; i<friends.length; i++){
    		result[i] = new char[friends[i].length()];
    		for(int j=0; j<friends[i].length(); j++){
    			result[i][j] = friends[i].charAt(j);
    		}
    	}
    	
    	return result;
    	
    }

}
