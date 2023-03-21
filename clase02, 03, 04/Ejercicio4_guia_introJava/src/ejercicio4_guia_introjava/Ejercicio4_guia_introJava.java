/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4_guia_introjava;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio4_guia_introJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la temperatura en celsius");
        double grados = leer.nextDouble();
        double fareheint = 32 + (9* (grados/5));
        System.out.println(fareheint);
    }
    
}
