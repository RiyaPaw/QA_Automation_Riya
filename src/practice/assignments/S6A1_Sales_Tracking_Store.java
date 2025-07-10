package practice.assignments;

import java.util.Arrays;

public class S6A1_Sales_Tracking_Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1000,500,1800, 460,2000,1100,1750};
		int Largest = a[0];
		
		
		System.out.println("*********  Sales Tracking Store list is: *********  ");
		
		/*
		 * System.out.println(" Monday Sale is:   " +a[0]);
		 * System.out.println(" Tuesday Sale is:  " +a[1]);
		 * System.out.println(" Wednesday Sale is:" +a[2]);
		 * System.out.println(" Thursday Sale is: " +a[3]);
		 * System.out.println(" Friday Sale is:   " +a[4]);
		 * System.out.println(" Saturday Sale is: " +a[5]);
		 * System.out.println(" Sunday Sale is:   " +a[6]);
		 */
		
		System.out.println("Following are sales: " + Arrays.toString(a));
				
			for(int i=0; i<a.length;i++) {
				
		
				if( a[i]> Largest) {
				
				 Largest =	a[i];
					
					
				}
		
			}
			System.out.println("\n Largest sale is: " + Largest);		
			
		}


}
