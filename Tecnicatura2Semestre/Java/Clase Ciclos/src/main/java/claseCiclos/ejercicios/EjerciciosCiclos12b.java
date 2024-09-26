package org.example.ciclos12;

import javax.swing.*;

/*
Ejercicio 12: Pedir un número y calcular su factorial
JOptionPane
*/
public class Ejercicio12 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es: " + factorial);
    }
}