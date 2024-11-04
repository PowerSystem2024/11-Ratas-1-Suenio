package claseCiclos.ejercicios;

import javax.swing.*;

/*
Ejercicio 5: Realizar un juego para adivinar un número, para ello generar un número aleatorio entre 0-100,
y luego ir pidiendo números indicando "es mayor" o "es menor" según sea mayor o menor con respecto a N.
El proceso termina cuando el usuario acierta y mostramos el número de intentos hechos
 */
public class EjerciciosCiclos05b {
    public static void main(String[] args){
        int aleatorio = (int) (Math.random() * 100); // Genera un número aleatorio entre 0 y 100
        int intentos = 1;
        System.out.println(aleatorio);
        var num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));

        do {

            if (num == aleatorio){
                break; // Si le acierta a la primera, salgo del bucle
            }else if (num > aleatorio){
                JOptionPane.showMessageDialog(null, "El número ingresado es mayor");
            }else{
                JOptionPane.showMessageDialog(null, "El número ingresado es menor");
            }

            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número"));
            intentos++;
        }while(num != aleatorio);

        JOptionPane.showMessageDialog(null, "Adivino el número en " + intentos + " intentos");
    }
}
