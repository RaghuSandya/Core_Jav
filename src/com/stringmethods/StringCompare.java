package com.stringmethods;

public class StringCompare {
	public static void main(String[] args) {
		
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		String s3="Hello";
		String s4="'Hello";
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s3.equals(s4));//false
		
		System.out.println(s1==s2);//false
		System.out.println(s1==s2);//false
		System.out.println(s3==s4);//false
	}

}
