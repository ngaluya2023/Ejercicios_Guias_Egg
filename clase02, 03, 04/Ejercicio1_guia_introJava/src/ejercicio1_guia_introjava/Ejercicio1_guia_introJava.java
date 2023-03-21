/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_guia_introjava;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio1_guia_introJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = leer.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
    }
    
}
