package practice.programs;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Input_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = new int [5];
		Scanner sc = new Scanner(System.in);
		
		for(int i= 0; i<array.length;i++) {
			
			System.out.println("Enter a value at position " +i+ ": ");
			array[i]= sc.nextInt();
	
		}
			
		System.out.println("Output Array is: " +Arrays.toString(array));

	}
		

}
