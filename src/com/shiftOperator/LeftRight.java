package com.shiftOperator;

public class LeftRight {
	public static void main(String[] args) {
		
		int a=8;// 1 0 0 0
		
		//Left Shift
		int b=a<<2; //  1 0 0 0 0 0  (32) added two digits before dot
		
		System.out.println(b);
		
		//Right shift
		int d=a>>2; // 1 0 0 0. dot shifted two digits before  and remove the digits so Ans is 1 0.0 0
		System.out.println(d);
	}

}
