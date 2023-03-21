/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_practicos_guia04;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese la cantidad de euros");
        double euros = leer.nextInt();
        conversor(euros);
    }
    public static void conversor(double euros){
        
        double libras = euros * 0.86;
        double dolares = euros * 1.28611;
        double yenes = euros * 129.852;
        
        System.out.println(euros + " euros, son: ");
        System.out.println();
        System.out.println(libras + " libras" );
        System.out.println();
        System.out.println(dolares + " dolares");
        System.out.println();
        System.out.println(yenes + "yenes");
    }
    
}
