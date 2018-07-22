package com.printfmethod;

public class PrintfInJava {
	public static void main(String[] args) {
		int i,j,k;
		i=5;
		j=6;
		k=i+j;
		System.out.println("Addition of "+ i + " and "+ j +" numbers is " +k);
		
		System.out.printf("Addition of %d and %d is %d ",i,j,k);//Pass the format of Strings and Arguments. 
	}

}
