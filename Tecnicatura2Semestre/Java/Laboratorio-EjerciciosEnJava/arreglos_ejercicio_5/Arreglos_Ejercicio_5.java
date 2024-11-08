package arreglos_ejercicio_5;

/*
Ejercicio 5: Leer por teclado dos tablas de 10 números
enteros y mezclarlas en una tercera de la forma: el 1ª de
A, el 1ª de B, el 2ª de A, el 2ª de B, etc.
*/

import java.util.Scanner;

public class Arreglos_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[10];
        int[] b = new int[10];
        int[] c = new int[20];

        System.out.println("Llenar el primer arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Digite un número: ");
            a[i] = scanner.nextInt();
        }

        System.out.println("Llenar el segundo arreglo");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Digite un número: ");
            b[i] = scanner.nextInt();
        }

        int j = 0;
        for (int i = 0; i < 10; i++) {
            c[j] = a[i];
            j++;
            c[j] = b[i];
            j++;
        }

        System.out.println("\nEl tercer arreglo es: ");
        for (int i = 0; i < 20; i++) {
            System.out.println(c[i]);
        }
    }
}