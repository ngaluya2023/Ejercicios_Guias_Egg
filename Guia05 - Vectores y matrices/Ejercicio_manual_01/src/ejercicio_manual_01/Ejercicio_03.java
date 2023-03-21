/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_manual_01;

import java.util.Random;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio_03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[100];
        Random random = new Random();
        for(int i = 0; i<100; i++){
        vector[i] = random.nextInt(90000);
        }
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        for (int i = 0; i<100; i++){
        
        int num = String.valueOf(vector[i]).length(); 
        switch(num){
            case 5:
                contador5 = contador5 + 1;
                break;
            case 4:
                contador4 = contador4 + 1;
                break;
            case 3:
                contador3 = contador3 + 1;
                break;
            case 2:
                contador2 = contador2 + 1;
                break;
            case 1:
                contador1 = contador1 + 1;
                break;
        
        }
        
        }
        
        System.out.println("La matriz contiene " + contador1 + " numeros de un dígito");
        System.out.println("La matriz contiene " + contador2 + " numeros de dos dígito");
        System.out.println("La matriz contiene " + contador3 + " numeros de tres dígito");
        System.out.println("La matriz contiene " + contador4 + " numeros de cuatro dígito");
        System.out.println("La matriz contiene " + contador5 + " numeros de cinco dígito");
    }
    
}
