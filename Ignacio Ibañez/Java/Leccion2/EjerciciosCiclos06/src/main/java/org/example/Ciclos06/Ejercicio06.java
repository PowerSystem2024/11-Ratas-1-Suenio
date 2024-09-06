package org.example.Ciclos06;

//Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar
//la suma de todos los números introducidos.
//Clase JOptionPane
public class Ejercicio06 {
    public static void main(String[] args) {
        int numero, suma = 0;
        do {
            numero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Introduce un número (0 para salir): "));
            suma += numero;
        } while (numero != 0);
        javax.swing.JOptionPane.showMessageDialog(null, "La suma total es: " + suma);
    }
}