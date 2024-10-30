/*
Ejersicio 7: pedir numeros hasta que se introduzca uno negativo
y calcular el promedio
 */
package Clase4;

import javax.swing.*;

public class clase0408 {
    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        while(numero >= 0){ // mientras el numero no sea negativo
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero: "));
        }
        if(conteo == 0){
            JOptionPane.showMessageDialog(null,"Error, la divicion entre cero no existe");
        }else{
            promedio = (float)suma/conteo;
            System.out.println("\nEl promedio es: "+promedio);
            JOptionPane.showMessageDialog(null,"El promedio es: "+promedio);
        }
    }
}
