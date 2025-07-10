package practice.assignments;

public class Coniditonal_ExampleSports {
	public static void main(String[] args) {
		
		System.out.println("********************* Welcome to Sports Day *********************");

		String Name1 = "Daniel";
		String Name2 = "Nate";
		
		double Daniel_Time = 10.5;
		double Nate_Time = 10.5;

		
		if(Daniel_Time < Nate_Time) {
			
			System.out.println(" ---------- Daniel is a WINNER ----------- ");
			
		}else if (Nate_Time < Daniel_Time) {
			System.out.println(" ---------- Nate is a WINNER ----------- ");

		}else {
			System.out.println(" ---------- It is a TIE ----------- ");

		}
		
		
	}
}
