/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_subprogramas;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de
 * euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 * yenes o libras. La función tendrá como parámetros, la cantidad de euros y la
 * moneda a convertir que será una cadena, este no devolverá ningún valor y
 * mostrará un mensaje indicando el cambio (void). El cambio de divisas es: 0.86
 * libras es un 1 € 1.28611 $ es un 1 € 129.852 yenes es un 1 €
 *
 */
public class ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double cantidad;
        int tipocambio;

        System.out.println("Ingrese cantidad de euros a convertir");
        cantidad = leer.nextDouble();
        System.out.println("");
        System.out.println("especifique a que mopneda desea convertir");
        System.out.println("1- Dolar estadounidense");
        System.out.println("2- Yen");
        System.out.println("3_ Libra");
        tipocambio = leer.nextInt();

        conversor(cantidad, tipocambio);

    }

    public static void conversor(double cantidad, int tipocambio) {
        double resultado;
        switch (tipocambio) {
            case 1:
                resultado = cantidad * 1.28611;
                System.out.println(cantidad + " euros son " + resultado + " dólares estadounidenses.");
                break;
            case 2:
                resultado = cantidad * 129.852;
                System.out.println(cantidad + " euros son " + resultado + " yenes.");
                break;
            case 3:
                resultado = cantidad * 0.86;
                System.out.println(cantidad + " euros son " + resultado + " libras.");
                break;
        }
    }
}
