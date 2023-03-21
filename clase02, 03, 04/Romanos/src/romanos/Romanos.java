/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romanos;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Romanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String romano = "";
        int num = 0;
        if(num ==1){
            romano = "I";
        }
        if(num == 5){
            romano = "V";
        }
        if (num ==10) {
            romano ="X";
        }
        
        num =3;
        
        for(int i=0; i<num;i++){
            
            System.out.println("I");
            
        }
    }
    
}
