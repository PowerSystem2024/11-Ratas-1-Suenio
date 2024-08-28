package org.example;

import javax.swing.*;
import java.util.Scanner;

/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir
el proceso hasta que se introduzca un número negativo
*/
public class Ejercicio01 {
    public static void main(String[] args) {
        int num = 0;

        System.out.println("Ingrese un número y se le mostrará su cuadrado, este proceso se repetira hasta que se introduzca un número negativo");
        System.out.println("");
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

            if (num >= 0) {
                System.out.println("El cuadrado de " + num + " es: " + num * num);
                System.out.println("");
            }
        } while (num >= 0);
        System.out.println("El programa finalizó por un número negativo");
    }
}