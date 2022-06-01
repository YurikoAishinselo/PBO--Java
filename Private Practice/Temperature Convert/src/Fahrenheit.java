
import java.util.Scanner;

public class Fahrenheit {
    private int celcius;
    int tempA;
    Scanner suhu = new Scanner(System.in);
    
    
    public int Fahrenheit(){
    System.out.println("-------------------");
    System.out.print("Fahrenheit : ");
    tempA = suhu.nextInt();
    celcius = (tempA-32) * 5/9;
    return celcius;
    }
}
 
