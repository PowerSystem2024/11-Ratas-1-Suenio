package Clase2;
import javax.swing.JOptionPane;
import java.util.Scanner;

/*
Ejersicio 1: leer un numero y mostrar su cuadrado, repetir
el proceso hasta que se introduzca un numero negativo
*/
public class clase0202 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cuadrado;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        while(numero >= 0){ // mientras el numero sea igual a 0 o positivo
            cuadrado = (int)Math.pow(numero, 2);
            System.out.println("El numero"+numero+" elevado al cuadrado es: "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        System.out.println("El programa a finalizado por numero negativo");
    }
}
