package Clase2;
import java.util.Scanner;

/*
Ejersicio 2: leer un numero e indicar si es positivo o
negativo. ek proceso se repetira hasta que se introduzca
un 0
hacer este ejersicio con la clase scanner
luego hacerlo nuevamente con clase JOptionPane
 */
public class clase0203 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite un numero: ");
        var numero = Integer.parseInt(entrada.nextLine());

        while(numero != 0){
            if(numero > 0){
                System.out.println("El numero "+numero+" es POSITIVO");
            }
            else{
                System.out.println("El numero "+numero+" es NEGATIVO");
            }
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("El numero "+numero+" finaliza el programa");
    }
}
