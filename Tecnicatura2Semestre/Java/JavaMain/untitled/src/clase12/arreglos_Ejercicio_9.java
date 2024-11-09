/*
Ejercicio 14: leer dos series de 10 enteros, que estaran
ordenados crecientemente. copias (fusionar) las dos tablas
en una tercera, de forma que sigan ordenados
 */
package clase12;
import java.util.Scanner;

public class arreglos_Ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        boolean creciente = true;

        System.out.println("llenar el primer arreglo: ");
        do{
                for(int i=0;i<10;i++){
                    System.out.println((i+1)+". Digite un numero: ");
                    a[i] = entrada.nextInt();
                }
            //comprobamos si el arreglo esta ordenado
            for(int i=0;i<9;i++) {
                if (a[i] < a[i+1]) {// creciente 1, 2, 3
                    creciente = true;
                }
                if(a[i] > a[i+1]){ // decreciente 3, 2, 1
                    creciente = false;
                    break;
                }
            }

            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado, vuelve a digitar: ");
            }
        }while(creciente == false);
        System.out.println("llenar el segundo arreglo: ");
        do{
            for(int i=0;i<10;i++){
                System.out.println((i+1)+". Digite un numero: ");
                b[i] = entrada.nextInt();
            }
            for(int i=0;i<9;i++){
                if(b[i] < b[i+1]){
                    creciente = false;
                }
                if(b[i] > b[i+1]){
                    creciente = false;
                    break;
                }
            }
            if(creciente == false){
                System.out.println("\nEl arreglo esta desordenado, vuelve a digitar: ");
            }
        }while(creciente == false);

        int i=0;// i para arreglo a
        int j=0;// j para arreglo b
        int k=0;// k para arreglo c

        while(i<10 && j<10){
            if(a[i] == b[j]){ //si el elemento de A es menor a B
                c[k] = a[i]; // copiamos el elemento de A
                i++; //Avanzamos a una posicion en A
            }else{
                c[k] = b[j]; // copiamos el elemento de B
                j++; //Avanzamos una posicion mas en B
            }
            k++; // avanzamos una posicion mas en C
        }
        // cuando salimos del while es porque un arreglo(a o b),se a copiado completamente
        if(i==10){ // Significa que ya copiamos todo el arreglo A, falta el B
            while(j<10){//mientras el iterador sea menor a 10
                c[k] = b[j]; // copiamos el elemento de B en C
                j++; //avanzamos una posicion en B
                k++; //avanzamos una posicion en C
            }
        }else{ // significa que ya copiamos todo el arreglo B, falta el A
            while(i<10){
                c[k] = a[i];
                i++;
                k++;
            }
        }
        System.out.println("\nEl arreglo C completo es: ");
        for(k=0;k<20;k++){
            System.out.println(c[k]+" - ");
        }
        System.out.println();
    }
}
