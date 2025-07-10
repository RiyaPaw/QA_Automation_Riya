package practice.assignments;

public class Missing_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String  input= "10101010";
		String  rep1= "1";
		String  rep2= "0";
		String num= "";
		int count = 0;
		for(int i =0; i< input.length()-1;i++) {
			
		 num = num + input.charAt(i);
			
			if(num == rep1) {
				count++;
			}
			
			 System.out.println("Count of 1 is: " +num);
		}
	
		
		
	}

}
