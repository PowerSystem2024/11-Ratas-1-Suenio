package org.example.claseCiclos.ejercicios;

import java.util.Scanner;
/*
Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos
 */
public class EjerciciosCiclos06a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        System.out.println("ingrese un número: ");
        var num = Integer.parseInt(scanner.nextLine());

        while (num != 0){
            suma += num;

            System.out.println("Ingrese otro número si desea continuar o ingrese un 0 (cero) para finalizar");
            num = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("La suma de todos los números ingresados es: " + suma);
    }
}
