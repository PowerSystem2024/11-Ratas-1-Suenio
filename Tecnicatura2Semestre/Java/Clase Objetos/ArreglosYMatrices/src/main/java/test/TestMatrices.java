package test;

import domain.Persona;

public class TestMatrices {
  public static void main(String[] args) {
    //Creando una matriz
    int edades[][] = new int[3][2];

    edades[0][0] = 1;
    edades[0][1] = 2;
    edades[1][0] = 3;
    edades[1][1] = 4;
    edades[2][0] = 5;
    edades[2][1] = 6;

    //Iterando matriz
    for (int i = 0; i < edades.length; i++) {
      for (int j = 0; j < edades[i].length; j++) {
        System.out.print(edades[i][j]);
        if (j != edades[1].length - 1){
          System.out.print(",");
        }
      }
      System.out.println();
    }

    //Sintaxis simplificada
    String frutas[][] = {{"Pera", "Manzana"},{"Sandía", "Naranja"},{"Banana", "Ananá"}};

    for (int i = 0; i < frutas.length; i++) {
      for (int j = 0; j < frutas[i].length; j++) {
        System.out.print(frutas[i][j]);
        if (j != frutas[1].length - 1){
          System.out.print(",");
        }
      }
      System.out.println();
    }

    Persona personas[][] = new Persona[2][3];
    personas[0][0] = new Persona("Pepito");
    personas[0][1] = new Persona("Pepón");
    personas[0][2] = new Persona("Pepazo");
    personas[1][0] = new Persona("Pepitenio");
    personas[1][1] = new Persona("Pepita");
    personas[1][2] = new Persona("Pepe");

    imprimir(personas);
  }

  public static void imprimir(Object matriz[][]){
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[i].length; j++) {
        System.out.print(matriz[i][j]);
        if (j != matriz[1].length - 1){
          System.out.print(",");
        }
      System.out.println();
      }
    }
  }
}
