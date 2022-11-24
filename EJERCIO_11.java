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
public class EJERCIO_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: V Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.*/
        
        Scanner leer = new Scanner (System.in);
        System.out.println("BIENVENIDO AL PROGRAMA");
        System.out.println("INGRESE DOS NUMEROS ENTEROS POSITIVOS: ");
        
        int num1= leer.nextInt();
        int num2 = leer.nextInt();
        int op = 0;
        String opcion = "";
        do{
            System.out.println("SELECCINA UNA OPCION:");
            System.out.println("MENU\n" +
            "1. Sumar\n" +
            "2. Restar\n" +
            "3. Multiplicar\n" +
            "4. Dividir\n" +
            "5. Salir\n" +
            "Elija opción:");
            op = leer.nextInt();
            switch (op){
                case 1:
                    System.out.println("LA SUMA DE LOS NUMEROS SELECCIONADOS ES " + (num1+num2));
                    break;
                case 2:
                    System.out.println("LA RESTA DE LOS NUMEROS SELECCIONADO ES " + (num1-num2));
                    break;
                case 3:
                    System.out.println("LA MULTIPLICACION DE LOS NUMEROS SELECCIONADO ES " + (num1*num2));
                    break;
                case 4:
                    System.out.println("LA DIVISION  DE LOS NUMEROS SELECCIONADO ES " + (num1/num2));
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    opcion = leer.next();
                    
            }
            } while (!opcion.equalsIgnoreCase("S"));
                    
    }
    
}
