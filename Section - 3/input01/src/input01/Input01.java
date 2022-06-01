package input01;

import javax.swing.JOptionPane;

public class Input01 {
    public static void main(String[] args) {
  
        //Create a JOptionPane.
        String input = JOptionPane.showInputDialog("Type something");
        //Store the input as a String and print it.
        System.out.println(input);
        
        
        //Parse the input as an int.
        //Print its value +1
        System.out.println(Integer.parseInt(input)+1);

        
        
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.

        
    }
}
