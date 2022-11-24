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
public class EJERCICIO_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/
        Scanner leer = new Scanner (System.in);
        System.out.println("INGRESE TAMAÑO DEL VECTOR: ");
        int tamaño = leer.nextInt();
        int vector[]= new int[tamaño];
        int posicion = 0;
        
        for (int i = 0; i < tamaño; i++){
            vector[i] = (int) (Math.random()*10+1); 
           
        }
        
        System.out.println("INGRESE NUMERO A BUSCAR: ");
        int numBuscado = leer.nextInt();
        int contador = 0;
        for(int i=0;i<tamaño; i++){
            if(vector[i]==numBuscado){
                System.out.println("Numero encontrado: "+numBuscado+ ".En posicion: "+i );  
                contador++;
            }        }
        
        if (contador >1){
            System.out.println("EL NUMERO ESTA REPETIDO");
        }else if(contador==0){
            System.out.println("NO SE ENCONTRO NUMERO");
    }
    }
        
}
