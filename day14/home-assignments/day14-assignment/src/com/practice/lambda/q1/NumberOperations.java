package com.practice.lambda.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NumberOperations {

	public static void main(String[] args) {
			
		List<Integer> nums ,evens, odds;
		
		//creating list from 10-40
		nums = new ArrayList<Integer>();	
		for (int i = 10; i < 41; i++) {
			nums.add(i);			
		}
		System.out.println("List: "+nums);
		
		//odd numbers list
		odds=nums.stream().filter(n-> (n%2 !=0)).collect(Collectors.toList());
		System.out.println("Odd Numbers List: "+odds);

		//sum of even numbers using reduce
		//even numbers list
		evens=nums.stream().filter(n-> (n%2 ==0)).collect(Collectors.toList());
		int sum = evens.stream().mapToInt(n-> n).reduce((a,b)->a+b).getAsInt();
		System.out.println("Sum of even numbers is "+sum);
		
		//maximum of odd numbers
		int maxOdd = odds.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Maximum of odd numbers is "+maxOdd);
		
		
	}

}
