package com.practice.sort;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	
	public static void main(String args[]){
		List<Integer> unsorted = new ArrayList<Integer>();
		unsorted.add(8);
		unsorted.add(7);
		unsorted.add(6);
		unsorted.add(5);
		unsorted.add(4);
		unsorted.add(3);
		unsorted.add(2);
		unsorted.add(1);
		List<Integer> sorted = mergesort(unsorted);
		sorted.forEach(System.out::println);
	}
	
	
	public static List<Integer> mergesort(final List<Integer> values) {
		if (values.size() < 2) {
			return values;
		}
		final List<Integer> leftHalf = values.subList(0, values.size() / 2);
		final List<Integer> rightHalf = values.subList(values.size() / 2,
				values.size());
		return merge(mergesort(leftHalf), mergesort(rightHalf));
	}

	private static List<Integer> merge(final List<Integer> left,
			final List<Integer> right) {
		int leftPtr = 0;
		int rightPtr = 0;
		final List<Integer> merged = new ArrayList<>(left.size() + right.size());
		while (leftPtr < left.size() && rightPtr < right.size()) {
			if (left.get(leftPtr) < right.get(rightPtr)) {
				merged.add(left.get(leftPtr));
				leftPtr++;
			} else {
				merged.add(right.get(rightPtr));
				rightPtr++;
			}
		}
		while (leftPtr < left.size()) {
			merged.add(left.get(leftPtr));
			leftPtr++;
		}
		while (rightPtr < right.size()) {
			merged.add(right.get(rightPtr));
			rightPtr++;
		}
		System.out.println(merged);
		return merged;
	}

}
