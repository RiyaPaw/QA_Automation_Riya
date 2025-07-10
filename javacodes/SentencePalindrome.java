package javacodes;

public class SentencePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "My Name is ABC";
		String Output = "";
		
		for(int i= name.length()-1; i>=0; i--) {
			
			Output = Output + name.charAt(i);
			
		}
	
			System.out.println("Reverse String is: " +Output);
			

	}

}
