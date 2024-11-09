/*
Ejercicio 13: leer 10 enteros en una tabla. guardar en otra
tabla los elementos pares de la primera y a continuacion
los elementos impares
 */
package clase12;
import java.util.Scanner;

public class arreglos_Ejercicio_8 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int arreglo[] = new int[10];
        int conteo_pares = 0, conteo_impares = 0;

        System.out.println("Llenar arreglo: ");
        // Llenado del arreglo y conteo de pares e impares
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            arreglo[i] = entrada.nextInt();

            if (arreglo[i] % 2 == 0) {
                conteo_pares++;
            } else {
                conteo_impares++;
            }
        }

        // Creación de los arreglos para pares e impares con los tamaños adecuados
        int par[] = new int[conteo_pares];
        int impar[] = new int[conteo_impares];
        // Llenado de los arreglos de pares e impares
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

        // Mostrar el arreglo completo ingresado
        System.out.println("\nArreglo ingresado: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arreglo[i] + " ");
        }
        // Mostrar el arreglo de números pares
        System.out.println("\n\nArreglo de pares: ");
        for (int i = 0; i < par.length; i++) {
            System.out.print(par[i] + " ");
        }
        // Mostrar el arreglo de números impares
        System.out.println("\n\nArreglo de impares: ");
        for (int i = 0; i < impar.length; i++) {
            System.out.print(impar[i] + " ");
        }

        System.out.println();
    }
}

