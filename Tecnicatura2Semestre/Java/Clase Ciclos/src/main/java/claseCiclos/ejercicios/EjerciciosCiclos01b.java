package org.example.claseCiclos.ejercicios;

import javax.swing.JOptionPane;

public class EjerciciosCiclos01b {
    public static void main(String[] args){
        int num, cuadrado;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        while (num >= 0){
            cuadrado = (int)Math.pow(num,2);
            JOptionPane.showMessageDialog(null, "El cuadrado del número " + num + " es: " + cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número para continuar, sino ingrese un número negativo para terminar"));
        }
        JOptionPane.showMessageDialog(null, "El programa a finalizado");
    }
}
