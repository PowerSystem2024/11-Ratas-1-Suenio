package arreglos_ejercicio_4;

/*
Ejercicio 4: Leer 10 números enteros, guardarlos en un
arreglo. Debemos mostrarlos en el siguiente orden: el primero.
el último, el segundo, el penúltimo, el tercero, etc.
*/

import java.util.Scanner;

public class Arreglos_Ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". Digite un número: ");
            numeros[i] = scanner.nextInt();
        }

        System.out.println("");
        for (int i = 0; i < numeros.length / 2; i++) {
            System.out.print(numeros[i] + " ");
            System.out.print(numeros[numeros.length - 1 - i] + " ");
        }
        System.out.println("");
    }
}