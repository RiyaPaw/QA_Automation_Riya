package javacodes;

import java.util.Scanner;

public class Primenumber {
	
	public static void main(String[] args) {
		
		int min,max, Flag =0;
		
		System.out.println("Enter Min number: ");
		Scanner scanmin= new Scanner(System.in);
		min = scanmin.nextInt();
			
		System.out.println("Enter Max number: ");
		Scanner scanmax= new Scanner(System.in);
		max = scanmax.nextInt();
		
		
		for(int n=min;n<=max;n++) {
			
			for(int i= 0; i<n; i++) {  //Why we starting from 1? why  not 0? when results are same
				
				if(n%2==0) {
					Flag =1;
					break;
				}
					
			}
				if(Flag == 0) {   //Flag = 0: Assumes the number is prime.
								  //Flag = 1: Indicates the number is not prime.
					
					System.out.println(n+ " Is a Prime number");
					
				}
				Flag =0;
			}
		}
	}
		



