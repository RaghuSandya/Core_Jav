package com.programs;
	/*6
	28*/
public class PerfectNumber {
	public static void main(String[] args) {
		
		int n=6;
		boolean b=isPerfect(n);
		
		if(b)
			System.out.println("number is perfect..");
		else
			System.out.println("Not perfect..");
	}

	private static boolean isPerfect(int n) {
		
		int sum=0;
		for(int i=1;i<5;i++){
			if(n%i==0)
				sum=sum+i;
	 	}
		if(n==sum)
			return true;
		return false;
	}

	
	}


