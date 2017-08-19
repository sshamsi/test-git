package com.daon.arrays;

import java.util.Arrays;

import org.junit.Test;

public class MergeTwoUnsorted {
	
	@Test
	public void test1(){
		int a[] = {10, 5, 15};
		int b[] = {20, 3, 2};
		int c[] = mergeAndSort(a,b);
		System.out.println(Arrays.toString(c));
	}
	
	public int[] mergeAndSort(int[] a, int[] b){
		int[] c = new int[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		Arrays.sort(c);
		return c;
	}

}
