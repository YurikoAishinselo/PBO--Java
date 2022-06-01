package ArcadeGame;

import java.util.Scanner;



public class MainTest {
    public void loop (){
        Cards crd1 = new Cards(001, 1, 0);
         Cards crd2 = new Cards(002, 1, 0);
         Games gm = new Games();
         Terminals tm = new Terminals();
         tm.convert(crd1);
         tm.transferBalance(crd1, crd2);
         gm.swipe(crd2);
         tm.transferTicket(crd1, crd2);
         tm.exchange(crd2);
    }
    
     public static void main(String[] args) {
         
         Scanner convert = new Scanner(System.in);
        boolean ans = true;
        MainTest loop = new MainTest();
        
        String answer;
        while(ans!=false){
            loop.loop();
            System.out.print("Play again (yes/no) ?");
            answer = convert.nextLine();
                if (answer.equalsIgnoreCase("yes")){
                     ans = true;
                    System.out.println("yes");
                    }
                else {
                    System.out.println("no");
                     ans = false;
                    }
            System.out.println("Good Luck");
            System.out.println("-------------------------");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("-------------------------");
        }
        System.out.println("Thx for play this game");
        
     }
}
