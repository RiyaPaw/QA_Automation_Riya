package javacodes;

import java.util.Scanner;

public class PrimeNumber1 {
	
	public static void main(String[] args) {
		
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number");
	
	int number =scan.nextInt();
	
	Boolean isPrime = true;
	
	if(number<=1) {
		
		System.out.println("Number is not Prime");
	}
	
	for(int i =2; i<= number/2;i++ ) {
		if(number%i ==0) {
			
			isPrime = false;
			break;
			
		}
	}
	
	if(isPrime) {
	System.out.println("Number is Prime");
	
	}else {
		System.out.println("Number is not Prime");
	}
	
	scan.close();
	
	
	}
}