package com.array;

import java.util.Random;

public class RandomClas {
	public static void main(String[] args) {
		Random r=new Random();
		
		int a[]=new int[20];
		
		for(int i=0;i<a.length;i++){
			a[i]=r.nextInt(20);
		}
		System.out.println(a[19]);
			for(int i:a)
				System.out.println(i);
			
		}
	}


