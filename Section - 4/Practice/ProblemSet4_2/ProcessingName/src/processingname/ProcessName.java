
package processingname;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class ProcessName {
    
    
public static void main(String[] args) {
    String totWord = JOptionPane.showInputDialog(null,"Numbers of word in your name");
     int totWordConvert = Integer.parseInt(totWord);
     if (totWordConvert == 2){
       String name; 
       Scanner Fullname = new Scanner(System.in);
       System.out.print("Type your Full name : ");
       name = Fullname.nextLine();
       int totIdx = name.length();
       int firstDashIdx = name.indexOf(" ");
       String firstName = name.substring(0, firstDashIdx);
       char firstLetter = firstName.charAt(0);
       
       firstDashIdx = firstDashIdx + 1;
       String secondName = name.substring(firstDashIdx,totIdx);
       System.out.println("Your name is : " + secondName + ", " + firstLetter);
     }
     else if (totWordConvert == 3){
       String name; 
       Scanner Fullname = new Scanner(System.in);
       System.out.println("Type your Full name : ");
       name = Fullname.nextLine();
       int totIdx = name.length();
       int firstDashIdx = name.indexOf(" ");
       int secondDashIdx = name.indexOf(" ",firstDashIdx+1);
       
       String firstName = name.substring(0, firstDashIdx);
       char firstLetter = firstName.charAt(0); 
       
       firstDashIdx = firstDashIdx + 1;
       secondDashIdx = secondDashIdx + 1;
       
       String secondName = name.substring(firstDashIdx,secondDashIdx);
       String lastName = name.substring(secondDashIdx, totIdx);
       System.out.println("Your name is : " + lastName + " " + secondName + ", "+ firstLetter);
     }   
    }
}