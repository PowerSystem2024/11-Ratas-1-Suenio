/*
Ejercicio 12: pedir un numero y calcular su factorial
hacer con las dos clases, scanner y JOptionPane
 */
package clase7;

import javax.swing.*;
import java.util.Scanner;

public class clase0702 {
    public static void main(String[] args) {
        //Scanner entrada = new Scanner(System.in);
        long factorial = 1;
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        for(int i=1 ; i<=numero ;i++){
            factorial *= i;
        }
        //System.out.println("\nEl factorial del numero ingresado es: "+factorial);
        JOptionPane.showMessageDialog(null, "El factorial del numero ingresado es: "+factorial);
    }
}
