package com.controlstatement;

import java.util.Scanner;

public class IfElseDemo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number...");
		int n=sc.nextInt();
		
		if(n%2==0){
			System.out.println("The Given number is Even");
		}else{
			System.out.println("The Given is Odd ");
		}
	}

}
