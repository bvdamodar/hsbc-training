package com.practice.lambda.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringOperations {

	public static void main(String[] args) {
			
		List<String> strings, strLength;
		
		//creating a String list of different lengths
		strings = new ArrayList<String>();	
		for (int i = 1; i < 11; i++) {
			strings.add("Dam"+(int)(Math.pow(10, i-1)));					
		}
		System.out.println("List: "+strings);
		
		//get list of their lengths
		strLength = strings.stream().map(s-> s.length()+"").collect(Collectors.toList());
		System.out.println("List with length: "+strLength);
				
		
	}

}
