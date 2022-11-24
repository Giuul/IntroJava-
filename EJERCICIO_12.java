/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author Beatriz
 */
public class EJERCICIO_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().*/
       String FDE= "&&&&&";
       String cadena;
       Scanner leer = new Scanner(System.in);
       int correcto = 0, incorrecto = 0; 
        
        do{
            System.out.println("INGRESE LA CADENA:");
            cadena = leer.next();
            if(cadena.length()<=5 && cadena.substring(0,1).equalsIgnoreCase("x") && cadena.substring(cadena.length()-1).equals("o")){
                correcto++;
            }else{
                incorrecto++;
            }
            
        }while(!cadena.equals(FDE));
        
        System.out.println("CANTIDAD DE LECTURAS CORRECTAS: "+ correcto);
        System.out.println("CANTIDAD DE LECTURAS INCORRECTAS: "+ (incorrecto-1));
      
       
       
       
    }
}
       
    
   
