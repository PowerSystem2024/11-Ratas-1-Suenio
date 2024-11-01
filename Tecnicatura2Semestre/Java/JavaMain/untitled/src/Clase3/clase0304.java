package Clase3;
import javax.swing.*;

/*
Ejersicio 4: pedir numeros hasta que se teclee uno negativo,
y mostrar cuantos numeros se han introducido,
lo hacemos primero con scanner y luego con JOptionpane
 */
public class clase0304 {
    public static void main(String[] args) {
        int numero, conteo = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        while(numero >= 0){
            JOptionPane.showMessageDialog(null, "El numero "+numero+" es POSITIVO");
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        JOptionPane.showMessageDialog(null, "A ingresado "+conteo+"numeros que no son negativos");
    }
}
