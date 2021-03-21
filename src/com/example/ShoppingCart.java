
package com.example;

public class ShoppingCart {

    public static void main(String[] args) {
        String custName = "Mary Smith";
        String itemDesc = "Shirt";

	// numeric fields
        double price = 21.99;
        int quantity = 0;
        double tax = 1.04;
	double total;
	String message = custName+ " wants to purchase " + quantity + " "+ itemDesc;

	// Calculating total cost
        total = (price*quantity)*tax;

        
        // Declare outOfStock variable and initialize it
        boolean outOfStock;
        outOfStock=false;
        
        
        // Test quantity and modify message if quantity > 1.  
        if(quantity>1)
        {
            itemDesc="shirts";
            message=custName+" wants to purchase " + quantity + " "+ itemDesc;
            System.out.println(message);
            System.out.println("The total price is: " +  total);
        }
        
        // Test outOfStock and notify user in either case.  
        if(quantity<1)
        {
            outOfStock=true;
            System.out.println("the item " + itemDesc + "is out of Stock: " + outOfStock);
            
        }
        
        
    }
    
}


