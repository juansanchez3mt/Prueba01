/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.reto_1;

import java.util.Scanner;

/**
 *
 * @author juanesteban
 */
public class Reto1 {
    
    private final Scanner scanner = new Scanner(System.in);
    
    public String read(){
        return this.scanner.nextLine();
    }
    
    public static void main(String[] args) {
        
        Reto1 en = new Reto1();
        String cadena = "";
        cadena = en.read();
        String[] valores = cadena.split(" ");
        float a = Float.parseFloat(valores[0]);
        float b = Float.parseFloat(valores[1]);
        float c = Float.parseFloat(valores[2]);
        
        if (a<0 || a>150 || b<0.1 || b>2.5 || c<0 || c>110){
            System.out.println("ERROR");
        } else {
            
            float elevado = (float) Math.pow(b, 2);
            float imc = a/elevado;
            if (imc < 22 && c<45){
                System.out.println(String.format("%.1f",imc)+" "+"Bajo");
            }
            if (imc < 22 && c>=45){
                System.out.println(String.format("%.1f",imc)+" "+"Medio");
            }
            if (imc >= 22 && c<45){
                System.out.println(String.format("%.1f",imc)+" "+"Medio");
            }
            if (imc >= 22 && c>=45){
                System.out.println(String.format("%.1f",imc)+" "+"Alto");
            }
           
        }
      
     
    }
    
}
