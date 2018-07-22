package com.programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Duplicatenames {
	public static void main(String[] args) {
		
		ArrayList<String>name = new ArrayList<>();
		name.add("Navin");
		name.add("GIDDU");
		name.add("Navin");
		name.add("GIDDU");
		
		Set<String>s=new HashSet<>();
		
		for(String names:name){
			if(s.add(names)==false){
				System.out.println(names);
			}
			
		}
	}

}
