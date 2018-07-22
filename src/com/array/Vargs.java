package com.array;


public class Vargs {
	public static void main(String[] args) {
		
		Display d=new Display();
		d.show(5);
	}

}
class Display{
	public void show(int...i ){
		for(int a:i)
		System.out.println(a);
	}
	public void show(int a ){
		System.out.println(a +" Shows an a ");// It will take Exact method name 
	}
}
