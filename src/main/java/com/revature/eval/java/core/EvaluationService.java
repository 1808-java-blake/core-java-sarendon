package com.revature.eval.java.core;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class EvaluationService {

	/**
	 * 1. Without using the StringBuilder or StringBuffer class, write a method that
	 * reverses a String. Example: reverse("example"); -> "elpmaxe"
	 * 
	 * @param string
	 * @return
	 */
	public String reverse(String string) {
		char[] reversed = new char[string.length()];
		for (int i = reversed.length - 1, j = 0; i >= 0; i--, j++) {
			reversed[j] = string.charAt(i);
		}
		return new String(reversed);
	}

	/**
	 * 2. Convert a phrase to its acronym. Techies love their TLA (Three Letter
	 * Acronyms)! Help generate some jargon by writing a program that converts a
	 * long name like Portable Network Graphics to its acronym (PNG).
	 * 
	 * @param phrase
	 * @return
	 */
	public String acronym(String phrase) {
		// Write an implementation for this method declaration
		String s = phrase;
		ArrayList<Character> A = new ArrayList<Character>();
		int l = s.length(); // length of string s
		String F = "";

		F += s.charAt(0);

		for (int i = 0; i < l - 1; i++) {

			if (s.charAt(i) == ' ' || s.charAt(i) == '-') {

				F += s.charAt(i + 1);

			}

		}

		F = F.toUpperCase();

		return F;
	}

	/**
	 * 3. Determine if a triangle is equilateral, isosceles, or scalene. An
	 * equilateral triangle has all three sides the same length. An isosceles
	 * triangle has at least two sides the same length. (It is sometimes specified
	 * as having exactly two sides the same length, but for the purposes of this
	 * exercise we'll say at least two.) A scalene triangle has all sides of
	 * different lengths.
	 *
	 */
	static class Triangle {
		private double sideOne;
		private double sideTwo;
		private double sideThree;

		public Triangle() {
			super();
		}

		public Triangle(double sideOne, double sideTwo, double sideThree) {
			this();
			this.sideOne = sideOne;
			this.sideTwo = sideTwo;
			this.sideThree = sideThree;
		}

		public double getSideOne() {
			return sideOne;
		}

		public void setSideOne(double sideOne) {
			this.sideOne = sideOne;
		}

		public double getSideTwo() {
			return sideTwo;
		}

		public void setSideTwo(double sideTwo) {
			this.sideTwo = sideTwo;
		}

		public double getSideThree() {
			return sideThree;
		}

		public void setSideThree(double sideThree) {
			this.sideThree = sideThree;
		}

		public boolean isEquilateral() {
			// TODO Write an implementation for this method declaration
			if ((sideOne == sideTwo) && (sideTwo == sideThree)) {
				// System.out.println("This Triangle is Equilateral");
				return true;

			} else {
				return false;
			}

		}

		public boolean isIsosceles() {
			// TODO Write an implementation for this method declaration
			if (sideTwo == sideThree && sideTwo != sideOne) {
				// System.out.println("This Triangle is Isoceles");
				return true;
			}
			if (sideOne == sideThree && sideOne != sideTwo) {
				// System.out.println("This Triangle is Isoceles");
				return true;
			}

			if (sideOne == sideTwo && sideThree != sideOne) {
				// System.out.println("This Triangle is Isoceles");
				return true;
			} else {
				return false;
			}
		}

		public boolean isScalene() {
			// TODO Write an implementation for this method declaration
			if ((sideOne != sideTwo) && (sideTwo != sideThree) && (sideThree != sideOne)) {
				// System.out.println("This Triangle is Scalene");
				return true;
			}

			else {
				return false;
			}
		}
	}

	/**
	 * 4. Given a word, compute the scrabble score for that word.
	 * 
	 * --Letter Values-- Letter Value A, E, I, O, U, L, N, R, S, T = 1; D, G = 2; B,
	 * C, M, P = 3; F, H, V, W, Y = 4; K = 5; J, X = 8; Q, Z = 10; Examples
	 * "cabbage" should be scored as worth 14 points:
	 * 
	 * 3 points for C, 1 point for A, twice 3 points for B, twice 2 points for G, 1
	 * point for E And to total:
	 * 
	 * 3 + 2*1 + 2*3 + 2 + 1 = 3 + 2 + 6 + 3 = 5 + 9 = 14
	 * 
	 * @param string
	 * @return
	 */
	public int getScrabbleScore(String string) {
		String s = string;
		int totalScore = 0;

		for (int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
			case 'A':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'a':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'B':
				totalScore = totalScore + 3;
				System.out.println(totalScore);
				break;
			case 'b':
				totalScore = totalScore + 3;
				System.out.println(totalScore);
				break;
			case 'C':
				totalScore = totalScore + 3;
				System.out.println(totalScore);
				break;
			case 'c':
				totalScore = totalScore + 3;
				System.out.println(totalScore);
				break;
			case 'D':
				totalScore = totalScore + 2;
				System.out.println(totalScore);
				break;
			case 'd':
				totalScore = totalScore + 2;
				System.out.println(totalScore);
				break;
			case 'E':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'e':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'F':
				totalScore = totalScore + 4;
				System.out.println(totalScore);
				break;
			case 'f':
				totalScore = totalScore + 4;
				System.out.println(totalScore);
				break;
			case 'G':
				totalScore = totalScore + 2;
				System.out.println(totalScore);
				break;
			case 'g':
				totalScore = totalScore + 2;
				System.out.println(totalScore);
				break;
			case 'H':
				totalScore = totalScore + 4;
				System.out.println(totalScore);
				break;
			case 'h':
				totalScore = totalScore + 4;
				System.out.println(totalScore);
				break;
			case 'I':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'i':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'J':
				totalScore = totalScore + 8;
				System.out.println(totalScore);
				break;
			case 'j':
				totalScore = totalScore + 8;
				System.out.println(totalScore);
				break;
			case 'K':
				totalScore = totalScore + 5;
				System.out.println(totalScore);
				break;
			case 'k':
				totalScore = totalScore + 5;
				System.out.println(totalScore);
				break;
			case 'L':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'l':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'M':
				totalScore = totalScore + 3;
				System.out.println(totalScore);
				break;
			case 'm':
				totalScore = totalScore + 3;
				System.out.println(totalScore);
				break;
			case 'N':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'n':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'O':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'o':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'P':
				totalScore = totalScore + 3;
				System.out.println(totalScore);
				break;
			case 'p':
				totalScore = totalScore + 3;
				System.out.println(totalScore);
				break;
			case 'Q':
				totalScore = totalScore + 10;
				System.out.println(totalScore);
				break;
			case 'q':
				totalScore = totalScore + 10;
				System.out.println(totalScore);
				break;
			case 'R':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'r':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'S':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 's':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'T':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 't':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'U':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'u':
				totalScore = totalScore + 1;
				System.out.println(totalScore);
				break;
			case 'V':
				totalScore = totalScore + 4;
				System.out.println(totalScore);
				break;
			case 'v':
				totalScore = totalScore + 4;
				System.out.println(totalScore);
				break;
			case 'W':
				totalScore = totalScore + 4;
				System.out.println(totalScore);
				break;
			case 'w':
				totalScore = totalScore + 4;
				System.out.println(totalScore);
				break;
			case 'X':
				totalScore = totalScore + 8;
				System.out.println(totalScore);
				break;
			case 'x':
				totalScore = totalScore + 8;
				System.out.println(totalScore);
				break;
			case 'Y':
				totalScore = totalScore + 4;
				System.out.println(totalScore);
				break;
			case 'y':
				totalScore = totalScore + 4;
				System.out.println(totalScore);
				break;
			case 'Z':
				totalScore = totalScore + 10;
				System.out.println(totalScore);
				break;
			case 'z':
				totalScore = totalScore + 10;
				System.out.println(totalScore);
				break;

			}

		}

		return totalScore;
	}

	/**
	 * 5. Clean up user-entered phone numbers so that they can be sent SMS messages.
	 * 
	 * The North American Numbering Plan (NANP) is a telephone numbering system used
	 * by many countries in North America like the United States, Canada or Bermuda.
	 * All NANP-countries share the same international country code: 1.
	 * 
	 * NANP numbers are ten-digit numbers consisting of a three-digit Numbering Plan
	 * Area code, commonly known as area code, followed by a seven-digit local
	 * number. The first three digits of the local number represent the exchange
	 * code, followed by the unique four-digit number which is the subscriber
	 * number.
	 * 
	 * The format is usually represented as
	 * 
	 * 1 (NXX)-NXX-XXXX where N is any digit from 2 through 9 and X is any digit
	 * from 0 through 9.
	 * 
	 * Your task is to clean up differently formatted telephone numbers by removing
	 * punctuation and the country code (1) if present.
	 * 
	 * For example, the inputs
	 * 
	 * +1 (613)-995-0253 613-995-0253 1 613 995 0253 613.995.0253 should all produce
	 * the output
	 * 
	 * 6139950253
	 * 
	 * Note: As this exercise only deals with telephone numbers used in
	 * NANP-countries, only 1 is considered a valid country code.
	 */
	public String cleanPhoneNumber(String string) {
		String s = string;
		s = s.replace("+1", "");
		s = s.replace("1 ", "");
		s = s.replace("(", "");
		s = s.replace(")", "");
		s = s.replace("-", "");
		s = s.replace(".", "");
		s = s.replace(" ", "");
		s = s.replaceAll("[a-zA-Z]", "");
		s = s.replaceAll("[ (]@[.,;?:) ]", "");
		System.out.println(s);

		if (s.length() != 10) {
			throw new IllegalArgumentException();
		}

		return s;
	}

	/**
	 * 6. Given a phrase, count the occurrences of each word in that phrase.
	 * 
	 * For example for the input "olly olly in come free" olly: 2 in: 1 come: 1
	 * free: 1
	 * 
	 * @param string
	 * @return
	 */
	public Map<String, Integer> wordCount(String string) {
		Map<String, Integer> maplist = new HashMap<String, Integer>();
		String[] collection;
		collection = string.split(" ");
		collection = string.split("[,]\n");
		for (String a : collection) {
			if (!maplist.containsKey(a)) {
				maplist.put(a, 1);
			} else {
				int count = maplist.get(a);
				maplist.put(a, count + 1);
			}
		}
		return maplist;
	}

	/**
	 * 7. Implement a binary search algorithm.
	 * 
	 * Searching a sorted collection is a common task. A dictionary is a sorted list
	 * of word definitions. Given a word, one can find its definition. A telephone
	 * book is a sorted list of people's names, addresses, and telephone numbers.
	 * Knowing someone's name allows one to quickly find their telephone number and
	 * address.
	 * 
	 * If the list to be searched contains more than a few items (a dozen, say) a
	 * binary search will require far fewer comparisons than a linear search, but it
	 * imposes the requirement that the list be sorted.
	 * 
	 * In computer science, a binary search or half-interval search algorithm finds
	 * the position of a specified input value (the search "key") within an array
	 * sorted by key value.
	 * 
	 * In each step, the algorithm compares the search key value with the key value
	 * of the middle element of the array.
	 * 
	 * If the keys match, then a matching element has been found and its index, or
	 * position, is returned.
	 * 
	 * Otherwise, if the search key is less than the middle element's key, then the
	 * algorithm repeats its action on the sub-array to the left of the middle
	 * element or, if the search key is greater, on the sub-array to the right.
	 * 
	 * If the remaining array to be searched is empty, then the key cannot be found
	 * in the array and a special "not found" indication is returned.
	 * 
	 * A binary search halves the number of items to check with each iteration, so
	 * locating an item (or determining its absence) takes logarithmic time. A
	 * binary search is a dichotomic divide and conquer search algorithm.
	 * 
	 */
	static class BinarySearch<T> {
        private List<T> sortedList;

        public int indexOf(T t) {
            // TODO Write an implementation for this method declaration
            int low = 0;
            int high = (int) sortedList.size()-1;
            int key = (int) t;
            int mid = 0;
            int found = 0;
            System.out.println(high);
            while(low <= high) {
                mid = (low + high)/2;
                int midElement = (int) sortedList.get(mid);
             System.out.println(mid);
                if(midElement > key) {
                    high = mid - 1;
                }
                else if(midElement < key) {
                    low = mid + 1;
                }
                else if(midElement == key) {
                    found = mid;
                    break;
                }
            }
            
            System.out.println(found);
            return found;
        }

        public BinarySearch(List<T> sortedList) {
            super();
            this.sortedList = sortedList;
        }

        public List<T> getSortedList() {
            return sortedList;
        }

        public void setSortedList(List<T> sortedList) {
            this.sortedList = sortedList;
        }

    }



	/**
	 * 8. Implement a program that translates from English to Pig Latin.
	 * 
	 * Pig Latin is a made-up children's language that's intended to be confusing.
	 * It obeys a few simple rules (below), but when it's spoken quickly it's really
	 * difficult for non-children (and non-native speakers) to understand.
	 * 
	 * Rule 1: If a word begins with a vowel sound, add an "ay" sound to the end of
	 * the word. Rule 2: If a word begins with a consonant sound, move it to the end
	 * of the word, and then add an "ay" sound to the end of the word. There are a
	 * few more rules for edge cases, and there are regional variants too.
	 * 
	 * See http://en.wikipedia.org/wiki/Pig_latin for more details.
	 * 
	 * @param string
	 * @return
	 */
	public String toPigLatin(String string) {

		String s = string;
		s = s.toLowerCase();
		String l = "";

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				s = s.substring(i, s.length());
				s = s + l + "ay";
				System.out.println(s);

				break;
			}
//			else if (s.charAt(i) == 32) {
//			} 
			else {
				l = s.substring(0, i + 1);

			}

		}

		return s;
	}
//fix for last case

	/**
	 * 9. An Armstrong number is a number that is the sum of its own digits each
	 * raised to the power of the number of digits.
	 * 
	 * For example:
	 * 
	 * 9 is an Armstrong number, because 9 = 9^1 = 9 10 is not an Armstrong number,
	 * because 10 != 1^2 + 0^2 = 2 153 is an Armstrong number, because: 153 = 1^3 +
	 * 5^3 + 3^3 = 1 + 125 + 27 = 153 154 is not an Armstrong number, because: 154
	 * != 1^3 + 5^3 + 4^3 = 1 + 125 + 64 = 190 Write some code to determine whether
	 * a number is an Armstrong number.
	 * 
	 * @param input
	 * @return
	 */
	public boolean isArmstrongNumber(int input) {
		// TODO Write an implementation for this method declaration
		// armstrong number ex. 153 = 1^3 + 5^3 + 3^3

		double num = input;
		double digit = 0;
		double remainder = 0;
		double armstrong = 0;
		double temp = num;
		double check = input;

		// System.out.println("The number is: " + num);

		while (num > 1) {// get number of digits
			num = num / 10;
			// System.out.println("This is " + num + " divided by 10");
			digit++;
			// System.out.println("The number of digits is: " + digit);
		}

		while (temp > 0) {
			remainder = temp % 10;
			armstrong = armstrong + Math.pow(remainder, digit);
			System.out.println("The number after this step = " + armstrong);
			temp = temp - remainder;
			temp = temp / 10;

			if (temp == 0) {
				break;
			}

		}

		return check == armstrong;

	}

	/**
	 * 10. Compute the prime factors of a given natural number.
	 * 
	 * A prime number is only evenly divisible by itself and 1.
	 * 
	 * Note that 1 is not a prime number.
	 * 
	 * @param l
	 * @return
	 */
	public List<Long> calculatePrimeFactorsOf(long l) {
		// TODO Write an implementation for this method declaration
		List<Long> factortree = new ArrayList<Long>();
		long temp = l;
		int i = 1;// increment
		long temp2 = l;

		if (temp % 2 == 0) {// if even
			while (temp % 2 == 0) {
				temp = temp / 2;
				System.out.println("i is =  " + i);
				factortree.add(2l);
				System.out.println("this is temp: " + temp);
			}

			if (temp != 1) {
				factortree.add(temp);
			}

		}

		else {// odd
			for (long j = 3; j <= Math.sqrt(temp2); j += 2) {

				while (temp2 % j == 0) {
					System.out.print("This is J: " + j);
					System.out.println("\n");
					temp2 /= j;
					System.out.println("this is temp2: " + temp2);
					System.out.println("\n");
					factortree.add(j);
					System.out.println("temp 2 has been added");
				}

			}
			if (temp2 != 1) {
				factortree.add(temp2);
			}

		}
		return factortree;
	}

	/**
	 * 11. Create an implementation of the rotational cipher, also sometimes called
	 * the Caesar cipher.
	 * 
	 * The Caesar cipher is a simple shift cipher that relies on transposing all the
	 * letters in the alphabet using an integer key between 0 and 26. Using a key of
	 * 0 or 26 will always yield the same output due to modular arithmetic. The
	 * letter is shifted for as many values as the value of the key.
	 * 
	 * The general notation for rotational ciphers is ROT + <key>. The most commonly
	 * used rotational cipher is ROT13.
	 * 
	 * A ROT13 on the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: nopqrstuvwxyzabcdefghijklm It is
	 * stronger than the Atbash cipher because it has 27 possible keys, and 25
	 * usable keys.
	 * 
	 * Ciphertext is written out in the same formatting as the input including
	 * spaces and punctuation.
	 * 
	 * Examples: ROT5 omg gives trl ROT0 c gives c ROT26 Cool gives Cool ROT13 The
	 * quick brown fox jumps over the lazy dog. gives Gur dhvpx oebja sbk whzcf bire
	 * gur ynml qbt. ROT13 Gur dhvpx oebja sbk whzcf bire gur ynml qbt. gives The
	 * quick brown fox jumps over the lazy dog.
	 */
	static class RotationalCipher {
		private int key;

		public RotationalCipher(int key) {
			super();
			this.key = key;
		}

		public String rotate(String string) {
			StringBuffer result= new StringBuffer();
			String other = "1234567890,.;:'!";

			for (int i=0; i < string.length(); i++)
			{
				if (string.charAt(i) == ' ' || other.contains("" + string.charAt(i))) {
					result.append(string.charAt(i));
				}
				else if (Character.isUpperCase(string.charAt(i)) && string.charAt(i) != ' ') {
					System.out.println("upper case check");
					char ch = (char)(((int)string.charAt(i) +
									key - 65) % 26 + 65);
					result.append(ch);
					}
				else if (!Character.isUpperCase(string.charAt(i)) && string.charAt(i) != ' '){
					System.out.println("lower case check");
					char ch = (char)(((int)string.charAt(i) +
									key - 97) % 26 + 97);
					result.append(ch);
				}
			}
			System.out.println(result.toString());
			return result.toString();
		}

	}

	

	/**
	 * 12. Given a number n, determine what the nth prime is.
	 * 
	 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
	 * that the 6th prime is 13.
	 * 
	 * If your language provides methods in the standard library to deal with prime
	 * numbers, pretend they don't exist and implement them yourself.
	 * 
	 * @param i
	 * @return
	 */
	public int calculateNthPrime(int primecount) {

		int i;
		int count = 0;
		int num = 1;

		if (primecount == 0) {
			throw new IllegalArgumentException();
		} // end if

		while (count < primecount) {
			num += 1;
			for (i = 2; i <= num; i++) {
				if (num % i == 0) {
					break;
				}

			}
			if (i == num) {
				count += 1;
			}
		} // end while
		System.out.println(num);
		return num;
	}// end method

	/**
	 * 13 & 14. Create an implementation of the atbash cipher, an ancient encryption
	 * system created in the Middle East.
	 * 
	 * The Atbash cipher is a simple substitution cipher that relies on transposing
	 * all the letters in the alphabet such that the resulting alphabet is
	 * backwards. The first letter is replaced with the last letter, the second with
	 * the second-last, and so on.
	 * 
	 * An Atbash cipher for the Latin alphabet would be as follows:
	 * 
	 * Plain: abcdefghijklmnopqrstuvwxyz Cipher: zyxwvutsrqponmlkjihgfedcba It is a
	 * very weak cipher because it only has one possible key, and it is a simple
	 * monoalphabetic substitution cipher. However, this may not have been an issue
	 * in the cipher's time.
	 * 
	 * Ciphertext is written out in groups of fixed length, the traditional group
	 * size being 5 letters, and punctuation is excluded. This is to make it harder
	 * to guess things based on word boundaries.
	 * 
	 * Examples Encoding test gives gvhg Decoding gvhg gives test Decoding gsvjf
	 * rxpyi ldmul cqfnk hlevi gsvoz abwlt gives thequickbrownfoxjumpsoverthelazydog
	 *
	 */
	static class AtbashCipher {

		/**
		 * Question 13
		 * 
		 * @param string
		 * @return
		 */
		public static String encode(String string) {

			String s = string;
			s = s.toLowerCase();
			s = s.replaceAll("[ ,.]", "");
			char[] chararray = s.toCharArray();
			
					
			for(int i= 0;i<chararray.length; i++) {
				if(chararray[i] >=97 || chararray[i] <= 122) {
				int ascii = Integer.valueOf(chararray[i]);
				ascii= 97 + (122-ascii);
				chararray[i] = (char) ascii;
				}
			}

			s = String.valueOf(chararray);
			StringBuilder fin = new StringBuilder(s);
			
				for(int j = 5; j<fin.length();j += 6) {
					
					fin.insert(j,' ');
			
		}
				
				return fin.toString();
	}
		

		/**
		 * Question 14
		 * 
		 * @param string
		 * @return
		 */
		public static String decode(String string) {
			
			String decoded = encode(string);
			decoded = decoded.replaceAll(" ", "");

			return decoded;
		}
	}

	/**
	 * 15. The ISBN-10 verification process is used to validate book identification
	 * numbers. These normally contain dashes and look like: 3-598-21508-8
	 * 
	 * ISBN The ISBN-10 format is 9 digits (0 to 9) plus one check character (either
	 * a digit or an X only). In the case the check character is an X, this
	 * represents the value '10'. These may be communicated with or without hyphens,
	 * and can be checked for their validity by the following formula:
	 * 
	 * (x1 * 10 + x2 * 9 + x3 * 8 + x4 * 7 + x5 * 6 + x6 * 5 + x7 * 4 + x8 * 3 + x9
	 * * 2 + x10 * 1) mod 11 == 0 If the result is 0, then it is a valid ISBN-10,
	 * otherwise it is invalid.
	 * 
	 * Example Let's take the ISBN-10 3-598-21508-8. We plug it in to the formula,
	 * and get:
	 * 
	 * (3 * 10 + 5 * 9 + 9 * 8 + 8 * 7 + 2 * 6 + 1 * 5 + 5 * 4 + 0 * 3 + 8 * 2 + 8 *
	 * 1) mod 11 == 0 Since the result is 0, this proves that our ISBN is valid.
	 * 
	 * @param string
	 * @return
	 */
	public boolean isValidIsbn(String string) {
		int con = 10;
		boolean checkforx;
		boolean checkforletters;
		String s = "3-598-21508-8";
		s = s.replace("-", "");
		checkforx = s.matches("X");
		checkforletters = s.matches("ABCDEFGHIJKLMNOPQRSTUVWYZ");
		String[] Snew = s.split("");
		long[] newval = new long[Snew.length];
		long[] check = newval;
		long add = 0l;
		long lastcheck;
		boolean finalcheck = false;

		if (checkforx == true) {
			s.replaceAll("X", "10");
		}

		if (checkforletters = true) {
			finalcheck = false;
		}

		for (int i = 0; i < Snew.length; i++)// make array of long of multiplied values
		{
			newval[i] = Long.parseLong(Snew[i]);
			System.out.println(newval[i]);
			System.out.println("this is newval : " + newval[i]);
			System.out.println("this is con-i : " + (con - i));
			check[i] = (newval[i]) * (con - i);
			System.out.println("This is check value: " + check[i]);

		}

		for (int i = 0; i < check.length; i++) {

			add = add + check[i];
		}

		lastcheck = add % 11;

		if (lastcheck == 0) {
			finalcheck = true;
		}

		else if (lastcheck != 0) {
			finalcheck = false;
		}
		return finalcheck;

	}

	/**
	 * 16. Determine if a sentence is a pangram. A pangram (Greek: παν γράμμα, pan
	 * gramma, "every letter") is a sentence using every letter of the alphabet at
	 * least once. The best known English pangram is:
	 * 
	 * The quick brown fox jumps over the lazy dog.
	 * 
	 * The alphabet used consists of ASCII letters a to z, inclusive, and is case
	 * insensitive. Input will not contain non-ASCII symbols.
	 * 
	 * @param string
	 * @return
	 */
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
			check = true;
		}

		else
			check = false;

		return check;
	}

	/**
	 * 17. Calculate the moment when someone has lived for 10^9 seconds.
	 * 
	 * A gigasecond is 109 (1,000,000,000) seconds.
	 * 
	 * @param given
	 * @return
	 */
	public Temporal getGigasecondDate(Temporal given) {
		// In case,time not included
		if (given instanceof LocalDate) {
			LocalDateTime time = LocalDateTime.of((LocalDate) given, LocalTime.MIN);
			return time.plus(Duration.ofSeconds(1000000000l));
		}
		// if time is included
		LocalDateTime time = LocalDateTime.from(given);
		return time.plus(Duration.ofSeconds(1000000000l));
	}

	/**
	 * 18. Given a number, find the sum of all the unique multiples of particular
	 * numbers up to but not including that number.
	 * 
	 * If we list all the natural numbers below 20 that are multiples of 3 or 5, we
	 * get 3, 5, 6, 9, 10, 12, 15, and 18.
	 * 
	 * The sum of these multiples is 78.
	 * 
	 * @param i
	 * @param set
	 * @return
	 */
	public int getSumOfMultiples(int n, int[] set) {
		Set<Integer> num = new HashSet<>();
		int summation = 0;
		int val = 0;
		for (int i = 0; i < set.length; i++) {
			for (int j = 1; j < n; j++) {
				val = j % set[i];
				if (val == 0) {
					num.add(j);
				}
			}
		}

		for (Integer test : num) {
			summation = summation +  test;
		}

		return summation;
	}

	/**
	 * 19. Given a number determine whether or not it is valid per the Luhn formula.
	 * 
	 * The Luhn algorithm is a simple checksum formula used to validate a variety of
	 * identification numbers, such as credit card numbers and Canadian Social
	 * Insurance Numbers.
	 * 
	 * The task is to check if a given string is valid.
	 * 
	 * Validating a Number Strings of length 1 or less are not valid. Spaces are
	 * allowed in the input, but they should be stripped before checking. All other
	 * non-digit characters are disallowed.
	 * 
	 * Example 1: valid credit card number 1 4539 1488 0343 6467 The first step of
	 * the Luhn algorithm is to double every second digit, starting from the right.
	 * We will be doubling
	 * 
	 * 4_3_ 1_8_ 0_4_ 6_6_ If doubling the number results in a number greater than 9
	 * then subtract 9 from the product. The results of our doubling:
	 * 
	 * 8569 2478 0383 3437 Then sum all of the digits:
	 * 
	 * 8+5+6+9+2+4+7+8+0+3+8+3+3+4+3+7 = 80 If the sum is evenly divisible by 10,
	 * then the number is valid. This number is valid!
	 * 
	 * Example 2: invalid credit card number 1 8273 1232 7352 0569 Double the second
	 * digits, starting from the right
	 * 
	 * 7253 2262 5312 0539 Sum the digits
	 * 
	 * 7+2+5+3+2+2+6+2+5+3+1+2+0+5+3+9 = 57 57 is not evenly divisible by 10, so
	 * this number is not valid.
	 * 
	 * @param string
	 * @return
	 */
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

	/**
	 * 20. Parse and evaluate simple math word problems returning the answer as an
	 * integer.
	 * 
	 * Add two numbers together.
	 * 
	 * What is 5 plus 13?
	 * 
	 * 18
	 * 
	 * Now, perform the other three operations.
	 * 
	 * What is 7 minus 5?
	 * 
	 * 2
	 * 
	 * What is 6 multiplied by 4?
	 * 
	 * 24
	 * 
	 * What is 25 divided by 5?
	 * 
	 * 5
	 * 
	 * @param string
	 * @return
	 */
	public int solveWordProblem(String string) {
		// TODO Write an implementation for this method declaration
		return 0;
	}

}
