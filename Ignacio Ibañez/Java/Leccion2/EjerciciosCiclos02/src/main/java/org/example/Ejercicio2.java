package org.example;

import javax.swing.*;
import java.util.Scanner;

//Ejercicio 2: Leer un número e indicar si es positivo o
//negativo. El proceso se repetira hasta que se introduzca
//un cero 0
//Clase Scanner
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Ingrese un número y se le dirá si es negativo o positivo, este proceso se repetira hasta que se introduzca 0");
        num = scanner.nextInt();

        while (num != 0) {
            if (num > 0) {
                System.out.println("El número " + num + " es positivo");
                System.out.println("");
            } else if (num < 0) {
                System.out.println("El número " + num + " es negativo");
                System.out.println("");
            }
            System.out.println("Ingrese otro número: ");
            num = scanner.nextInt();
        }
        System.out.println("El programa finalizó por el '0'");
    }
}