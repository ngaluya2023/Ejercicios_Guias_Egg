/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01_manual;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio01_manual {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = leer.nextLine();
        int longitud = frase.length();
        String respuesta = convertir(frase,longitud);
        System.out.println(respuesta);
        }
        
    public static String convertir(String frase, int longitud){
        String convertido = "";
        for(int i = 1; i <=longitud;i++){
            String letra = frase.substring(i-1,i);
            switch(letra){
                case "a":
                    letra = "@";
                    break;
                case "e":
                    letra = "#";
                    break;
                case "i":
                    letra ="$";
                    break;
                case "o":
                    letra = "%";
                    break;
                case "u":
                    letra ="*";
                    break;
                default:
                    
                    break;
            }
            convertido = convertido + letra;
            
        }
        return convertido;
    }
    }
    

