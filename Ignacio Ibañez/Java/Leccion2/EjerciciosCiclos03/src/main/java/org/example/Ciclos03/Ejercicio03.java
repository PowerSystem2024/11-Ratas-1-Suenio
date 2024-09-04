package org.example.Ciclos03;

import javax.swing.*;

/*
Ejercicio 3: Leer números hasta que se introduzca un cero
Para cada uno indicar si es par o impar.
Luego con la clase JOptionPane
*/
public class Ejercicio03 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        while (num != 0) {
            if (num > 0) {
                System.out.println("El número " + num + " es PAR");
                System.out.println("");
            } else if (num < 0) {
                System.out.println("El número " + num + " es IMPAR");
                System.out.println("");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        System.out.println("El programa finalizó por el '0'");
    }
}