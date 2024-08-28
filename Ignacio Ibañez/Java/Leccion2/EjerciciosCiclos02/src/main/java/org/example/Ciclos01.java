package org.example;

import javax.swing.*;
import java.util.Scanner;

//Ejercicio 2: Leer un número e indicar si es positivo o
//negativo. El proceso se repetira hasta que se introduzca
//un cero 0
//Clase JOptionPane
public class Ciclos01 {
    public static void main(String[] args) {
        int num = 0;

        System.out.println("Ingrese un número y se le dirá si es negativo o positivo, este proceso se repetira hasta que se introduzca 0");
        System.out.println("");

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        while (num != 0) {
            if (num > 0) {
                System.out.println("El número " + num + " es positivo");
                System.out.println("");
            } else if (num < 0) {
                System.out.println("El número " + num + " es negativo");
                System.out.println("");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        System.out.println("El programa finalizó por el '0'");
    }
}