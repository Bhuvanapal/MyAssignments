package week1.day2assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		 
		
		int range = 8, firstNum = 0, secondNum = 1;
		
		System.out.println("Print first number");
		
		for (int i = 1; i <= range; i++) {
			
		int sum = firstNum+secondNum;
		 firstNum = secondNum;
		 secondNum = sum;
		System.out.println(sum);
		
		}
		
		
		
		
		
		

	}

}
