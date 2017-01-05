package com.hacker.rank.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class LongestUniqueSubArray {
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        int []chk=new int[10000002];
        int maxUnique = 0, cur = 0;

        boolean flag = false;
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();;

            if (deque.size() < m) {
                if (chk[num]==0) 
                    cur++;

                chk[num]++;
                deque.addLast(num);
            } else {
                int temp = (int) deque.peekFirst();
                deque.removeFirst();
                chk[temp]--;

                if (chk[temp]==0) cur--;
                if (chk[num]==0)cur++;

                chk[num]++;
                deque.addLast(num);
                flag = true;
            }
            if (flag) {
                maxUnique = Math.max(maxUnique, cur);
            }
        }
         maxUnique = Math.max(maxUnique, cur);
        System.out.println(maxUnique);

    }

	public static void main1(String[] args) {
		
		System.out.println(longestSubArray(new int[]{5,3,5,2,1}));
	}
	
	public static int longestSubArray(int[] sample){
		List<Integer> list = new ArrayList<Integer>();
		int longest=0;
		int i,j=0;
		do{
			i=j;
			while(i<sample.length){
				if(!list.contains(sample[i])){
					list.add(sample[i]);
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
		while(longest<sample.length-j);
		return longest;
	}	

}
