package practice.assignments;

public class WashingMachine_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello you can start Washing Machine");

		System.out.println("Washing Machine Started");

		for(int i = 1; i<=5; i++) {
			
			System.out.println("Washing... Minute: " +i);
			
			if(i== 5) {
				
				System.out.println("Washing Machine is Completed");
			}
		}

	}

}
