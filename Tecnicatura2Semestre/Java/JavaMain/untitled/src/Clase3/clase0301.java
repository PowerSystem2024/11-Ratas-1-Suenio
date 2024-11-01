package Clase3;
import java.util.Scanner;
/*
Ejercicio 3: leer numeros hasta que se introduzca un cero
para cada uno indicar si es par o impar
primero lo hacemos con la clase scammer
luego con clase
 */
public class clase0301 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero != 0){
            if(numero % 2 == 0){
                System.out.println("El numero ingresado "+numero+" es PAR");
            }else{
                System.out.println("El numero ingresado "+numero+" es IMPAR");
            }
            System.out.println("Digite un numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero ingresado es "+numero+" finaliza el programa");
    }
}
