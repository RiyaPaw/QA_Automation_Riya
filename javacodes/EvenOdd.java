package javacodes;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number, reminder;
		System.out.println("Please enter no ");

		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		reminder = number % 2;
		
		if(reminder == 0) {
			System.out.println("Number is Even ");
		}else {
			System.out.println("Number is Odd ");

		}
		
	}

}
