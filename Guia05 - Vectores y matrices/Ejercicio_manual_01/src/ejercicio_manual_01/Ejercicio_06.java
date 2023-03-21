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
public class Ejercicio_06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int num;
        boolean magic = false;
        for(int i =0; i<3;i++){
            for(int j=0; j<3;j++){
                System.out.println("Ingrese un numero para la posicion " + i + " " + j);
                num =leer.nextInt();
                while(num<1 || num>9){
                    System.out.println("El numero ingresado debe estar entre 1 y 9");
                    num = leer.nextInt();
                }
                matriz[i][j]=num;
            }
            }
        
        boolean fila = fila(matriz);
        boolean columna = columna(matriz);
        boolean diagonal = diagonal(matriz);
        if(fila ==true && columna == true && diagonal == true){System.out.println("El cuadrado es magico");}else{System.out.println("El cuadrado no es magico");}
    }
    
    
    public static boolean fila(int[][] matriz){
        int numfx=0;
        int numf1=0;
        boolean fila = false;
        for (int j = 0; j < 3; j++) {
            numfx = numfx + matriz[0][j];
            numf1 = numf1 + matriz[1][j];
        }
        if(numf1 == numfx){
            numf1 =0;
            for (int j = 0; j < 3; j++) {
                numf1 = numf1 + matriz[2][j];
            }
            if(numf1==numfx){fila=true;}else{fila=false;}
        }else{fila = false;}
        
        return fila;
    }
    
    public static boolean columna(int[][] matriz){
        int numfx=0;
        int numf1=0;
        boolean columna = false;
        for (int i = 0; i < 3; i++) {
            numfx = numfx + matriz[i][0];
            numf1 = numf1 + matriz[i][1];
        }
        if(numf1 == numfx){
            numf1 =0;
            for (int i = 0; i < 3; i++) {
                numf1 = numf1 + matriz[i][2];
            }
            if(numf1==numfx){columna=true;}else{columna=false;}
        }else{columna = false;}
        
        return columna;
        
    
    }
    
    public static boolean diagonal(int [][] matriz){
    int numfx=0;
    int numf1=0;
    boolean diagonal = false;
        numf1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        numfx = matriz[2][0] + matriz[1][1] + matriz[0][2];
        if(numf1==numfx){diagonal = true;}else{diagonal = false;}
    return diagonal;
    }
}