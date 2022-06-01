
import java.util.Scanner;

public class Kelvin {
    int tempC;
    private double celcius;
    Scanner suhu = new Scanner(System.in);
    
    public double Kelvin(){
    System.out.println("-------------------");
    System.out.print("Kelvin : ");
    tempC = suhu.nextInt();
    celcius = tempC - 273.15;
    return celcius;
    }
}
