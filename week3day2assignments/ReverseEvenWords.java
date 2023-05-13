package week3day2assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
	
		/* Pseudo Code:
		 
		 * Declare the input as Follow
	      		String test = "I am a software tester"; 
		a) split the words and have it in an array
		b) Traverse through each word (using loop)
		c) find the odd index within the loop (use mod operator)
		e)print the even position words in reverse order using another loop (nested loop)
		f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		
		 
	*/

     String test = "I am a software tester";		
		
     String[] word = test.split(" ");
	 
     String reverse="";
	 
     for (int i = 0; i < word.length; i++) {
									
			if (i%2!=0) {
				
			for (int j = word[i].length()-1; j >=0; j--) {
			 
				reverse=reverse+word[i].charAt(j)+" ";
				
			}	
				
			}
			else {
				reverse = reverse + word[i] +" ";
			}
			
     }
		
		
     reverse=reverse.trim();
		
		System.out.println(reverse);
		
	

	}

}
