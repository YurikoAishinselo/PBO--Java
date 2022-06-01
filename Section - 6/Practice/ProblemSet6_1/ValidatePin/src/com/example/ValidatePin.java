package com.example;

import java.util.Scanner;

public class ValidatePin {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Your PIN : ");
        int PIN = Sc.nextInt();
        
        
        while (PIN != 233456){
               System.out.println("Your PIN is Incorrect !!");
               System.out.print("Your PIN : ");
               PIN = Sc.nextInt();
            }
        System.out.println("Your PIN is Correct");
    }
}
