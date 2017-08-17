package com.daon.arrays;

import java.util.Arrays;

import org.junit.Test;

public class MergeTwoSorted {
	
	@Test
	public void test1(){
		int a[] = {5, 10, 15};
		int b[] = {2, 3, 20};
		int c[] = merge(a,b);
		System.out.println(Arrays.toString(c));
	}
	
	public int[] merge(int[] a, int[] b){
		int[] c = new int[a.length + b.length];
		
		int i=0,j=0,k=0;
		
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				c[k++] = a[i++];
			}
			else{
				c[k++] = b[j++];
			}
		}
		
		while(i<a.length){
			c[k++] = a[i++];
		}
		
		while(j<b.length){
			c[k++] = b[j++];
		}
		
		return c;
	}

}
