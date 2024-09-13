package org.example.claseCiclos.ejercicios;

import java.util.Scanner;

/*
Ejercicio 4: Pedir números hasta que se teclee uno negativo, y mostrar cuántos números se han introducido.
 */
public class EjerciciosCiclos04a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        var num = Integer.parseInt(scanner.nextLine());
        int cant = 0;

        do {
            cant++;
            System.out.println("Ingrese otro número para continuar, si desea finalizar ingrese un número negativo.");
            num = Integer.parseInt(scanner.nextLine());
        }while(num > 0);
        System.out.println("La cantidad de números ingresados es de " + cant);
    }
}
