package org.example;

import java.util.Scanner;

/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir
el proceso hasta que se introduzca un número negativo
*/
public class Ciclos01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        System.out.println("Ingrese un número y se le mostrará su cuadrado, este proceso se repetira hasta que se introduzca un número negativo");
        System.out.println("");
        do {
            System.out.println("Ingrese el número");
            num = scanner.nextInt();

            if (num >= 0) {
                System.out.println("El cuadrado de " + num + " es: " + num * num);
                System.out.println("");
            }
        } while (num >= 0);
    }
}