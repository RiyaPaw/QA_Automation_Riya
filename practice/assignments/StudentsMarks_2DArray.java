package practice.assignments;

import java.util.Arrays;

public class StudentsMarks_2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Students[] = { "Stud1", "Stud2", "Stud3" };

		String Sub[] = { "Maths", "Science", "English", "History" };

		int Marks[][] = { { 80, 50, 60, 77 }, { 55, 35, 40, 70 }, { 77, 85, 35, 20 } };

		System.out.print("Students \t");

		// Column titles

		
		 //for(String Subject : Sub) { System.out.print(Subject +"\t"); }
		for(int k=0; k<Sub.length; k++) {
			System.out.print(Sub[k] +"\t");
		}
		 
		 System.out.print("Total");

		System.out.println("\n--------------------------------------------------------");

		for (int i = 0; i < Students.length; i++) {
			//System.out.print(i + "\t\t");
			//System.out.print(Students[i] + "\t\t");

			int total = 0; 
			for (int j = 0; j < Sub.length; j++) {
				// System.out.print(+i +j+ "\t");

				 
			 System.out.print(Marks[i][j] + "\t");
			 total += Marks[i][j];
			 
			} System.out.println(total);
			
		}

	 }
	
}

