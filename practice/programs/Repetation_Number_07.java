package practice.programs;

public class Repetation_Number_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {10,20,10,10,90,10,35};
		int rep = 10;
		int count=0;
		for( int i =0; i< array.length;i++) {
			
			if(array[i] == rep) {
				
						count++;
				
			}
		}
		
			System.out.println("Number " +rep + " is repeated for " + count + " times");
	}

}
