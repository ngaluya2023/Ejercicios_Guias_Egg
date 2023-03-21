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
public class Ejercicio_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("por favor Ingrese el primer número");
        int num1 = leer.nextInt();
        System.out.println("Por favor, ingrese el segundo número");
        int num2 = leer.nextInt();
        int opc;
        String letra;
        do{
        System.out.println("Bienvenido a la calculadora");
        System.out.println("Por favor, eliga una opcion:");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividr");
        System.out.println("5 - Salir");
        opc = leer.nextInt();
        
        switch(opc){
            case 1:
                int suma = sumar(num1,num2);
                System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
                System.out.println("Desea volver al menú?");
                letra = leer.next();
                while(!letra.equals("n") && !letra.equals("s")){
                    System.out.println("Introdujo una opcion incorrecta, por favor ingrese S para si o N para no");
                    letra=leer.next();
                }
                if(letra.equals("s")){
                    opc = 0;
                }else{
                    opc = 5;
                }
                break;
            case 2:
                int resta = restar(num1,num2);
                System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);
                System.out.println("Desea volver al menú?");
                letra = leer.next();
                while(!letra.equals("n") && !letra.equals("s")){
                    System.out.println("Introdujo una opcion incorrecta, por favor ingrese S para si o N para no");
                    letra=leer.next();
                    System.out.println(letra);
                }
                if(letra.equals("s")){
                    opc = 0;
                }else{
                    opc = 5;
                }
                break;
            case 3:
                int multi = multiplicar(num1,num2);
                System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + multi);
                System.out.println("Desea volver al menú?");
                letra = leer.next();
                while(!letra.equals("n") && !letra.equals("s")){
                    System.out.println("Introdujo una opcion incorrecta, por favor ingrese S para si o N para no");
                    letra=leer.next();
                    System.out.println(letra);
                }
                if(letra.equals("s")){
                    opc = 0;
                }else{
                    opc = 5;
                }
                break;
            case 4: 
                float div = dividir(num1,num2);
                System.out.println("La division de " + num1 + " y " + num2 + " es: " + div);
                System.out.println("Desea volver al menú?");
                letra = leer.next();
                while(!letra.equals("n") && !letra.equals("s")){
                    System.out.println("Introdujo una opcion incorrecta, por favor ingrese S para si o N para no");
                    letra=leer.next();
                    System.out.println(letra);
                }
                if(letra.equals("s")){
                    opc = 0;
                }else{
                    opc = 5;
                }
                break;
        }   
        }while(opc !=5);
        System.out.println("Muchas Gracias por usar la Calculadora!");
    }
    
    public static int sumar(int num1, int num2){
        int adicion = num1 + num2;        
              
        return adicion;
    }
    
    public static int restar(int num1, int num2){
        int restacion = num1 - num2;
        
        return restacion;
    }
    
    public static int multiplicar(int num1, int num2){
        int multipli = num1 * num2;
        return multipli;
    }
    
    public static float dividir(float num1, float num2){
        float dividi = num1/num2;
        return dividi;
    }
}
