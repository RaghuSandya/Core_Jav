package com.programs;

public class Polindrome {
	public static void main(String[] args) {
		
		int n=231,r,s=0;
		int t=n;
		while(n>0){
			
			r=n%10;
			n=n/10;
			s=s*10+r;
		}
		if(t==s)
			System.out.println("Given number is polindrome...");
		else
			System.out.println("Given number is not a polindrome..");
	}
	

}
