/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_guia_introjava;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio_guia_introJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        System.out.println("Primero en minusculas");
        System.out.println(frase.toLowerCase());
        System.out.println("");
        System.out.println("Ahora en mayúsculas");
        System.out.println(frase.toUpperCase());
        
    }
    
}
