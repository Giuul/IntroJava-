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
public class EJERCIO_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €*/
    Scanner leer = new Scanner(System.in);
        System.out.println("INTRODUZCA LA CANTIDAD DE EUROS");
        int cant = leer.nextInt();
        System.out.println("AHORA LA MONEDA A LA QUE DESEA CONVERTIRLOS");
        String moneda = leer.next();
        transformar(cant, moneda);
    
    
    }
    
    public static void transformar(int cant, String moneda){
        long cambio = 0;
        if(moneda.equalsIgnoreCase("libra")){
            cambio = (long) (cant*0.86);
        }else{
            if(moneda.equalsIgnoreCase("dolares")){
                cambio = (long) (cant*1.28611);
            }else {
                if(moneda.equalsIgnoreCase("yenes")){
                    cambio = (long) (cant*129.852);
                }
            }
        }
        
        System.out.println("El valor de "+ cant + "€"+ " es "+ cambio + moneda);
    }
}
