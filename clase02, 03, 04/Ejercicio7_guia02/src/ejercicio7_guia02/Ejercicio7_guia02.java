/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package ejercicio7_guia02;

import java.util.Scanner;

/**
 *
 * @author nicolas.g
 */
public class Ejercicio7_guia02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        int num;
        int correcto = 0;
        int incorrecto=0;
        
        do {
        System.out.println("Ingrese una frase");
        frase = leer.next();
        num = frase.length();
        
        
        while(num > 5){
            System.out.println("La palabra ingresada debe tener 5 "
                    + "o menos caracteres");
            frase = leer.next();
            num = frase.length();
            break;
            }
        String letraIni = frase.substring(0, 1);
        String letraFin = frase.substring(num-1, num);
         if("&&&&".equals(frase.substring(0, num))){
             break;
         }else if(letraIni.equals("x")){
                if(letraFin.equals("o")){
                  correcto = correcto + 1;
        }else{
                incorrecto = incorrecto + 1;
            }
        }else{
            incorrecto = incorrecto + 1;
        }
        
        
        }while(!"&&&&".equals(frase.substring(0, num)));
        System.out.println("Correctas " + correcto );
        System.out.println("Incorrectas " + incorrecto);
    }
    
}
