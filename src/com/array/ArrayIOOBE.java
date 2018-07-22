package com.array;

import java.util.Random;

public class ArrayIOOBE {
	public static void main(String[] args) {
		
		Random r=new Random();
		
		int a[]=new int[22];
		for(int i=0;i<a.length;i++){
			a[i]=r.nextInt(22);
		}
		try{
		System.out.println(a[25]);
		}catch(Exception e){
			System.out.println("max value of array is 21 ");
		}
		for(int i:a)
			System.out.println(i);
	}

}
