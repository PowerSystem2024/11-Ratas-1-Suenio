package arreglos_ejercicio_14;

import java.util.Scanner;

/*
Ejercicio 14: Leer dos series de 10 enteros, que estarán ordenados crecientemente.
Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
*/
public class Arreglos_Ejercicio_14 {
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

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < 10 && j < 10) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        if (i == 10) {
            while (j < 10) {
                c[k] = b[j];
                j++;
                k++;
            }
        } else {
            while (i < 10) {
                c[k] = a[i];
                i++;
                k++;
            }
        }

        System.out.println("\nEl tercer arreglo es: ");
        for (k = 0; k < 20; k++) {
            System.out.println(c[k]);
        }
    }
}