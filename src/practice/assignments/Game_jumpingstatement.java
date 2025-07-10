package practice.assignments;

public class Game_jumpingstatement {

	int level;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Game is started....");
		
		for(int level = 1; level<=10 ; level++) {
			
			
			if(level == 3) {
				System.out.println("\nLevel " + level+ " under maintenance...Skipping..........\n" );
				continue;
			}
			
			if(level == 6) {
				System.out.println("\nPlayer Gets Eliminated at " + level + "...Game Over!!");
				break;
		

			}
			
			System.out.println("Player  completed Level " + level);
				
			}

	}
		
}
