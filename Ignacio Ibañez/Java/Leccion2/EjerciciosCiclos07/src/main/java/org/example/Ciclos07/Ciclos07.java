package org.example.Ciclos07;

import java.util.Scanner;

/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo
y calcular la media
Clase Scanner
*/
public class Ciclos07 {
    public static void main(String[] args) {
        int numero, suma = 0, contador = 0;
        double media;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese un número (negativo para salir): ");
        numero = entrada.nextInt();

        while (numero >= 0) {
            suma += numero;
            contador++;
            System.out.print("Ingrese otro número (negativo para salir): ");
            numero = entrada.nextInt();
        }

        if (contador == 0) {
            System.out.println("No se ingresaron números.");
        } else {
            media = (double) suma / contador;
            System.out.println("La media de los números ingresados es: " + media);
        }
    }
}