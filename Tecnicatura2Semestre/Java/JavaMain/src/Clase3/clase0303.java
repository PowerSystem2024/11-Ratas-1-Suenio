package Clase3;
import java.util.Scanner;

/*
Ejersicio 4: pedir numeros hasta que se teclee un negativo
y mostrar cuantos numeros se jan introducido
lo hacemos primero con la clase scanner
luego lo hacemos con la clase JOptionpane
 */
public class clase0303 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, conteo = 0;
        System.out.println("Digite in numero: ");
        numero = Integer.parseInt(entrada.nextLine());
        while(numero >= 0){
            System.out.println("el numero "+numero+" es POSITIVO");
            conteo++;
            System.out.println("Digite otro numero: ");
            numero = Integer.parseInt(entrada.nextLine());
        }
        System.out.println("A ingresado "+conteo+" numeros que no son negativos");
    }
}
