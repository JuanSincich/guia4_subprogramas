/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4_subprogramas;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para
 * imprimirlos en el main.
 */
public class ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num, num2, opc;
        double res;
        System.out.println("Ingrese 2 números enteros");
        num = leer.nextInt();
        num2 = leer.nextInt();

        do {
            System.out.println("Ingrese la operacion que desea realizar:");
            System.out.println("1: Sumar");
            System.out.println("2: Restar");
            System.out.println("3: Multiplicar");
            System.out.println("4: Dividir");
            System.out.println("5: Salir");

            opc = leer.nextInt();
            boolean log = opc >= 1 && opc <= 5;

            if (!log) {
                System.out.println("Opción incorrecta");
            } else {
                switch (opc) {
                    case 1:
                        res = sumar(num, num2);
                        System.out.println("El resultado de la suma es " + res);
                        break;
                    case 2:
                        res = restar(num, num2);
                        System.out.println("El resultado de la resta es " + res);
                        break;
                    case 3:
                        res = multiplicar(num, num2);
                        System.out.println("El resultado de la multipliccación es " + res);
                        break;
                    case 4:
                        res = dividir(num, num2);
                        System.out.println("El resultado de la división es " + res);
                        break;
                }
            }
        } while (opc != 5);
        System.out.println("Andate a la c****a de la lora");

    }

    public static int sumar(int num, int num2) {
        return num + num2;
    }

    public static int restar(int num, int num2) {
        return num - num2;
    }

    public static int multiplicar(int num, int num2) {
        return num + num2;
    }

    public static int dividir(int num, int num2) {
        return num / num2;
    }
}
