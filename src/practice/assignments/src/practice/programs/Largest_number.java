package practice.programs;

import java.util.Arrays;

public class Largest_number {

	public static void main(String[] args) {
		
		int a[] = {10, 40,80,15, 5};
		int Largest =a[0];
		
		System.out.println("Which is the largest number from list? " +Arrays.toString(a));
		
	for	(int i = 0; i <a.length;i++) {
		if (a[i] > Largest);
		
		a[i] = Largest;
	}
		System.out.println("Largest number is: " +Largest);

		
	}
}

