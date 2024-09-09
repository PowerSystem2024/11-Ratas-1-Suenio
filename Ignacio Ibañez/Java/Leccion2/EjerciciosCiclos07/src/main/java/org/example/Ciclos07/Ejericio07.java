package org.example.Ciclos07;

/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo
y calcular la media
Clase JOption
*/
public class Ejericio07 {
    public static void main(String[] args) {
        int numero, suma = 0, contador = 0;
        double media;
        numero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite un número: "));

        while (numero >= 0) {
            suma += numero;
            contador++;
            numero = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite otro número: "));
        }

        if (contador == 0) {
            System.out.println("Error: No se ingresaron números positivos.");
        } else {
            media = (double) suma / contador;
            System.out.println("La media de los números positivos es: " + media);
        }
    }
}