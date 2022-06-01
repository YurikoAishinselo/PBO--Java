package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "12",
               taxRate = "0.04",
               gibberish = "67849xkl";
        double totalTax;
       
        totalTax = Double.parseDouble(taxRate) * Integer.parseInt(shirtPrice);
        System.out.println(totalTax);

        //Parse shirtPrice and taxRate, and print the total tax
        System.out.println(Integer.parseInt(gibberish)+2); // Error
        
        
        
        //Try to parse taxRate as an int
        
        //Try to parse gibberish as an int
        
    }
    
}
