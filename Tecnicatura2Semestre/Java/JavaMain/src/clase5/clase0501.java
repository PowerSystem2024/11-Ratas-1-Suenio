/*
Ejersicio 8: pedir un numero N, y mostrar todos los numeros de 1 al N.
 */
package clase5;

import java.util.Scanner;

public class clase0501 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        int i = 1;
        while(i <= numero){
            System.out.println(i);
            i++;
        }
    }
}
