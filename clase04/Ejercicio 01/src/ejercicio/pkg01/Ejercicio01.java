/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg01;

import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in); 
       System.out.println("Ingrese un numero entero");
       int num1;
       num1 = input.nextInt();
       System.out.println("Ingrese el segundo numero");
       int num2;
       num2 = input.nextInt();
       
       if(num1>25 || num2 >25){
           System.out.println("Uno de los dos numeros ingresados en mayor a 25");
    }else {
           System.out.println("Ninguno de los dos numeros ingresados en mayor a 25");
       }
    
}
}