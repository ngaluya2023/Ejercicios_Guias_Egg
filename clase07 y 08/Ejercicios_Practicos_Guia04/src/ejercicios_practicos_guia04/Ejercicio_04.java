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
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero para saber si es primo o no");
        int primo = leer.nextInt();
        
        String frase = "";
        boolean resultado = esPrimo(primo);
        if(resultado == true){
            frase = " es primo";
        }else{
            frase = " no es primo";
        }
        System.out.println("El numero " + primo + frase );
    }
    
    public static boolean esPrimo(int primo){
        int contador = 0;
        boolean primito = false;
        
        if(primo <=1){
            primito = false;
        }else {
        
        for(int i=1; i<=primo;i++){
            if(primo % i == 0){
                contador = contador + 1;
                
            }
            if(contador == 2){
               primito = true; 
            }else if(contador >2){
                primito = false;
            }else {
                primito = false;
            
        }
        }
        }
        
        
    
    return primito;
}
}