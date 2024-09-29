package org.example.claseCiclos.ejercicios;

import java.util.Scanner;

/*
Ejercicio 1: Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo
 */

public class EjerciciosCiclos01a {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int num, cuadrado;

        System.out.println("Ingrese un número: ");
        num = Integer.parseInt(entrada.nextLine());

        while (num >= 0){
            cuadrado = (int)Math.pow(num,2);
            System.out.println("El cuadrado del número " + num + " es: " + cuadrado);
            System.out.println("Ingrese otro número para continuar, sino ingrese un número negativo para terminar");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El programa a finalizado");
    }
}
