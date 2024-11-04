package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    //Crear y cargar una matriz de tamaño n x m, mostrar la suma de cada fila y cada columna

    Scanner entrada = new Scanner(System.in);

    System.out.print("Ingresa el número de filas: ");
    int filas = entrada.nextInt();
    System.out.print("Ingresa el número de columnas: ");
    int columnas = entrada.nextInt();

    int matriz[][] = new int[filas][columnas];

    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print("Introduce un número entero: ");
        matriz[i][j] = entrada.nextInt();
      }
    }
    System.out.println("\nMatriz");
    imprimir(matriz);
    System.out.println("\nSuma de cada fila y columna");
    sumarFilasYColumnas(matriz);

  }
  public static void imprimir(int matriz[][]){
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j]);
        if (j != matriz[1].length - 1){
          System.out.print(",");
        }
      }
      System.out.println();
    }
  }
  public static void sumarFilasYColumnas(int matriz[][]){
    int sumaFila = 0;
    int sumaColumna = 0;
    int i,j;
    for (i = 0; i < matriz.length; i++) {
      for (j = 0; j < matriz[i].length; j++) {
        sumaFila += matriz[i][j];
        sumaColumna += matriz[j][i];
      }
      System.out.println("Fila "+(i+1)+ ": " + sumaFila);
      System.out.println("Columna "+(i+1)+ ": " + sumaColumna);
      sumaFila = 0;
      sumaColumna = 0;
    }
  }
}
