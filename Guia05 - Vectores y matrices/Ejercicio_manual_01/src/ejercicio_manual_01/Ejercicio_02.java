/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_manual_01;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        int[] vector = new int[50];
        System.out.println("Ingrese el numero a buscar");
        int num = leer.nextInt();
        int contador = 0;
        for(int i =0; i<50; i++){
        vector[i] = random.nextInt(100);
        }
         for(int i =0; i<50; i++){
             if(num == vector[i]){
                 contador = contador + 1;
                 System.out.println("El numero ingresado se ubica en la posicion " + i + " del vector");
             }
        }
        if(contador ==0){
            System.out.println("El numero ingresado no fue encontrado dentro del vector");
        }
        
    }
    
}
