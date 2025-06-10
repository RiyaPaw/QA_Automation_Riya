package javacodes;

public class StringPlaindromenonrepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String input = "racecar";
		String Output = "";
		
		for(int i = input.length()-1; i>=0; i--) {
			
			Output = Output + input.charAt(i);
			
		}
		
		System.out.println("Reverse String is: " +Output);
		
	}

}
