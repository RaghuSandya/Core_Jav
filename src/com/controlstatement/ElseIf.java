package com.controlstatement;

public class ElseIf {
	
	public static void main(String[] args) {
		
		int a,b,c;
		a=4;
		b=25;
		c=6;

		if((a>b)&&(a>c))
			System.out.println(a);
		
		else if((b>c))	
			System.out.println(b);
		
		else
			System.out.println(c);
			
	}
}
