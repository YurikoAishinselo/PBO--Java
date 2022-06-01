
package com.example;

import javax.swing.JOptionPane;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        String currentColor = JOptionPane.showInputDialog(null,"Enter a color code ");
        int currentColorConvert = Integer.parseInt(currentColor);
        
        switch (currentColorConvert) {
            case 1 : System.out.println("Next Traffic Light is Green");
            case 2 : System.out.println("Next Traffic Light is Yellow");
            case 3 : System.out.println("Next Traffic Light is Red");  
                break;
            default:
                System.out.println("Invalid color");
        }
       
    }

}
