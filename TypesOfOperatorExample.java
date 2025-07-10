package practice.assignments;

public class TypesOfOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.out.println("************ Billing System for local grocery store ************");
	System.out.println("************ Customer has Add to cart and system needs to cacluate the bill ************\n");
	
		int Quantity = 1;
		float Discount = 10	;
		Boolean Eligible = true;
		float price = 95;
		
		
		//Quantity if increased
		Quantity++;
        System.out.println("Extra item added to cart. Updated Quantity =  " + Quantity + " items");

        //Total
        float totalprice = Quantity*price;
        System.out.println("Total Price of the items purchased by customer = " + totalprice + " Rs");

        
        //Ternary Operator
        float Discount_Amount = (totalprice>1000)? totalprice*Discount/100: 0;
        float Total_Amount = totalprice - Discount_Amount;
      		
      		if(Discount_Amount>0) {
          		System.out.println("Discount is "  + Discount + " %");
    			System.out.println("Customer is Eligible for Discount " +Discount_Amount+ " RS");
    			System.out.println("Total Amount after Discount = " +Total_Amount+ " RS");

      		}else {
    			System.out.println("Customer is Not Eligible for Discount ");

      		}

	
		if(Total_Amount> 1000 && Quantity>5) {
			
			System.out.println("Customer is Eligible for Special Offer(Free Gift)");
		}else {
			
			System.out.println("Customer is Not Eligible for Special Offer(Free Gift)");
	
			}

		}
	
	
	

			
	/*public static void CalculateDiscount(float totalprice, float Discount) {
		
	if(totalprice>1000) {
		System.out.println("Customer is Eligible for discount"  + Discount + " on theTotal Price");
		float Price_with_Discount = totalprice * Discount/100;
		System.out.println("Amount with Discount is: "  + Price_with_Discount + " RS");

	}else {
		
		System.out.println("Amount with Discount is: "  + Price_with_Discount + " RS");
	

	}*/
	
	
	

}



