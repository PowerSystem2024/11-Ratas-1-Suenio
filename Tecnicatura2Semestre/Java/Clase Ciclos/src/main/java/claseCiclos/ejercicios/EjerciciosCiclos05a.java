package org.example.claseCiclos.ejercicios;

import java.util.Scanner;

/*
Ejercicio 5: Realizar un juego para adivinar un número, para ello generar un número aleatorio entre 0-100,
y luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostramos el número de intentos hechos
 */
public class EjerciciosCiclos05a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 100); // Genera un número aleatorio entre 0 y 100
        int intentos = 1;

        System.out.println("Ingrese un número: ");
        var num = Integer.parseInt(scanner.nextLine());
        do {

            if (num == aleatorio){
                break; // Si le acierta a la primera, salgo del bucle
            }else if (num > aleatorio){
                System.out.println("Es mayor");
            }else{
                System.out.println("Es menor");
            }

            System.out.println("Ingrese otro número");
            num = Integer.parseInt(scanner.nextLine());
            intentos++;
        }while(num != aleatorio);

        System.out.println("Adivino el número en " + intentos + " intentos");
    }
}
