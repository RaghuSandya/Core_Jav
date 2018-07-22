package com.loop;

public class LabledBreak {
	public static void main(String[] args) {
		
		giddu://: Labeled
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				
				if(i==3)
					//only "break"Unlabeled break statement
					break giddu ; //Labeled Break
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

}
