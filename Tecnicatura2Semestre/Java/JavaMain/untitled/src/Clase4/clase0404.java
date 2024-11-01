package Clase4;
import javax.swing.*;

/*
ejersicio 6: pedir numeros hasta que se teclee un 0, mostrar
la suma de todos los numeros introducidos
 */
public class clase0404 {
    public static void main(String[] args) {
        int numero,suma = 0;
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            suma += numero;
        }while (numero != 0);
        JOptionPane.showMessageDialog(null,"\nLa suma de todos los numeros ingresados es: "+suma);
    }
}
