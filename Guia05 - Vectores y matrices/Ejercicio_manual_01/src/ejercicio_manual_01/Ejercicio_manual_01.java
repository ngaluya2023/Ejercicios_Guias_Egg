/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_manual_01;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio_manual_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String [] equipo = new String[5];
        
        for(int i=0; i<5;i++){
            System.out.println("Por favor ingrese el nombre de su compañero n° " + i);
            String nombre = leer.next();
            equipo[i]=nombre;
        }
        
        for(int i =0; i<5; i++){
            System.out.println("[ " + equipo[i] + " ]");
        }
    }
    
}
