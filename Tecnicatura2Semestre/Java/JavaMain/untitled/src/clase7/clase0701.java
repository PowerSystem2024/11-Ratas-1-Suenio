/*
Ejercicio 11: Diseñar un programa que muestre un producto
que mestre los 10 primeros numeros impares
hacer con JOptionPane
 */
//ciclos11
package clase7;

import javax.swing.*;

public class clase0701 {
    public static void main(String[] args) {
        long producto = 1;
        for(int i = 1; i <= 20; i += 2){
            producto *= i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los numeros inpares es: "+producto);
    }
}
