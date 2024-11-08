package arreglos_ejercicio_12;

/*
Ejercicio 12: Leer por teclado una tabla de 10 elementos numéricos enteros
y una posición (entre 0 y 9). Eliminar el elemento situado en la posición
dada sin dejar huecos.
*/

import java.util.Scanner;

public class Arreglos_Ejercicio_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        int posicion;

        do {
            System.out.println("Llenar el arreglo");
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ". Digite un número: ");
                arreglo[i] = scanner.nextInt();
            }

            System.out.println("Digite una posición a eliminar (0-9): ");
            posicion = scanner.nextInt();
        } while (posicion < 0 || posicion > 9);

        for (int i = posicion; i < 9; i++) {
            arreglo[i] = arreglo[i + 1];
        }

        System.out.println("\nEl arreglo queda: ");
        for (int i = 0; i < 9; i++) {
            System.out.print(arreglo[i] + " - ");
        }
        System.out.println();
    }
}