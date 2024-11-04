package claseCiclos.ejercicios;

import java.util.Scanner;

/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo y calcular la media.
 */
public class EjerciciosCiclos07a {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double media = 0;
        int cont = 0;
        int suma = 0;

        System.out.println("Ingrese un número: ");
        var num = Integer.parseInt(scanner.nextLine());

        do{
            cont++;
            suma += num;
            System.out.println("Ingrese otro número o ingrese un número negativo para finalizar");
            num = Integer.parseInt(scanner.nextLine());
        }while(num > 0);

        media = suma/cont;
        System.out.println("La media de todos los numeros ingresados es de: " + media);

        scanner.close();
    }
}
