package week3day2assignments;

public class PalindromeString {

	public static void main(String[] args) {
		
		
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String original = "madam";
		String rev ="";
		
        int length = original.length();	
		
		for (int i = length-1; i >=0 ; i--) {
			
			
			rev = rev+original.charAt(i);
			
		}
		
		if (original.equals(rev)) {
		
			System.out.println("The given string is a palindrome");
		}
		
		else {

			System.out.println("The given string is not a palindrome");
		}
		
		
		
		

	}

}
