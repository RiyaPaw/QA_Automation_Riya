package javacodes;

import java.util.Scanner;

public class NewEvenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Please enter the number: ");

		Scanner s1 = new Scanner(System.in);
		int result= s1.nextInt();
		
		int reminder = result%2;
		if(reminder == 0) {
			System.out.println("Even number: " +reminder);
		}else {
			System.out.println("Odd number: " +reminder);

		}
}
}
