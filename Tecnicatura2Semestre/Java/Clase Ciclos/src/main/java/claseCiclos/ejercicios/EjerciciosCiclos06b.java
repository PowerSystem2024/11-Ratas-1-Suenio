package claseCiclos.ejercicios;

import javax.swing.*;

/*
Ejercicio 6: Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos
 */
public class EjerciciosCiclos06b {
    public static void main(String[] args){
        int suma = 0;
        var num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un número"));

        while (num != 0){
            suma += num;

            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número si desea continuar o ingrese un 0 (cero) para finalizar"));
        }
        JOptionPane.showMessageDialog(null, "La suma de todos los números ingresados es: " + suma);
    }
}
