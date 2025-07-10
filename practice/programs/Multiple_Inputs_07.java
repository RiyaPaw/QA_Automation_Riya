package practice.programs;

import java.util.Scanner;

public class Multiple_Inputs_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Taking input from user
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a ID: ");
		int num1 = scan.nextInt();
		
		System.out.println("Enter Employee Salary: ");
		Float salary = scan.nextFloat();
		
		System.out.println("Enter Company Name: ");
		String name = scan.next();
		
		System.out.println("Blood Group: ");
		Object  Value = scan.next();
		
		System.out.println("\n ---------------------- Details of Employee ------------------------------- ");
		System.out.println("Empployee ID: " +num1);
		System.out.println("Employee Salary is: " + salary);
		System.out.println("Company Name is: " + name);
		System.out.println("Blood Group is: " + Value);

	}

}
