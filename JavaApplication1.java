/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Yahya
 */
public class JavaApplication1 {

    public static void main(String[] args) {

    int nilaiA =10;
    int nilaiB =20;
    double var1 = 5.5;
    double var2 = 4.5;
    boolean isplus = true ;
            
    System.out.println("angkaA = "+nilaiA); 
    System.out.println("angkaA = "+nilaiB);  
    System.out.println("var1= "+nilaiA);
    System.out.println("var2= "+nilaiB);
    System.out.println("isplus= "+isplus);
    
    
    Scanner inputSaya = new Scanner (System.in);
    System.out.println("Inputkan nilaiA baru: ");
    nilaiA = inputSaya.nextInt();
    System.out.println("Inputkan nilaiB baru: ");
    nilaiB = inputSaya.nextInt();
    System.out.println("Inputkan var1 baru: ");
    var1 = inputSaya.nextDouble();
    System.out.println("inputkan var2 baru: ");
    var2 = inputSaya.nextDouble();
    System.out.println("inputkan isplus baru: ");
    isplus = inputSaya.nextBoolean();
    
    
    System.out.println("nilaiA yang baru = "+nilaiA);
    System.out.println("nilaiB yang baru = "+nilaiB);
    System.out.println("var double pertama yang baru = "+var1);
    System.out.println("var double kedua yang baru = "+var2);
    System.out.println("var double pertama yang baru = "+isplus);
    }
    
}