package com.hr.tutorials.crack.data.structures;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;


public class Anagrams {
	
	@Test
	public void test1(){
		Assert.assertTrue(isAnagram("shazeb", "hazbes"));
	}
	
	@Test
	public void test2(){
		Assert.assertFalse(isAnagram("shazeb", "shamsi"));
	}
	
	@Test
	public void test3(){
		Assert.assertFalse(isAnagram("shazeb", "shaze"));
	}
	
	public boolean isAnagram(String input1, String input2){
		int[] freq = new int[26];
		input1.chars().forEach(c -> freq[c - 'a']++);
		input2.chars().forEach(c -> freq[c - 'a']--);
		int result = Arrays.stream(freq).map(Math::abs).sum();
		System.out.println(result);
		if(result==0){
			return true;
		}
		else{
			return false;
		}
	}

}
