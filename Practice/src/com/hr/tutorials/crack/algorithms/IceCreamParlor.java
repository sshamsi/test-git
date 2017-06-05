package com.hr.tutorials.crack.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class IceCreamParlor {

	public static int binarySearch(int first, int last, IceCream[] arr, int search) {
		if(first<last){
			int midpoint = (first + last)/2;
			
			if(search == arr[midpoint].flavor){
				return arr[midpoint].index;
			}
			
			if(search<arr[midpoint].flavor){
				return binarySearch(first, midpoint-1, arr, search);
			}
			else{
				return binarySearch(midpoint+1, last, arr, search);
			}
		}
		else if(first==last && arr[first].flavor==search){
			return arr[first].index;
		}
		else{
			return -1;
		}
	}

	public static void main(String[] args) {

		int t;
		int n, m;

		Scanner in = new Scanner(System.in);
		t = in.nextInt();
		for (int test = 0; test < t; test++) {

			m = in.nextInt();
			n = in.nextInt();
			IceCream[] arr = new IceCream[n];

			for (int i = 0; i < n; i++)
				arr[i] = new IceCream(in.nextInt(), i + 1);

			Arrays.sort(arr);
			for (int i = 0; i < n - 1; i++) {
				int search = m - arr[i].flavor;
				if (search >= arr[i].flavor) {
					int index = binarySearch(i + 1, n - 1, arr, search);
					if (index != -1) {
						System.out.println(Math.min(arr[i].index, index) + " " + Math.max(arr[i].index, index));
						break;

					}
				}
			}
		}

	}
	
}	

class IceCream implements Comparable<IceCream> {
	int flavor;
	int index;

	public IceCream(int flavor, int index) {
		this.flavor = flavor;
		this.index = index;
	}

	@Override
	public int compareTo(IceCream iceCream) {
		if (this.flavor < iceCream.flavor) {
			return -1;
		} else if (this.flavor > iceCream.flavor) {
			return 1;
		} else {
			return 0;
		}

	}

	@Override
	public boolean equals(Object o) {
		IceCream ic = (IceCream) o;
		if (this.flavor == ic.flavor) {
			return true;
		} else {
			return false;
		}
	}

}
