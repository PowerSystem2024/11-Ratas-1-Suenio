package claseCiclos.ejercicios;

import javax.swing.*;
/*
Ejercicio 2: Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se introduzca un cero
 */
public class EjerciciosCiclos02b {
    public static void main(String[] args){

        var num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        while(num != 0){
            if(num > 0){
                JOptionPane.showMessageDialog(null, "El número " + num + " es positivo");
            }else{
                JOptionPane.showMessageDialog(null, "El número " + num + " es negativo");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número si desea continuar, sino ingrese un 0 (cero): "));
        }
        JOptionPane.showMessageDialog(null, "Programa finalizado");
    }
}
