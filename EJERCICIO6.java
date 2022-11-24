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
public class EJERCICIO6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear un programa que dado un numero determine si es par o impar.*/
        Scanner leer = new Scanner (System.in);
        System.out.println("ESCRIBIR EL NUMERO:");
        int num = leer.nextInt();
        if (num % 2 == 0){
            System.out.println("EL NUMERO ES PAR!");
        }else{
            System.out.println("EL NUMERO ES IMPAR!");
        }
        
    }
    
}
