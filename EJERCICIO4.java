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
public class EJERCICIO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
       Scanner leer = new Scanner(System.in);
        System.out.println("ESCRIBIR LA TEMPERATURA EN GRADOS CENTIGRADOS:");
        double temp = leer.nextDouble();
        System.out.println("LA TEMPERATURA EN FAHRENHEIT ES: "+ (32 + (9 * temp / 5)) );
       
    }
    
}
