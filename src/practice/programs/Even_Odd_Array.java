package practice.programs;

public class Even_Odd_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6};
	
		
		for(int i=0; i<a.length;i++) {
			
			int num = a[i];
			
			if( num%2 == 0) {
				
				System.out.println("Number is Even:" +num);
				
				
			}else {
				System.out.println("Number is Odd: " +num);
			}
		}

	}

}
