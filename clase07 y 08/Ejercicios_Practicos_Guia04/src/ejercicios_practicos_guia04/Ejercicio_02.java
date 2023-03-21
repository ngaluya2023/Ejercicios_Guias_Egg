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
public class Ejercicio_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        String opc;
        do{
            System.out.println("Ingrese el nombre");
            nombre = leer.next();
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
            nombreyEdad(nombre,edad);
            System.out.println("Desea Seguir Agregando personas?");
            opc = leer.next();
            }while(!opc.equalsIgnoreCase("n"));
        System.out.println("Gracias!");
        
        
    
}
    public static void nombreyEdad(String nombre, int edad){
        String mayoria;
        if(edad <18){
            mayoria = "menor de edad";
        }else {
            mayoria = "mayor de edad";
        }
        System.out.println(nombre + " es " + mayoria);
    }
}