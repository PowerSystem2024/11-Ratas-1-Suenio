package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    //Leer 5 números, guardarlos en un arreglo, realizar la media positivos/negativos, y contar el número de ceros

    Scanner entrada = new Scanner(System.in);
    int numeros[] = new int[5];
    int numCeros=0, cantPositivos=0, cantNegativos=0;
    double mediaPositivos =0, mediaNegativos=0;

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Ingresa el número " + (i+1) + ": ");
      numeros[i] = entrada.nextInt();
      if (numeros[i] > 0){
        cantPositivos += 1;
        mediaPositivos += numeros[i];
      } else if (numeros[i] < 0) {
        cantNegativos += 1;
        mediaNegativos += numeros[i];
      } else {
        numCeros += 1;
      }
    }

    System.out.print("Números: ");
    for (int i = 0; i < numeros.length; i++) {
      if (i != 4){
        System.out.print(numeros[i] + ", ");
      } else{
        System.out.print(numeros[i]);
      }
    }
    System.out.println("\nMedia de números positivos: " + (mediaPositivos / cantPositivos));
    System.out.println("Media de números negativos: " + (mediaNegativos / cantNegativos));
    System.out.println("Cantidad de ceros: " + numCeros);
    entrada.close();
  }
}
