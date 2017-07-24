package com.hr.algorithms.bit.manipulation;

import java.util.Scanner;

public class MaximizingXOR {
	
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
    
    /*
     * ^ is an xor sign
     * Any number xor'd with itself will give zero.
     * Any number xor'd with zero will give the number.
     */
    static int maxXor(int l, int r) {
        int max=0;
        
        for(int i=l ; i<=r ; i++){
            for(int j=l ; j<=r ; j++){
                max = Math.max(max, i^j);   
            }
        }
        return max;
    }

}
