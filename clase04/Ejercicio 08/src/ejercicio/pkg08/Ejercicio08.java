/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg08;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        for(int i=1; i<num;i++){
            System.out.print("*");
             }
        for (int j=1;j<=num-1;j++){
                System.out.println("*");
                
            }
        
    }
    
}
