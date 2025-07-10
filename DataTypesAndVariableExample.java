package practice.assignments;

import java.util.Scanner;

public class DataTypesAndVariableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*************** Welcome to Library Management System ***************");
		
		System.out.println("\n----- Following are the Book Details: -----");
		String Title= "Selenium Testing Tools Cookbook";
		String Author_Name = "Unmesh Gundecha";
		int Year = 2015;
		double Price = 599.93;
		Boolean Availability = true;
		
		System.out.println("Title of the book: " +Title);
		System.out.println("Author’s name: " +Author_Name);
		System.out.println("Year of publication: " +Year);
		System.out.println("Price of the book: " +Price);
		System.out.println("Whether the book is currently available or not: " +Availability);
		

		System.out.println("\n----- Following are the Member Details: -----");
		String Member_name = "Ram Pawar";
		int MemberID = 107;
		char Membership_type = 'A';
		
		System.out.println("Name of the member: " +Member_name);
		System.out.println("Member ID number: " +MemberID);
		System.out.println("Type of membership (Adult, Child, or Senior represented by characters A, C, S): " +Membership_type);
		
		
		System.out.println("\n----- Following is the Borrowing Status: -----");
		int borrowed_days = 8;
		int FinePerDay = 2;
		int freeDays = 3;
		
		System.out.println("Number of days the book has been borrowed: " +borrowed_days);
		System.out.println("Fine per extra day (after 3 days free): " +FinePerDay);

		//Calling Calculate method 
		float total_fine = Calculate_fine(FinePerDay, freeDays, borrowed_days);
		System.out.println("Total fine to be paid: " +total_fine);

		
	}
	
		public static float Calculate_fine(int FinePerDay, int freeDays, int borrowed_days) 
		{
			
		if(borrowed_days > freeDays) {
			int extra_days = borrowed_days- freeDays;
			 return extra_days* FinePerDay;
		}else {
				return 0;
	
			}
		
			
}

}



