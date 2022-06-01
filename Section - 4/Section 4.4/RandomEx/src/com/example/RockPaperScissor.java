/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Random;



public class RockPaperScissor {

    public static void main(String[] args) {
        Random sign = new Random ();
        int randomSign = sign.nextInt(3);
        System.out.println(randomSign);
        if (randomSign == 0){
            System.out.println("Rock");
        }
        else if (randomSign == 1){
            System.out.println("Paper");
        }
        else {
            System.out.println("Scissor");
        }
              
    }
}
