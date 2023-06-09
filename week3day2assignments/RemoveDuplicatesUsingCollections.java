package week3day2assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingCollections {

	public static void main(String[] args) {
		
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		
		String input = "We learn java basics as part of java sessions in java week1";
		
		String[] words = input.split(" ");
        	
		
		Set<String> output = new LinkedHashSet<String>();
		
		for (int i = 0; i < words.length; i++) {
			
			output.add(words[i]);
			
		}
		System.out.println(output);
		
		
      
	}

}
