package org.example.Ciclos04;

import java.util.Scanner;

/*
Ejercicio 4: Pedir números hasta que se teclee uno negativo,
y mostrar cuántos números se han introducido.
Lo hacemos primero con la clase Scanner
*/
public class Ciclos04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int cont = 0;

        System.out.println("Ingrese un número");
        num = scanner.nextInt();

        while (num >= 0) {
            System.out.println("El número: " + num + " , es POSITIVO");
            cont++;
            System.out.println("Ingrese otro número:");
            num = scanner.nextInt();
        }
        System.out.println("El programa finalizó por un número negativo, se ingresaron: '" + cont + "' números POSITIVOS");
    }
}