package com.example;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class ColorRange {

    public static void main(String args[]) {
        String waveLength = JOptionPane.showInputDialog(null, "Enter a color code ");
        double waveLengthConvert = Double.parseDouble(waveLength);
        
        if(waveLengthConvert>=380.0 && waveLengthConvert <450.0){
        System.out.println("The color is Violet");
        }
        else if(waveLengthConvert>=450.0 && waveLengthConvert <495.0){
        System.out.println("The color is Blue");
        }
        else if(waveLengthConvert>=495.0 && waveLengthConvert <570.0){
        System.out.println("The color is Green");
        }
        else if(waveLengthConvert>=570.0 && waveLengthConvert <590.0){
        System.out.println("The color is Yellow");
        }
        else if(waveLengthConvert>=590.0 && waveLengthConvert <620.0){
        System.out.println("The color is Orange");
        }
        else if(waveLengthConvert>=620.0 && waveLengthConvert <750.0){
        System.out.println("The color is Red");
        }
        else{
        System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
    }
}
