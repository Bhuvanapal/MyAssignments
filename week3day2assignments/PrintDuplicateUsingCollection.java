package week3day2assignments;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateUsingCollection {

	public static void main(String[] args) {
		
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Set<Integer> unique = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		
		for (Integer num : arr) {
		if(!unique.add(num)) {
			duplicate.add(num);
		}
		}
		
		System.out.println(duplicate);
		
		
		
		
		

	}

}
