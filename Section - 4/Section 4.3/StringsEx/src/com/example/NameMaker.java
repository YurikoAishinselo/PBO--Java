/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import javax.swing.JOptionPane;


public class NameMaker {
    
    public static void main(String args[])
    {
        String custName = "Steve Smith";
        String middleName,lastName;
        
        int spaceIdx = custName.indexOf(" ");
        System.out.println("Index of space character is " +spaceIdx);
        // Get the index of the space character (" ") in custName. 

        String firstName = custName.substring(0,5);
        System.out.println("My first name is "+ firstName);
        // Use the substring method parse out the first name and print it.
        
        firstName =  JOptionPane.showInputDialog(null, "Your first Name");
        middleName = JOptionPane.showInputDialog(null, "Your middle Name");
        lastName = JOptionPane.showInputDialog(null,"Your last Name");
        
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println(fullName);
    }
    
}
