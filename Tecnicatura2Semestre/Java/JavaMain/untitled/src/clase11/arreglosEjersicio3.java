/*
Ejersicio3: leer 5 numeros por el teclado, almacenarlos en un arreglo
y a continuacion realizar la media de los numeros positivos, la media
de los negativos y contar el numero de ceros
 */
package clase11;
import java.util.Scanner;

public class arreglosEjersicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero[] = new float[5];
        float negativos=0, positivos=0, mediNegativos, mediaPositivos;
        int conteo0=0,conteo_negativos=0, conteo_positivos=0;

        System.out.println("Guardando los elementos del arreglo: ");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+". Digite un numero: ");
            numero[i] = entrada.nextFloat();
            if(numero[i]>0){
                positivos += numero[i];
                conteo_positivos++;
            } else if (numero[i]<0) {
                negativos += numero[i];
                conteo_negativos++;
            }else{
                conteo0++;
            }
        }
        if(conteo_positivos == 0){
            System.out.println("\nNo se puede sacar la media de los numeros");
        }else{
            mediaPositivos = negativos/conteo_negativos;
            System.out.println("\nNo se puede sacar la media de los numeros negativos");
        }
        System.out.println("La cantidad de ceros es: "+conteo0);
        //ingresar:2,-5,6,-2,0
    }
}
