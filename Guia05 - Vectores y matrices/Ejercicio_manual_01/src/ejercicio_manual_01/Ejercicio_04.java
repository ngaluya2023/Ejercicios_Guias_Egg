/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_manual_01;

import java.util.Random;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio_04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        
        
        for (int i = 0; i < 4; i++) {
    for (int j = 0; j < 4; j++) {
        matriz[i][j] = random.nextInt(10); // Generar un número aleatorio entre 0 y 9
    }
}
        
        
        
        
        
        for( int i = 0; i < 4;i++ ){
            for(int j = 0; j<4; i++ ){
            
                System.out.println(matriz[i][j]);
            
            }
        
        }
        
    }
    
}
