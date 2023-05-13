package week3day2assignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindIntersectionUsingCollection {

	public static void main(String[] args) {
		
		/*
		 * Pseudo Code
		
		 * a) Declare An array for {3,2,11,4,6,7};	 
		 * b) Declare another array for {1,2,8,4,9,7};
		 * c) Declare for loop iterator from 0 to array length
		 * d) Declare a nested for another array from 0 to array length
		 * e) Compare Both the arrays using a condition statement
		 
		 *  f) Print the first array (shoud match item in both arrays)
		 */
		
		int [] arr1 = {3,2,11,4,6,7};
		int [] arr2 = {1,2,8,4,9,7};
		
		Set<Integer> set1 = new HashSet<Integer>();
		
		for (Integer var1 : arr1) {
			set1.add(var1);
		}
        
       Set<Integer> set2 = new HashSet<Integer>();
		
		for (Integer var2 : arr2) {
			set2.add(var2);
		}
		
		set2.retainAll(set1);
		
		System.out.println(set2);
		
			

	}

}
