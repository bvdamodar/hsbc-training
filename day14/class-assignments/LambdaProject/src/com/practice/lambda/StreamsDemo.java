package com.practice.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
	
	public static void main(String[] args) {
		
		//Lambda Examples - Integer
		
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
						
		//to collect even and get max		
		nums.stream().filter(n-> (n%2 == 0)).forEach(System.out::println); // even's list
		System.out.println("Max is "+nums.stream().filter(n-> (n%2 == 0)).max((x,y)-> x.compareTo(y)).get()); // prints max
			
		//find sum of all numbers
		System.out.println("Sum of all numbers is "+nums.stream().mapToInt(n-> n).sum() ) ;		
		
			
			
		
		//Lambda Examples -String		
		
		List<String> names = Arrays.asList("ram","Shyam","Sam","Raghu","Shantanu","Shantha Bhai") ;

		
		//Find names starting with S
		names.stream().filter(s->s.startsWith("S")).forEach(System.out:: println);		
		
		//Find names starting with Sh, length > 7 .
		
		//printing them
		names.stream().filter(s->s.startsWith("Sh")).filter(s->s.length()>7).forEach(System.out:: println);
		//OR to save in a list
		List<String> names2 =names.stream().filter(s->s.startsWith("Sh")&&s.length()>7).collect(Collectors.toList());
		System.out.println(names2);		
		
		// make new list from the given list by adding prefix Hello to all names
		List<String> names3 =names.stream().map(s-> "Hello "+s).collect(Collectors.toList());
		System.out.println(names3);
	}
}

