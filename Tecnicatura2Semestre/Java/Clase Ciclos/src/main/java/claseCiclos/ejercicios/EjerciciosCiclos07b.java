package claseCiclos.ejercicios;

import javax.swing.*;

/*
Ejercicio 7: Pedir números hasta que se introduzca uno negativo y calcular la media.
 */
public class EjerciciosCiclos07b {
    public static void main(String[] args){
        double media = 0;
        int cont = 0;
        int suma = 0;

        var num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        do{
            cont++;
            suma += num;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número o ingrese un número negativo para finalizar"));
        }while(num > 0);

        media = suma/cont;
        JOptionPane.showMessageDialog(null, "La media de todos los numeros ingresados es de: " + media);
    }
}
