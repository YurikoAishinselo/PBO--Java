import java.util.Scanner;
public class Main {
    public void temp(){
        Scanner object = new Scanner(System.in);
        System.out.println("Celcius Temperature Convert ");
        System.out.println("Choice it (Type the number)");
        System.out.println("1.Fahrenheit");
        System.out.println("2.Reamur");
        System.out.println("3.Kelvin");
        System.out.print("Temperature : ");
        int choice = object.nextInt();
   
        switch (choice){
            case 1 : Fahrenheit a = new Fahrenheit();
                     System.out.println("Celcius = "+a.Fahrenheit());
            break;
            case 2 : Reamur b = new Reamur();
                     System.out.println("Celcius = "+b.Reamur());
            break;
            case 3 : Kelvin c = new Kelvin();
                     System.out.println("Celcius = "+c.Kelvin());
            break;
        }
    }
    public static void main(String[] args) {
        Scanner convert = new Scanner(System.in);
        boolean ans = true;
        Main temp = new Main();
        
        String answer;
        while(ans!=false){
            System.out.println("");
            System.out.println("-------------------");
            temp.temp();
            System.out.print("Convert again (yes/no) ?");
            answer = convert.nextLine();
                if (answer.equalsIgnoreCase("yes")){
                     ans = true;
                    System.out.println("yes");
                    }
                else {
                    System.out.println("no");
                     ans = false;
                    }
            System.out.println("end");
        }
        System.out.println("Thx");
    }
}
