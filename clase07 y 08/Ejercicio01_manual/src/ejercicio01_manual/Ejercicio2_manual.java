/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01_manual;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio2_manual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        System.out.println("Ingrese un segundo número");
        int num2 = leer.nextInt();
        esMultiplo(num1, num2);

    }
    
    public static void esMultiplo(int num1, int num2){
    
   if(num1 % num2 ==0){
       System.out.println(num1 + " es multplo de " + num2);
   }else{
       System.out.println(num1 + " no es multplo de " + num2);
   }
    
}
}