package practice.programs;

import javax.sound.sampled.AudioSystem;

public class Reverseprogram_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			String input = "1234";
			String output ="";
			
			for(int i=input.length()-1; i>=0;i--) {
				
				output = output + input.charAt(i);
			}	
				
				System.out.println("Reverse Output is: " +output); //Palindrome
				
			}
		
	}


