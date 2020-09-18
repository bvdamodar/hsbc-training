package com.demo.exceptions;

import javax.management.RuntimeErrorException;

public class nums {

	public static void main(String[] args) {

		try {
			int[] nums = {1,2,3,4};
//			System.out.println(nums[4]);
				
			String[] names = new String[5];
			names[2].length();
			
			throw new RuntimeException();
		} catch (Exception e) {
			
			System.out.println(e);
		}finally {
			System.out.println("Final Block.");
		}
	}

}
