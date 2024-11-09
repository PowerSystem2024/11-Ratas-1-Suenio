/*
Ejercicio 4: crear una matriz de tamaño 7x7 y rellenar
de forma que los elementos de la diagonal
principal sea 1 y el resto 0
 */
package clase11;
import java.util.Scanner;

public class matriz_ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][] = new int[7][7];

        //llenando la matriz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if(i==j){
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
            }
        }

        System.out.println("\nMostrando matriz completa: ");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
