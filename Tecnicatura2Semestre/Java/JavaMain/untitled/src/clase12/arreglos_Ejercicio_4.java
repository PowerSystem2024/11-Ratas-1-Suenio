/*
Ejercicio 4: leer 10 numeros enteros, guardarlos en un arreglo,
debemos mostrarlos en el siguiente orden: el primero, el ultimo,
el segundo, el penultimo, el tercero, etc.
 */
package clase12;
import java.util.Scanner;

public class arreglos_Ejercicio_4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite un numero: ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("El resultado es: ");
        for(int i = 0; i < 10; i++){
            System.out.println(numeros[i]+" ");//Primero,segundo
            System.out.println(numeros[9-i]+" ");//ultimo,Penultimo
        }

        System.out.println();//salto de linea
    }
}
