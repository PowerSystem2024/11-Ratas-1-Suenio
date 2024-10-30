package Clase3;
import javax.swing.*;
import java.util.Scanner;

public class clase0302 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;

        System.out.println("Digite un numero: ");
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero != 0){
            if(numero % 2 == 0){
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es PAR");
            }else{
                JOptionPane.showMessageDialog(null, "El numero ingresado "+numero+" es IMPAR");
            }
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "El numero ingresado es "+numero+" finaliza el programa");
    }
}
