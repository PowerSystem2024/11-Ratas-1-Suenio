package org.example.claseCiclos.ejercicios;

import javax.swing.*;

/*
Ejercicio 4: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */
public class EjerciciosCiclos04b {
    public static void main(String[] args){

        var num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        int cant = 0;

        do {
            cant++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número para continuar, si desea finalizar ingrese un número negativo."));
        }while(num > 0);
        JOptionPane.showMessageDialog(null, "La cantidad de números ingresados es de " + cant);
    }
}
