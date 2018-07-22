package com.bitwise;

public class AndOr {
	public static void main(String[] args) {
		
		//AND--> 1 1 = 1
		
		//OR --> 0 1 = 1
		// |     0 0 = 0
		// |     0 1 = 1
		
		
		int a=25;// 1 1 0 0 1
		int b=15;// 0 1 1 1 1
		//OR        1 1 1 1 1  (31)
		//AND       0 1 0 0 1  (9)
		
		int c=a&b;
		System.out.println(c);
		
		
		int d=a|b;
		System.out.println(d);
	}

}
