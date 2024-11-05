package claseCiclos.ejercicios;

import javax.swing.*;

//Ejercicio 11: Diseñar un programa que muestre el producto
//de los 10 primeros números impares
//Hacerlo con JOptionPane
public class EjerciciosCiclos11 {
    public static void main(String[] args) {
        long producto = 1;
        for (int i = 1; i <= 20; i += 2) {
            producto *= i;
        }
        JOptionPane.showMessageDialog(null,"El producto de los 10 primeros números impares es: " + producto);
//        System.out.println("El producto de los 10 primeros números impares es: " + producto);
    }
}