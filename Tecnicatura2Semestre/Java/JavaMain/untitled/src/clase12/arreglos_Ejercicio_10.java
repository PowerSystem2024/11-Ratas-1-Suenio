/*
Ejercicio 15: leer 10 eneros ordenados crecientemente.
leer Ny buscarlo en la tabla se debe mostrar la posicion
en que se encuentra si no esta indicarlo con un mensaje
 */

package clase12;

import java.util.Scanner;

public class arreglos_Ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero, numero2 = 0;

        System.out.println("llenar el arreglo: ");
        do{
            for(int i = 0; i < 10; i++){
                System.out.println(i+". Digite un numero: ");
                arreglo[i] = entrada.nextInt();
            }

            for(int i = 0; i < 9; i++){
                if(arreglo[i] == arreglo[i+1]){
                    creciente = true;
                }
                if(arreglo[i] == arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado, vuelve a digitar: ");
            }

        }while(creciente == false);

        System.out.println("\nDigite un numero para buscar en el arreglo: ");
        numero = entrada.nextInt();

        int i=0;
        while(i<10 && arreglo[i]<numero){
            i++;
        }

        if(i == 10) {
            System.out.println("\nNumero no encontrado");
        }else{
            if(arreglo[i] == numero){
                System.out.println("\nNumero encontrado en la posicion: "+i);
            }else{
                System.out.println("Numero no encontrado");
            }
        }
        System.out.println();
    }
}
