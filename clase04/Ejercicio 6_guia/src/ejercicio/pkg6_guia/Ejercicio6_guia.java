/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6_guia;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio6_guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
         System.out.println("Ingrese el primer numero");
         int num1 = input.nextInt(); 
         System.out.println("Ingrese el segundo numero");
         int num2 = input.nextInt(); 
         String confirm ="N";
         do {
             System.out.println("Por favor, elija una opcion");
             System.out.println("1 - Sumas");
             System.out.println("2 - Restar");
             System.out.println("3 - Multiplicar");
             System.out.println("4 - Dividr");
             System.out.println("5 - Salir");
             int opc = input.nextInt(); 
             
             switch(opc){
                 case 1: 
                     int suma = num1 + num2;
                     System.out.println("La suma de " + num1 + " y de " + num2 + " es: " + suma);
                     confirm = "N";
                     break;
                     
                 case 2:
                     int resta = num1 - num2;
                     System.out.println("La resta de " + num1 + " y de " + num2 + " es: " + resta);
                     confirm = "N";
                     break;
                 case 3:
                     int mult = num1 * num2;
                     System.out.println("La multiplicación de " + num1 + " y de " + num2 + " es: " + mult);
                     confirm = "N";
                     break;
                 case 4:
                     int div = num1 / num2;
                     System.out.println("La división de " + num1 + " y de " + num2 + " es: " + div);
                     confirm = "N";
                     break;
                 case 5:
                     
                     System.out.println("Está seguro que desea salir?");
                     System.out.println("S para si o N para no");
                     String yesNo = input.next();
                     while (!"S".equals(yesNo) && !"N".equals(yesNo)){
                         System.out.println("Opcion incorrecta, por favor elija "
                                 + "S para si o N para no");
                         yesNo = input.next();
                     }
                     confirm = yesNo;
                     break;
                     
                     
                     
             default:
                 System.out.println("La opción ingresada no es correcta");
                 confirm = "N";
                 break;
         }
    
    
    }while(confirm.equalsIgnoreCase("N"));
}
}