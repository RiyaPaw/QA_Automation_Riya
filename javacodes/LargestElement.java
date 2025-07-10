package javacodes;

import java.util.Arrays;

public class LargestElement {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int array[]= {10,20,50,80,15};
	
	int Largest = array[0];
	System.out.println("Which is the largest number from list? " +Arrays.toString(array));

	for(int i=0; i<array.length;i++) {
		
		if(array[i]> Largest) {
			Largest = array[i];
			
		
	}
}		

	System.out.println("Largest no is: " +Largest);

	}
}