package Clase4;
import java.util.Scanner;

/*
Ejersicio 7: Pedir numeros hasta que se introduzca
uno negativo y calcular el promedio
 */
public class clase0406 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){ // mientras el numero no sea negativo
            suma += numero;
            conteo++;
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        if(conteo == 0){
            System.out.println("\nError, la divicion entre cero no existe");
        }else{
            promedio = (float)suma/conteo;
            System.out.println("\nEl promedio es: "+promedio);
        }
    }
}
