/*
Ejersicio2 : leer 5 numeros guardarlos en un arreglo y
mostrarlos en el orden inverso al introducirlos
 */
package clase11;
import java.util.Scanner;

public class arreglosEjersicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numero[] = new float[5];

        System.out.println("guardando los elementos del arreglo");
        for (int i = 0; i < 5; i++) {
            System.out.println((i+1)+". Digite un numero");
            numero[i] = entrada.nextFloat();
        }
        System.out.println("\nimprimimos los elementos del arreglo");
        for(int i = 4; i >= 0; i--) {
            System.out.println(i+". "+numero[i]);
        }
        System.out.println("\n");
    }
}
