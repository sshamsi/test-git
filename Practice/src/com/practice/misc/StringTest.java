package com.practice.misc;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringTest {

	@Test
	public void test() {
		String line = "Shazeb_123_Shamsi";
		System.out.println(line.replaceAll("123", "456"));
	}

}
