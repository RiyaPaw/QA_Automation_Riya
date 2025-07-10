package practice.programs;

import java.util.Arrays;

public class Sorting_String_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 String s[]= {"Maria","Jeet","Nate","Amanda"};
	 
	 //System.out.println("Before Sorting............." +Arrays.toString(s));
	 
	 System.out.println("Before Sorting............." +String.join(", " ,  s));

	 
	 
	 Arrays.sort(s);
	 //System.out.println("After Sorting........." +Arrays.toString(s));
	 System.out.println("After Sorting........." +String.join(", " , s));
	
	}

}
