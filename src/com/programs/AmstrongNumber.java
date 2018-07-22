package com.programs;

public class AmstrongNumber {
	public static void main(String[] args) {
		
		int n=155,temp=n,r,sum=0;
		
		while(n>0){
			
			r=n%10;
			n=n/10;
			sum=sum + r*r*r;
		}
		if(n==sum)
			System.out.println("Given number is an Amstrong number..");
		else
			System.out.println("Given number is not an Amstrong Number..");
		
	}

}
