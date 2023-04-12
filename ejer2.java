/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_subprogramas;

import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima los
 * datos de las personas ingresadas por teclado e indique si son mayores o
 * menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario
 * ingrese la palabra “No”.
 */
public class ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        boolean log = true;

        while (log) {
            System.out.println("Ingrese nombre");
            nombre = leer.next();
            System.out.println("Ingrese edad");
            edad = leer.nextInt();
            
            mayor (nombre, edad);
            
            System.out.println("¡Quiére seguir ingresando datos?");
            String res= leer.next();
            log=res.equalsIgnoreCase("si");                            
        }
        System.out.println("Muchas gracias!");
    }

    public static void mayor(String nombre, int edad) {
        if (edad >= 18) {
            System.out.println(nombre + " es mayor de edad.");
        } else {
            System.out.println(nombre + " es menor de edad");
        }
    }
}
