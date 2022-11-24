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
public class EJERCICIO_17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/
 
        
        Scanner leer = new Scanner (System.in);
        System.out.println("DETERMINE LA CANTIDAD DE NUMEROS QUE DESEA INGRESAR: ");
        int tamañoV = leer.nextInt();
        int vector[]= new int[tamañoV];
        int contador1 = 0 , contador2 = 0, contador3 = 0 , contador4 =0 , contador5 = 0;
        
        //RELLENO VECTOR CON NUMEROS ALEATORIOS
        for (int i = 0; i < tamañoV; i++){
            System.out.println("INGRESE UN NUMERO: ");
            vector[i] = leer.nextInt();
            if (vector[i]<10){
                contador1++;
            }else if(vector[i]<100){
                contador2++;
            }else if(vector[i]<1000){
                contador3++;
            }else if(vector[i]<10000){
                contador4++;
            }else if (vector[i]<100000){
                contador5++;
            }      
        }
        System.out.println("HAZ INGRESADO "+ contador1+ " NUMEROS DE UN DIGITO");
        System.out.println("HAZ INGRESADO "+ contador2+ " NUMEROS DE DOS DIGITOS");
        System.out.println("HAZ INGRESADO "+ contador3+ " NUMEROS DE TRES DIGITOS");
        System.out.println("HAZ INGRESADO "+ contador4+ " NUMEROS DE CUATRO DIGITOS");
        System.out.println("HAZ INGRESADO "+ contador5+ " NUMEROS DE CINCO DIGITOS");
    }
    
}
