package arreglos_ejercicio_13;

import java.util.Scanner;

/*
Ejercicio 13: Leer 10 enteros en una tabla. Guardar en otra tabla los
elementos pares de la primera, y a continuación los elementos impares.
*/
public class Arreglos_Ejercicio_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        int conteo_pares = 0, conteo_impares = 0;

        System.out.println("Llenar el arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Digite un número: ");
            arreglo[i] = scanner.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2 == 0) {
                conteo_pares++;
            } else {
                conteo_impares++;
            }
        }

        int par[] = new int[conteo_pares];
        int impar[] = new int[conteo_impares];

        conteo_pares = 0;
        conteo_impares = 0;

        for (int i = 0; i < 10; i++) {
            if (arreglo[i] % 2 == 0) {
                par[conteo_pares] = arreglo[i];
                conteo_pares++;
            } else {
                impar[conteo_impares] = arreglo[i];
                conteo_impares++;
            }
        }

        System.out.println("\nArreglo pares: ");
        for (int i = 0; i < conteo_pares; i++) {
            System.out.println(par[i] + " - ");
        }

        System.out.println("\nArreglo impares: ");
        for (int i = 0; i < conteo_impares; i++) {
            System.out.println(impar[i] + " - ");
        }
    }
}