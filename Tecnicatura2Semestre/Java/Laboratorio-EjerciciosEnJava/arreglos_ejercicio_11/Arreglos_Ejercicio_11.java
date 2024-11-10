package arreglos_ejercicio_11;

/*
Ejercicio 11: Leer 5 elementos numéricos que se introducirán ordenados de forma
creciente. Éstos los guardaremos en una tabla de tamaño 10. Leer un número N,
e insertarlo en el lugar adecuado para que la tabla continúe ordenada.
*/

import java.util.Scanner;

public class Arreglos_Ejercicio_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[10];
        boolean creciente = true;
        int n = 6, sitio_num = 0, j = 0;

        System.out.println("Llenar el arreglo: ");
        do {
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + ". Digite un número: ");
                a[i] = scanner.nextInt();
            }
            for (int i = 0; i < 4; i++) {
                if (a[i] < a[i + 1]) {
                    creciente = true;
                }
                if (a[i] > a[i + 1]) {
                    creciente = false;
                    break;
                }
            }
            if (creciente == false) {
                System.out.println("\nEl arreglo no está ordenado en forma creciente, vuelva a digitar:\n");
            }
        } while (creciente == false);

        System.out.print("\nDigite un elemento a insertar: ");
        n = scanner.nextInt();

        while (a[j] < n && j < 5) {
            sitio_num++;
            j++;
        }

        for (int i = 4; i >= sitio_num; i--) {
            a[i + 1] = a[i];
        }

        a[sitio_num] = n;

        System.out.println("\nEl arreglo queda: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(a[i] + " - ");
        }
        System.out.println();
    }
}