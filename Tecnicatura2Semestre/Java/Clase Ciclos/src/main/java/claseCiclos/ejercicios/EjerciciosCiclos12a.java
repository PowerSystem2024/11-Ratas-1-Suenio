package claseCiclos.ejercicios;

import java.util.Scanner;

/*
Ejercicio 12: Pedir un número y calcular su factorial
Scanner y JOptionPane
*/
public class EjerciciosCiclos12a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
        scanner.close();
    }   
}