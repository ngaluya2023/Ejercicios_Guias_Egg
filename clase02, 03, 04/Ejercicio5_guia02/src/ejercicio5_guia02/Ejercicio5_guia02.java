/*
 Escriba un programa en el cual se ingrese un valor limite positivo, y a 
continuacion solicite numeros al usuario hasta que la suma de los numeros 
introducidos supere el límite inicial.
 */
package ejercicio5_guia02;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio5_guia02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese el numero límite");
        int num = leer.nextInt();
        int num1;
        int sum = 0;
        while(num <0){
            System.out.println("Recuerde que el número debe ser positivo");
            num = leer.nextInt();
        }        
       do{
           
                   
           System.out.println("Por favor, ingrese un numero para sumar");
           num1=leer.nextInt();
           sum = sum + num1;
           
          }while(sum < num);
    }
    
}
