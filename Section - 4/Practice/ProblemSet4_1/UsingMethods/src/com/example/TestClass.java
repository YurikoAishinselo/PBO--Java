package com.example;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class TestClass {

    public static void main(String args[]) {
        ComputeMethods calc = new ComputeMethods();
        Scanner Sc = new Scanner(System.in);
        System.out.print("Masukkan Suhu Fahrenheit : ");
        double fahrenheit = Sc.nextDouble();
        fahrenheit = fahrenheit * 1.0;
        double Celcius = calc.fToC(fahrenheit);
        System.out.println("Temp in Celcius is : "+Celcius);
        
        System.out.println("");
        
        System.out.print("Masukkan sisi a : ");
        int a = Sc.nextInt();
        System.out.print("Masukkan sisi b : ");
        int b = Sc.nextInt();
        int c = calc.hypotenuse(a, b);
        System.out.println("Hypotenuse is : "+ c);
        
        System.out.println("");
        
        int num = calc.roll();
        System.out.println("The sum of the dice values : "+ num);
        
        
        
        //Create an instance of ComputeMethods, 
        //invoke the 3 methods and dispay their results
    }
}
