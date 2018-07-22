package com.controlstatement;

public class Switch {
	public static void main(String[] args) {
		
		int i=3;
		switch(i){
		
		case 1:
			System.out.println("one");
		
		case 2:
			System.out.println("two");
			
		case 8:
			System.out.println("Eight");
			break;
			
		case 10:
			System.out.println("Ten");
			break;
			
		default:
			System.out.println("Some Number");
		}
	}

}
