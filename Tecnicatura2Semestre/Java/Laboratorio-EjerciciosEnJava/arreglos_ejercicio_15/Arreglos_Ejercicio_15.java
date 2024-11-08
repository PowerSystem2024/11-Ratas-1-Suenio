package arreglos_ejercicio_15;

import java.util.Scanner;

/*
Ejercicio 15: Leer 10 enteros ordenados crecientemente. Leer N y buscarlo en la
tabla. Se debe mostrar la posición en que se encuentra. Si no está, indicarlo
con un mensaje.
 */
public class Arreglos_Ejercicio_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];
        boolean creciente = true;
        int numero, sitio_num = 0, j = 0;

        System.out.println("Llenar el arreglo");
        do {
            for (int i = 0; i < 10; i++) {
                System.out.println((i + 1) + ". Digite un número: ");
                arreglo[i] = scanner.nextInt();
            }

            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {
                    creciente = false;
                    break;
                }
            }

            if (creciente == false) {
                System.out.println("\nEl arreglo está desordenado, vuelva a digitar: ");
            }
        } while (creciente == false);

        System.out.println("\nDigite un elemento a buscar: ");
        numero = scanner.nextInt();

        while (arreglo[j] < numero && j < 10) {
            sitio_num++;
            j++;
        }

        if (arreglo[j] == numero) {
            System.out.println("El número ha sido encontrado en la posición: " + sitio_num);
        } else {
            System.out.println("El número NO ha sido encontrado");
        }
    }
}