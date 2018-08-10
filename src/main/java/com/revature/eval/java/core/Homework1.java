package com.revature.eval.java.core;

import java.util.Arrays;

public class Homework1 {

	public static void main(String[] args) {
		Homework1 Test = new Homework1();
		Test.isPangram("");

	}// end of class

	public boolean isPangram(String string) {

		boolean check = false;
		String s = string;

		int[] a = new int[26];
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				if (a[s.charAt(i) - 65] == 0)
					count++;
				a[s.charAt(i) - 65]++;
			} else if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				if (a[s.charAt(i) - 97] == 0)
					count++;
				a[s.charAt(i) - 97]++;
			}
		}

		if (count == 26) {
			System.out.println("pangram");
			check = true;
		}

		else
			System.out.println("not pangram");
		check = false;

		return check;
	}

}
