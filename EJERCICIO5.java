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
public class EJERCICIO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/

        Scanner leer = new Scanner(System.in);
        System.out.println("ESCRIBI UN NUMERO: ");
        int num = leer.nextInt();
        System.out.println("EL DOBLE DEL NUMERO ELEGIDO ES: " + (num*2) );
        System.out.println("EL TRIPLE ES: " + (num*3));
        System.out.println("Y LA RAIZ ES: " + Math.sqrt(num));
    }
    
}
