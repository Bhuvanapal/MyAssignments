package week3day2assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementUsingCollection {

	public static void main(String[] args) {
		
		// Here is the input
				//int[] arr = {1,2,3,4,7,6,8};

				// Sort the array	
				

				// loop through the array (start i from arr[0] till the length of the array)

					// check if the iterator variable is not equal to the array values respectively
					
						// print the number
						
						// once printed break the iteration
				
		int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		
		for (int i = 0; i < arr.length; i++) {
			list1.add(arr[i]);
		}
		
		Collections.sort(list1);
		
		for (int i = 0; i < list1.size()-1; i++) {
		
			if (list1.get(i)!=i+1) {
			System.out.println("The missing element is "+(i+1));	
			break;
			
			}
			
		}
		
		
		
		
		
		

	}

}
