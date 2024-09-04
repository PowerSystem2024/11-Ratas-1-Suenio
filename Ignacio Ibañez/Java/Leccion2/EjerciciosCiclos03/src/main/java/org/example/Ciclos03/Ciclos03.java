package org.example.Ciclos03;

import java.util.Scanner;

/*
Ejercicio 3: Leer números hasta que se introduzca un cero
Para cada uno indicar si es par o impar.
Primero lo haremos con la clase Scanner
*/
public class Ciclos03 {
    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite un número: ");
        numero = entrada.nextInt();

        while(numero != 0){
            if(numero % 2 == 0){
                System.out.println("El número " + numero + " es PAR");
            }else{
                System.out.println("El número " + numero + " es IMPAR");
            }

            System.out.print("Digite otro número: ");
            numero = entrada.nextInt();
        }

        System.out.println("El número " + numero + " finaliza el programa");
    }
}