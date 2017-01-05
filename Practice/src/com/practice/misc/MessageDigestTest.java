package com.practice.misc;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class MessageDigestTest {

	public static void main(String args[]) throws NoSuchAlgorithmException, UnsupportedEncodingException{
		String input = "Shazeb";
		char[] character = input.toCharArray();
		System.out.println(new String(character));
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(input.getBytes("UTF8"));
		System.out.println("hash "+Base64.getEncoder().encodeToString(md.digest()));
		
        md = MessageDigest.getInstance("MD5");
		md.update(input.getBytes("UTF8"));
		System.out.println("hash "+Base64.getEncoder().encodeToString(md.digest()));

	}
}
