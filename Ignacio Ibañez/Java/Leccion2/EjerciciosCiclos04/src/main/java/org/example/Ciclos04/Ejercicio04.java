package org.example.Ciclos04;

import javax.swing.*;

/*
Ejercicio 4: Pedir números hasta que se teclee uno negativo,
y mostrar cuántos números se han introducido.
Luego lo hacemos con la clase JOptionPane
*/
public class Ejercicio04 {
    public static void main(String[] args) {
        int num = 0;
        int cont = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        while (num >= 0) {
            System.out.println("El número " + num + " es positivo");
            cont++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
        System.out.println("El programa finalizó por un número negativo, se ingresaron: '" + cont + "' números POSITIVOS");
    }
}