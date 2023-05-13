package week3day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestElementUsingCollection {

	public static void main(String[] args) {
		
		
		// Here is the input
				//int[] data = {3,2,11,4,6,7};

				
				/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
				 */
				
		int [] arr = {3,2,11,4,6,7};
		
		List<Integer>list1=new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			list1.add(arr[i]);
		}
		
		Collections.sort(list1);
		Integer num = list1.get(list1.size()-2);
		System.out.println("The second largest number is " + num);
		

	}

}
