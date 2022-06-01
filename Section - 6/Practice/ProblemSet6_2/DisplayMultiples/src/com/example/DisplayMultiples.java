package com.example;

import java.util.Scanner;

public class DisplayMultiples {

    public static void main(String args[]) {
       System.out.print("Input a random number : ");
       Scanner Sc = new Scanner(System.in);
       int number = Sc.nextInt();
       for (int a=1; a<13;a++){
           int Value = number * a;
           System.out.println(Value);
        }

    }
}
