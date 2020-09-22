package com.hsbc.training.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
//		HashSet names = new HashSet(); 			//Unsorted
//		TreeSet<String> names = new TreeSet(); //Sorts the data
		Set<String> names = new HashSet<>();   //Interface
		names.add("qw");
		names.add("er");
		names.add("ty");
		names.add("ui");
//		names.add(new Integer(123));

//		System.out.println(names.contains("ui"));
//		System.out.println(names.contains("op"));
//		System.out.println(names);
		
		names.remove("ui");
//		System.out.println(names);
		
		names.add("ui");
//		System.out.println(names);
		names.add("ui");
//		System.out.println(names);// no duplicates
		
		Iterator<String> itr = names.iterator();
		
		while(itr.hasNext()){
			String n = itr.next();
			n = "Hello "+n;
			System.out.println(n);
		}
		
		System.out.println(names);
		
	}
}
