package com.revature.eval.java.core;

import java.util.Arrays;

public class Homework1 {

	public static void main(String[] args) {
		Homework1 Test = new Homework1();
		Test.isLuhnValid("046 454 286");

	}// end of class

	public boolean isLuhnValid(String string) {
		// TODO Write an implementation for this method declaration
		
		String s = string;
		s = s.replaceAll("-", " ");
		s = s.replaceAll(" ", "");
		String[] numbers = s.split("");
		int[] doubleval = new int[s.length()];
		int add = 0;
		
		System.out.println("This is s : " + s);
		System.out.println(Arrays.toString(numbers));
		
		boolean check = s.matches(".*\\D+.*");
		
		if(check == true) {
			return false;
		}
		
		for(int i = 0; i < s.length(); i++) {
		
	
			doubleval[i] = Integer.parseInt(numbers[i]);
			//System.out.println("This is new value before: " + doubleval[i]);
			
			if(i%2 != 0) {
				System.out.println("number at index will be doubled : "+ doubleval[i]);
				doubleval[i] = doubleval[i]*2;
				System.out.println("number at index was doubled : "+ doubleval[i]);
				
				if(doubleval[i] > 9) {
					System.out.println("The number doubled is greater than 9 : " + doubleval[i]);
					doubleval[i] = doubleval[i] - 9;
					System.out.println("The number has been fixed : " + doubleval[i]);
				}	
			}
			
		}
		
		System.out.println("This is the altered array : " + Arrays.toString(doubleval));
		
		for(int j = 0; j<doubleval.length;j++) {
			add = add + doubleval[j];
			System.out.println("This is add: " + add);
		}
		
		if(add%10 == 0) {
			System.out.println("This is confirmed");
			return true;
		}
		
		
		return false;
	}

}
