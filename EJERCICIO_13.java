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
public class EJERCICIO_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *      */
       Scanner leer = new Scanner(System.in);
        System.out.println("INTRODUZA CANTIDAD DE ELEMENTOS DEL CUADRADO: ");
        int elementos = leer.nextInt();
        String cuadrado[][] = new String[elementos][elementos];
        for (int i = 0; i<elementos; i++){
            for(int j = 0; j<elementos; j++){
                if ((i==0) || (i==(elementos-1))|| (j==0) || (j == (elementos-1))){
                    cuadrado[i][j]= "*";
                }else{
                    cuadrado[i][j]= " ";
                }
            }
                
            
        }
        
        for (int i = 0; i<elementos; i++){
            for(int j = 0; j<elementos; j++){
                System.out.print(cuadrado[i][j]);
            }
            System.out.println("");
        }
        

    }
    
}
