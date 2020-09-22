package com.hsbc.training.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {
		
		HashSet animals = new HashSet(); 			
		animals.add("sheep");
		animals.add("goat");
		animals.add("ant");
		animals.add("eagle");
		animals.add("hen");
		animals.add("lion");
		System.out.println(animals);

		System.out.println("ant? "+animals.contains("ant"));
		System.out.println("lion? "+animals.contains("lion"));
		System.out.println("peacock? "+animals.contains("peacock"));
		
		animals.remove("goat");
		System.out.println(animals);
				
		Iterator<String> itr = animals.iterator();
		
		while(itr.hasNext()){
			String n = itr.next();
			n = "Its "+n;
			System.out.println(n);
		}
		
//		String s="";
		for(Object s : animals) {
			System.out.println(s+"");
		}
		
		System.out.println(animals);
		
	}
}
