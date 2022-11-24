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
public class EJERCICIO_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
        
        Scanner leer = new Scanner (System.in);
        System.out.println("ESCRIBA VALOR LIMITE:");
        int limit = leer.nextInt();
        int suma = 0;
        do{
            System.out.println("INGRESE UN NUMERO");
            int num = leer.nextInt();
            suma = suma + num;
            System.out.println("LA SUMA DE LOS NUMEROS INGRESADOS HASTA AHORA ES DE: " + suma);
        }while (suma <= limit);
        System.out.println("LO SIENTO, HAZ PASADO EL VALOR LIMITE");
    }
    
}
