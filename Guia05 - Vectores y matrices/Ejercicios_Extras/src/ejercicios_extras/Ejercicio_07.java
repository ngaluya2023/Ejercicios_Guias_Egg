/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_extras;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio_07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor, ingrese un numero");
        int numero = leer.nextInt();
        int[] vector = new int[numero];
        
        if(numero == 1 || numero == 0){
            System.out.println("La respuesta es 1");
        }else{
                vector[0] = 1;
                vector[1] = 1;
            for (int i = 2; i < numero; i++) {
                
                vector[i] = vector[i-1] + vector[i-2];
                              
            }
        
        }

        for (int i = 0; i < numero; i++) {
            System.out.print("[ " + vector[i] + " ]" + " ");
        }
        
    }
    
}
