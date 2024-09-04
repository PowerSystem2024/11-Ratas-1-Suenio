package org.example.Ciclos05;

import java.util.Scanner;

/*
Ejercicio 5: Realizar un juego para adivinar un número,
para ello generar un número aleatorio entre 0-100, y
luego ir pidiendo números indicando "es mayor" o
"es menor" según sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos
el número de intentos hechos.
Clase Scanner
 */
public class Ciclos05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAleatorio = (int) (Math.random() * 101);
        int numeroUsuario;
        int intentos = 0;

        do {
            System.out.print("Introduce un número: ");
            numeroUsuario = scanner.nextInt();

            if (numeroUsuario < numeroAleatorio) {
                System.out.println("Es mayor");
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("Es menor");
            }
            intentos++;
        } while (numeroUsuario != numeroAleatorio);

        System.out.println("¡Adivinaste! El número era " + numeroAleatorio);
        System.out.println("Número de intentos: " + intentos);
    }
}