package org.example.Ciclos06;

import java.util.Scanner;

//Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar
//la suma de todos los números introducidos.
public class Ciclos06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, suma = 0;
        do {
            System.out.print("Introduce un número (0 para salir): ");
            numero = scanner.nextInt();
            suma += numero;
        } while (numero != 0);
        System.out.println("La suma total es: " + suma);
    }
}