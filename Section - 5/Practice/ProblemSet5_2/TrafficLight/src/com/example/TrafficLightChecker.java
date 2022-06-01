package com.example;
import javax.swing.JOptionPane;


public class TrafficLightChecker {

    public static void main(String args[]) {
      String currentColor = JOptionPane.showInputDialog(null,"Enter a color code ");
      int currentColorConvert = Integer.parseInt(currentColor);
      
      if   (currentColorConvert == 1){
            System.out.println("Next Traffic Light is Green");
      }
      else if (currentColorConvert == 2){
            System.out.println("Next Traffic Light is Yellow");
      } 
      else if (currentColorConvert == 3){
            System.out.println("Next Traffic Light is Red");
      } 
      else{
          System.out.println("Invalid color");
      }
    }

}
