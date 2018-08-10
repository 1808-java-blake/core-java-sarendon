package com.revature.eval.java.core;

import java.util.ArrayList;
import java.util.List;

public class Homework1 {

	public static void main(String[] args) {
		//Homework1 Test = new Homework1();
		String a = encode("a b");

	}// end of class

	public static String encode(String string) {

		String s = string;
		s = s.replaceAll(" ", "");
		char [] chararray = s.toCharArray();
		
		List<Integer> ints = new ArrayList<>();
				
		for(int i= 0;i<chararray.length; i++) {
			int ascii = (int) chararray[i];
			ascii= 219 - ascii;
			chararray[i] = (char) ascii;
		}
			
		
		return chararray.toString();
	}
}
