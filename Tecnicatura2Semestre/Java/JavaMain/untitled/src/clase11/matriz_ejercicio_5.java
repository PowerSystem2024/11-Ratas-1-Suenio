/*
Ejercicio 5: crear y cargar una matriz
de tamaño n x m, mostrar la suma de cada
fila y de cada columna
 */
package clase11;

import javax.swing.*;
import java.util.Scanner;

public class matriz_ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz[][], nFilas, nCol, sumaFilas, sumCol;
        int posFila, posCol;

        nFilas = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Digite el numero de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero de columnas: "));

        matriz = new int[nFilas][nCol];
        int filas[] = new int[nFilas];
        int columnas[] = new int [nCol];

        System.out.println("rellenando la matriz: ");
        for(int i = 0; i < nFilas; i++) {
            for(int j = 0; j < nCol; j++) {
                System.out.println("Matriz["+i+"]["+j+"]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("\nMatriz original: ");
        for(int i = 0; i < nFilas; i++) {
            for(int j = 0; j < nCol; j++) {
                System.out.println(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        //Sumando las filas
        posFila=0;
        for(int i = 0; i < nFilas; i++) {
            sumaFilas = 0;
            for(int j = 0; j < nCol; j++) {
                sumaFilas += matriz[i][j];
            }
            filas[posFila] = sumaFilas;
            posFila++;
        }
        //sumando las columnas
        posCol = 0;
        for(int i = 0; i < nCol; i++) {
            sumCol = 0;
            for(int j = 0; j < nFilas; j++) {
                sumCol += matriz[i][j];
            }
            columnas[posCol] = sumCol;
            posCol++;
        }

        System.out.println("nLa suma de las filas es: ");
        for(int i = 0; i < nFilas; i++) {
            System.out.println(" - ");
        }
        System.out.println("");

        System.out.println("nLa suma de las columnas es: ");
        for(int i = 0; i < nCol; i++) {
            System.out.println(columnas[i]+" - ");
        }
        System.out.println("");
    }
}
