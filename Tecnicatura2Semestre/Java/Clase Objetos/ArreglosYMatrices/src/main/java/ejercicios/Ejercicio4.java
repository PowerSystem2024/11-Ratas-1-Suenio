package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {
    //Crear y cargar una matriz de 3x3, transponerla y mostrarla

    Scanner entrada = new Scanner(System.in);
    String nombres[][] = new String[3][3];

    for (int i = 0; i < nombres.length; i++) {
      for (int j = 0; j < nombres[i].length; j++) {
        System.out.print("Introduce un nombre: ");
        nombres[i][j] = entrada.nextLine();
      }
    }

    imprimirTranspuesta(nombres);

  }

  public static void imprimirTranspuesta(String matriz[][]){
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[j][i]);
        if (j != matriz[1].length - 1){
          System.out.print(",");
        }
      }
        System.out.println();
    }
  }
}
