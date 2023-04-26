package week1.day2assignments;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		
		int [] values = {23,45,67,32,89,22};
		
		int length = values.length;
		
		System.out.println(length);
		
		Arrays.sort(values);
		
		System.out.println("First index is "+ values[0]);
		System.out.println("Last index is "+ values[5]);
		System.out.println("The second smallest number is "+ values[length-5]);
		

	}

}
