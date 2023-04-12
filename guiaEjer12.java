/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_subprogramas;

import java.util.Scanner;

/**
* Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
* validando que el primer número múltiplo del segundo e imprima 
* si el primer número es múltiplo del segundo, 
* sino informe que no lo son.
 */
public class guiaEjer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        EsMultiplo (num, num2);
        
    }
    public static void EsMultiplo(int num, int num2) {
        if (num % num2 == 0){
            System.out.println(num + " es múltiplo de " + num2);
        }else {
            System.out.println(num + " NO es múltiplo de " + num2);
        }
            
    }
}
