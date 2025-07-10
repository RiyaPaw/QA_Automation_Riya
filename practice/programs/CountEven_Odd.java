package practice.programs;

public class CountEven_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input ="234589";
		String Even = "";
		String Odd = "";
		
		for(int i =0 ; i<input.length();i++) {
			
			char ch = input.charAt(i);
			int digit = Character.getNumericValue(ch); //Convert char to int
			
			if(digit%2 == 0) {
				//System.out.println(ch + " Number is Even" );
				Even += ch;
			}else {
				//System.out.println(ch + " Number is Odd");
				Odd += ch;
			}
		}
		
		  System.out.println("Even digits: " + Even);
	      System.out.println("Odd digits: " + Odd);
		
	}

}
