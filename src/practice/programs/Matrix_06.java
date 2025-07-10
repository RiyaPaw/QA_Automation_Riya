package practice.programs;

public class Matrix_06 {

	public static void main(String[] args) {
//		int a[] = {1,2,3,4};
//		
//		for(int i= a.length-1; i>=0;i--) {
//			System.out.println("Output is: " +a[i]);
//		}
		
		
		int x[][] = {{10,20,30,40},
				         {50,60,70,80}};
		
//		System.out.println("Output is: " +x[1][1]);

		for(int r= 0; r<x.length;r++) {
			for(int c= 0; c <=x[r].length-1;c++)
			{
				System.out.print(" "+  x[r][c]);
			}
			System.out.println();

	}
		
	}
}
