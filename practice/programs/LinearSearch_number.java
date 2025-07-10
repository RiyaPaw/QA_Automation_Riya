package practice.programs;

public class LinearSearch_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {300, 500, 100,200,500};
		int Search_Element = 500;
		
		boolean status = false;
		
		for(int i = 0; i< array.length;i++){
			
		
			if( array[i]== Search_Element) {
				
		
			System.out.println("Element is Found: " +array[i]);
			status =true; //Meaning we found the element
			break;
			
		}
		}
			
			if(!status) {
				System.out.println("Element is Not Found ");
			}
			

	}	
	
}


