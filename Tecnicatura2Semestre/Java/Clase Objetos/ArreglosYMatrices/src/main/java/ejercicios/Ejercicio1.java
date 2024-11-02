package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    //Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido

    Scanner entrada = new Scanner(System.in);
    int numeros[] = new int[5];

    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Ingresa el número " + (i+1) + ": ");
      numeros[i] = entrada.nextInt();
    }

    System.out.print("Números: ");
    for (int i = 0; i < numeros.length; i++) {
      if (i != 4){
        System.out.print(numeros[i] + ", ");
      } else{
        System.out.print(numeros[i]);
      }
    }
    entrada.close();
  }
}
