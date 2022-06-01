/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;


public class ComputeMethods {
   public double fToC(double fahrenheit){
       double temperature = 5.0/9.0 * (fahrenheit - 32);
       return temperature;
   }
   public int hypotenuse (int a, int b){ 
       a = (int) Math.pow(a, 2);
       b = (int) Math.pow(b, 2);
       int c = (int) Math.sqrt(a+b);
       return c;
   }
   public int roll(){
       int num1 = (int) ((Math.random()*6)+1);
       int num2 = (int) ((Math.random()*6)+1);
       int num = num1 + num2;
       return num;
   } 
    
}

