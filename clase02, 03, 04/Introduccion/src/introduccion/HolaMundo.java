/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccion;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos una variable Scanner que se utiliza para leer datos del usuario
        Scanner leer = new Scanner(System.in);
        //creamos una nueva variable
        String nombre;
        //muestra un msj por pantalla
        System.out.println("Ingresa tu nombre");
        //leemos el nombre
        nombre = leer.next();
        System.out.println("Hola, soy " + nombre + " y aprendo");
        
        
    }
    
}
