package practice.programs;

public class Increment_Decrement_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

//Difference is 'a' data assigned directly to result so it displays 10
	
//case1
	int a = 10;

	int result = a++; //This is post increment 
	System.out.println("Printed result as 'a' is: "+a);
	System.out.println("Printed result as result is:" +result);
	
	//case2
	int b =10;
	int result2 =++b; //(1+10)
	System.out.println("Pre increment result is: "+result2);
	System.out.println("Pre increment result is: "+b);
	
	//case3:
	int c =10;
	int d = 20;
	//int result3 = c++ + ++d; //if print result3 ans is 10 +11= 31
		
	int result3 = ++c + ++d; //if Print result3 is 11+12 = 32
	System.out.println("Result is: " + c +  " and "  + d); //if print c and d ans is: 11 and 21 
	System.out.println("Result is: "+result3); 
	
	//case4:
		
	int e = 10, f =20;
	//int result4 = --e - --f;
	//System.out.println("Result for  decrement1 is: " +result4); // o/p = 9 - 19 = -10
	
	//int result5 = e-- - --f;

	//System.out.println("Result for decrement2 is: " +result5); // o/p = 10 - 19 = -9
	

	int result6 = --e + f--;

	System.out.println("Result for decrement3 is: " +result6); // o/p = 9 + 20 = 29 
	
	
	
	}
	
	
}
