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
public class EJERCICIO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/
       Scanner leer = new Scanner(System.in);
        System.out.println("INGRESA TU NOMBRE: ");
        String nombre = leer.nextLine();
        System.out.println("Gracias por ingresar " + nombre );
       
    }
    
}
