package com.postandpreincrements;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Increments {
	public static void main(String[] args) {
		int i=7;
		int j=i++;//
		// i++ --> is Post Increment
		// ++i --> is Pre Increment 
		
		System.out.println(j+ " and " +i);
		
		int a =5;
		 int temp;
		 temp=a;
		 a++;
		 a=temp;
		  
		 a=a++;
		 System.out.println(a);
		
	}

}
