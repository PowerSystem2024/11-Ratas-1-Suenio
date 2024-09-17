package org.example.claseCiclos.ejercicios;

import java.util.Scanner;

/*
Ejericicio 2: Leer un número e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un cero
 */

public class EjerciciosCiclos02a {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        var num = Integer.parseInt(entrada.nextLine());

        while(num != 0){
            if(num > 0){
                System.out.println("El número " + num + " es positivo");
            }else{
                System.out.println("El número " + num + " es negativo");
            }
            System.out.println("Ingrese otro número si desea continuar, sino ingrese un 0 (cero): ");
            num = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("Programa finalizado");
    }
}
