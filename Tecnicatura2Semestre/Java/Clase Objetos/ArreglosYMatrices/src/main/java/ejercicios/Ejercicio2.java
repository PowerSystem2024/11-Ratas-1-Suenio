package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
  public static void main(String[] args) {
    //Leer 5 n�meros, guardarlos en un arreglo y mostrarlos en orden inverso

    Scanner entrada = new Scanner(System.in);
    int numeros[] = new int[5];

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Ingresa el n�mero " + (i+1) + ": ");
      numeros[i] = entrada.nextInt();
    }

    System.out.print("N�meros en orden inverso: ");
    for (int i = numeros.length -1; i >= 0; i--) {
      if (i != 0){
        System.out.print(numeros[i] + ", ");
      } else{
        System.out.print(numeros[i]);
      }
    }
    entrada.close();
  }
}
