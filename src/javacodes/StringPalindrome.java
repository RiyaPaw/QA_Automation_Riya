package javacodes;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
			String input = "Hello how are you?";
			String Output = "";
			
			for(int i= input.length()-1; i>=0; i--) {
				
				Output = Output + input.charAt(i);  /*input.charAt(i): Extracts the character at index i from the input string.
Output + input.charAt(i): Concatenates the extracted character to the Output string.
Output = Output + input.charAt(i): Updates Output with the new reversed sequence.*/
				
			}
			
			System.out.println("Reverse String is: " +Output);
			
			
	}
	
}
			