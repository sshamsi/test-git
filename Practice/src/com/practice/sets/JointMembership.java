package com.practice.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class JointMembership {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1,2,2,3,4,5);
		List<Integer> b = Arrays.asList(4,5,5,6,7,8);
		//listCommonElements(a,b);
		//listElementsInAButNotInB(a,b);
		listElementsInBButNotInA(a,b);
		//listUniqueElements(a,b);

	}
	
	public static void listCommonElements(List<Integer> a, List<Integer> b){
		Set<Integer> set1 = new HashSet<Integer>(a);
		Set<Integer> set2 = new HashSet<Integer>(b);
		System.out.println(set1);
		System.out.println(set2);
		set1.retainAll(set2);
		System.out.println(set1);
	}
	
	public static void listUniqueElements(List<Integer> a, List<Integer> b){
		Set<Integer> set1 = new HashSet<Integer>(a);
		Set<Integer> set2 = new HashSet<Integer>(b);
		System.out.println(set1);
		System.out.println(set2);
		set1.addAll(set2);
		System.out.println(set1);
	}
	
	public static void listElementsInAButNotInB(List<Integer> a, List<Integer> b){
		Set<Integer> set1 = new HashSet<Integer>(a);
		Set<Integer> set2 = new HashSet<Integer>(b);
		System.out.println(set1);
		System.out.println(set2);
		set1.removeAll(set2);
		System.out.println(set1);
	}	
	
	public static void listElementsInBButNotInA(List<Integer> a, List<Integer> b){
		Set<Integer> set1 = new HashSet<Integer>(a);
		Set<Integer> set2 = new HashSet<Integer>(b);
		System.out.println(set1);
		System.out.println(set2);
		set2.removeAll(set1);
		System.out.println(set2);
	}		
	

}
