/*
Ejercicio 5:leer por teclado dos tablas de 10 numeros enteros y mesclarlas
en una tercera de la forma: el 1° de A, el 1° de B, 2° de A, el 2° de B,etc
 */
package clase12;

import java.util.Scanner;

public class arreglos_Ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros1[] = new int[10];
        int numeros2[] = new int[10];
        int numeros3[] = new int[20];

        System.out.println("Llenamos el primer arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite un numero: ");
            numeros1[i] = entrada.nextInt();
        }

        System.out.println("Llenamos el segundo arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite un numero: ");
            numeros2[i] = entrada.nextInt();
        }

        int j=0;
        for (int i = 0; i < 10; i++) {
            numeros3[j] = numeros1[i];
            j++;
            numeros3[j] = numeros1[i];
            j++;

        }
        System.out.println("mostramos el tercer arreglo: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros3[i]+" ");
        }
        System.out.println();
    }
}
