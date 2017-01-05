package com.hacker.rank.queue;

public class AmazonMergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{2,4,5,9,9};
		int[] b = new int[]{0,1,2,3,4};
		int[] c = merge(a,b);
		System.out.println(c);
		for(int i=0; i<c.length; i++){
			System.out.println(c[i]);
		}

	}
	
	
	public static int[] merge(int[] a, int[] b) {
	
	    int[] merge = new int[a.length + b.length];
	    int i=0;
	    int j=0;
	    int k=0;
	
	    while (i < a.length && j < b.length)
	    {
	        if (a[i] < b[j])       
	            merge[k++] = a[i++];
	
	        else        
	            merge[k++] = b[j++];               
	    }
	
	    while (i < a.length)  
	        merge[k++] = a[i++];
	
	
	    while (j < b.length)    
	        merge[k++] = b[j++];
	
	    return merge;
	}

}
