
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase 5 "+itemDesc;
        
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 10.3,
               tax = 1,
               quantity = 5,
               totalPrice;
               
        
        
        // Declare and assign a calculated totalPrice
        totalPrice = (price+tax)*quantity;
        
        // Modify message to include quantity 
        
        System.out.println(message);
        
        // Print another message with the total cost
        System.err.println("Total cost with tax is : $"+totalPrice);
        
    }    
}
