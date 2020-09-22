package com.hsbc.training.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ListDemo {//implements Comparable<String>{

	
	public static void main(String[] args) {

		ArrayList<String> cities = new ArrayList<>();  //Resizable list
		cities.add("Delhi");
		cities.add("Chennai");
		cities.add("Mumbai");
//		System.out.println(cities);
		
		cities.add(0,"Vizag");			//add by index
		cities.add(2,"Goa");		
//		System.out.println(cities);

		cities.remove(3);				//Chennai
//		System.out.println(cities);
				
		
		//to sort
		System.out.println(cities);
		Collections.sort(cities,new MyListSorter());
		System.out.println("After sort : "+cities);
		
		
	}
}

class MyListSorter implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
}
