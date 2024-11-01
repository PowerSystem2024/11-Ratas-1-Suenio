package Clase4;
import javax.swing.*;

/*
Ejersicio 7: Pedir numeros hasta que se introduzca
uno negativo y calcular el promedio
 */
public class clase0407 {
    public static void main(String[] args) {
        int numero, conteo = 0, suma = 0;
        float promedio = 0;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        while(numero >= 0){ // mientras el numero no sea negativo
            suma += numero;
            conteo++;
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        }
        if(conteo == 0){
            JOptionPane.showMessageDialog(null, "Error, la divicion entre cero no existe");
        }else{
            promedio = (float)suma/conteo;
            JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
        }
    }
}
