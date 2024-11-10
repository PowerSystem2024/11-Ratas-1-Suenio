package claseCiclos.ejercicios;

import java.util.Scanner;

/*
Ejercicio 3: Leer números hasta que se introduzca un cero.
Para cada uno indicar si es par o impar.
 */
public class EjerciciosCiclos03a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        var num = Integer.parseInt(scanner.nextLine());

        do {
            if (num % 2 == 0) {
                System.out.println("El número " + num + " es par");
            }else{
                System.out.println("El número " + num + " es impar");
            }
            System.out.println("Ingrese otro número para continuar, si desea finalizar ingrese 0 (cero)");
            num = Integer.parseInt(scanner.nextLine());
        }while(num != 0);
        System.out.println("Programa finalizado");
        scanner.close();
    }
}
