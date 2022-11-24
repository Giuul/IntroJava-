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
public class EJERCICIO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
        
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("ESCRIBIR FRASE:");
        
        String frase = leer.nextLine();
        
        System.out.println("LA PALABRA EN MAYUSCULA ES: "+ frase.toUpperCase());
        System.out.println("LA PALABRA EN MINUSCULA ES: "+ frase.toLowerCase());
        
    }
    
}
