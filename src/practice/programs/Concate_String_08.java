package practice.programs;

public class Concate_String_08 {

	public static void main(String[] args) {
	
		String s1 ="Welcome";
		String s2 = " to Java";
		String s3 = " Training";
		
		System.out.println("Following is the concate method 1: " +s1+s2);
		System.out.println("Following is the concate method 2: " +s1.concat(s2));
		System.out.println("Following is the concate method 2: " +s1.concat(s2).concat(s3));
	}
	

}
