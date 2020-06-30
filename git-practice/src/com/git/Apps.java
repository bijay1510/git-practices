package com.git;

public class Apps {

	public static void main(String[] args) {
		String str = "Hello World";
		System.out.println(reverseString(str));
	}
	
	private static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
