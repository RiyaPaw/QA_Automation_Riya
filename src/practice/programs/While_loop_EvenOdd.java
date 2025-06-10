package practice.programs;

public class While_loop_EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int Num = 7;
		if(Num%2 == 0) {
			
			System.out.println("Following Number: " +Num + " is Even");
		}else {
			System.out.println("Following Number: " +Num+  " is Odd" );

		}*/
		
		int i = 1;
		
		while(i<=10) {
			
			if(i%2 == 0) {
				System.out.println("Number " +i+ " is Even" );
			}
			else {
				System.out.println("Number " +i+ " is Odd");
			
			}
			i++;
		}
	}
}