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
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        char[][] sopa = new char[20][20];
        
        
        llenarMatriz(leer, sopa); 
        llenarNumero(sopa);
        escribirMatriz(sopa);
    }  
    
    public static void llenarMatriz(Scanner leer, char[][] sopa) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Por favor, ingrese la palabra " + (i+1));
            String palabra = leer.next();
            
            while (palabra.length() < 3 || palabra.length() > 5) {            
                System.out.println("Por favor, ingrese una palabra que contenga entre 3 y 5 caracteres");
                palabra = leer.next();
            }
            
            int fila = (int) (Math.random() * 20);
            int columna = (int) (Math.random() * (20 - palabra.length() + 1));
            
            for (int j = 0; j < palabra.length(); j++) {
                sopa[fila][columna+j] = palabra.charAt(j);
            }
        }
    }
    
    public static void escribirMatriz(char[][] sopa) {    
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(sopa[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void llenarNumero(char[][] sopa){
    
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                
                if(sopa[i][j] == '\0'){
                int numero = (int) (Math.random()*9+1);
                sopa[i][j] = (char) (numero + '0');
                }
                
            }
            
        }
    
    }
   
    
}
