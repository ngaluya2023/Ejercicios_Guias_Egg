/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5_guia_introjava;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio5_guia_introJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int num = leer.nextInt();
        System.out.println("El doble de " + num + " es: " + num*2);
        System.out.println("//////////////////////////");
        System.out.println("El trible de " + num + " es: " + num*3);
        
    }
    
}
