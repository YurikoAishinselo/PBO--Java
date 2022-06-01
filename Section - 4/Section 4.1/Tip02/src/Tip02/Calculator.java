
package Tip02;

public class Calculator {
    public double tax = 0.05;
    public double tip = 0.15;  //Change tax and tip if you prefer different values
    public double originalPrice = 0;
    
    public void findTotal(){
        originalPrice = originalPrice + (originalPrice*(0.05+0.15));
        System.out.println(originalPrice);
        //Calculate an individual's total after tax and tip
        //Print this value
    }
}
