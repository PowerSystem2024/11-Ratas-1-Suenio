package ejercicios;

public class Ejercicio5 {
  public static void main(String[] args) {
    //Crear una matriz de tamaño 7x7 y rellenarla de forma que los elementos de la diagonal principal sean 1 y el resto 0
    int numeros[][] = new int[7][7];

    for (int i = 0; i < numeros.length; i++) {
      for (int j = 0; j < numeros[i].length; j++) {
       if (i == j){
         numeros[i][j] = 1;
        } else {
         numeros[i][j] = 0;
       }
      }
    }

    imprimir(numeros);

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
}

