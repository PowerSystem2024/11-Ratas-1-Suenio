package org.example.claseCiclos.ejercicios;


import javax.swing.*;
/*
Ejercicio 3: Leer números hasta que se introduzca un cero.
Para cada uno indicar si es par o impar.
 */
public class EjerciciosCiclos03b {
    public static void main(String[] args){

        var num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        do {
            if (num % 2 == 0) {
                JOptionPane.showMessageDialog(null, "El número " + num + " es par");
            }else{
                JOptionPane.showMessageDialog(null, "El número " + num + " es impar");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número para continuar, si desea finalizar ingrese 0 (cero)"));
        }while(num != 0);
        JOptionPane.showMessageDialog(null, "Programa finalizado");
    }
}
