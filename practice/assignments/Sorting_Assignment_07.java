package practice.assignments;

import java.util.Arrays;

public class Sorting_Assignment_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int  a[] = {50,20,40,10,100};
		
		
		for(int i=0; i<a.length-1;i++) {
			for(int j=0; j<a.length-1;j++) {
				
				if(a[j] >a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
			}
				
			}
		
		}
		System.out.println("Sorting output is: " +Arrays.toString(a));
		
	
		

	}

}
