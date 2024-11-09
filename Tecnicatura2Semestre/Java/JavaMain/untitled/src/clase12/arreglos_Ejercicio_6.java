/*
Rjercicio 11: Leer 5 elementos numericos que se introduciran de forma creciente.
Esros los guardaremos en una tabla de tamañp 10. leer un numero N, e insertarlo
en el lugar adecuado para que la tabla continue ordenada
 */
package clase12;

import java.util.Scanner;

public class arreglos_Ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int numero,sitio_num=0,j=0;

        System.out.println("llenar el arreglo: ");
        do{
            //llenando el arreglo
            for(int i=0;i<5;i++){
                System.out.println((i+1)+". Digite un numero: ");
                arreglo[i]=entrada.nextInt();
            }

            //comprobar si el arreglo esta ordenado en orden creciente
            for(int i=0;i<4;i++){
                if(arreglo[i] < arreglo[i+1]){ //creciente 1,2,3
                    creciente = true;
                }
                if(arreglo[i] > arreglo[i+1]){
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo no esta ordenado en forma creciente, vuelva a digitar\n");
            }
        }while(creciente == false);
        System.out.println("Digite un numero a insertar: ");
        numero=entrada.nextInt();

        // esto es para darnos cuenta en que posicion va el numero
        while(arreglo[j]<numero && j<5){
            sitio_num++;
            j++;
        }
        //transladar una posicion en el arreglo a los elementos que van detras del numero
        for(int i=4;i>=sitio_num;i--){
            arreglo[i+1] = arreglo[i];
        }
        //insertar el numero
        arreglo[sitio_num] = numero;

        System.out.println("\nEl arreglo queda: ");
        for(int i=0;i<6;i++){
            System.out.println(arreglo[i]+" - ");
        }
        System.out.println();
    }
}
