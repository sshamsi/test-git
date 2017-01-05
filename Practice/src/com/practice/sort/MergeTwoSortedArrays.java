package com.practice.sort;

//import edu.emory.mathcs.backport.java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		int[] a = new int[]{2,4,6,8,10};
		int[] b = new int[]{1,3,5,7,9};
		int[] c = new int[a.length + b.length];
		
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length){
			if(a[i]>b[j]){
				c[k] = b[j];
				j++;
				k++;
			}
			else if(a[i]<b[j]){
				c[k] = a[i];
				i++;
				k++;
			}
		}
		
		while(i<a.length){
			c[k] = a[i];
			i++;
			k++;
		}
		
		while(j<b.length){
			c[k] = b[j];
			j++;
			k++;
		}
		
		//System.out.println(Arrays.toString(c));

	}

}
