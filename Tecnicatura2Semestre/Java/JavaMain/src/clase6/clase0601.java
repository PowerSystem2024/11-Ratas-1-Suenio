/*
Ejercicio 10: pedir 10 numeros y escribir la suma total
hacerlo con clasescanner y JOptionPane
 */
package clase6;

import java.util.Scanner;

public class clase0601 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, suma = 0;
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
            suma += numero;
        }
        System.out.println("\nLa suma de todos los numeros es: "+suma);
    }
}
