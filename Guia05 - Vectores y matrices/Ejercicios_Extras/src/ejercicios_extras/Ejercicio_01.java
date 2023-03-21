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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int num = leer.nextInt();
        int num1;
        int suma;
        int[] vector = new int[num];
        llenarVector(vector, num, leer);
        suma=sumarElementos(vector,num);
        System.out.println("La sumas de los vectores es :" + suma);
        
        
    }
    
    public static void llenarVector(int[] vector, int num, Scanner leer){
        int num1;
    for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un numero en la posicion " + i );
            num1 = leer.nextInt();
            vector[i]=num1;
            
        }
        for (int i = 0; i < num; i++) {
            System.out.print("[ " + vector[i] + " ]" + " ");
        }
        
    }
    
    public static int sumarElementos(int[] vector, int num){
        int suma = 0;
        for (int i = 0; i < num; i++) {
            suma = suma + vector[i];
        }
    
    return suma;
    }
}
