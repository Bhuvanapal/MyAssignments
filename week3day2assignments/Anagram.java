package week3day2assignments;

import java.util.Arrays;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {

		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */

         String text1 = "stops";
         String text2 = "potss";
		
		int len1 = text1.length();
        int len2 = text2.length();		
		if (len1==len2) {
		System.out.println("The length of the strings are same");
		}else
		{System.out.println("The length of the strings are not same");
		}
	
	
	char[] ch1 = text1.toCharArray();
	char[] ch2 = text2.toCharArray();
	
		
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	
	if (Arrays.equals(ch1, ch2)) {
		System.out.println("Both the arrays have same value");
	} else {
		System.out.println("Both the arrays do not have same value");
	}
	
		
		
	}
	

}
