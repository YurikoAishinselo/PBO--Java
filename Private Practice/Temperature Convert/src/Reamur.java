import java.util.Scanner;
public class Reamur {
    int tempB;
    private int celcius;
    Scanner suhu = new Scanner(System.in);
  
    public int Reamur(){
    System.out.println("-------------------");
    System.out.print("Reamur : ");
    tempB = suhu.nextInt();
    celcius = tempB * 5/4;
    return celcius;
    }
}
