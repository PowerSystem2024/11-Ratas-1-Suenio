package org.example.Ciclos05;

/*
Ejercicio 5: Realizar un juego para adivinar un número,
para ello generar un número aleatorio entre 0-100, y
luego ir pidiendo números indicando "es mayor" o
"es menor" según sea mayor o menor con respecto a N
El proceso termina cuando el usuario acierta y mostramos
el número de intentos hechos.
Clase JOptionPane
 */
public class Ejercicio05 {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random() * 101);
        int numeroUsuario;
        int intentos = 0;

        do {
            numeroUsuario = Integer.parseInt(javax.swing.JOptionPane.showInputDialog("Introduce un número: "));
            if (numeroUsuario < numeroAleatorio) {
                javax.swing.JOptionPane.showMessageDialog(null, "Es mayor");
            } else if (numeroUsuario > numeroAleatorio) {
                javax.swing.JOptionPane.showMessageDialog(null, "Es menor");
            }
            intentos++;
        } while (numeroUsuario != numeroAleatorio);

        javax.swing.JOptionPane.showMessageDialog(null, "¡Adivinaste! El número era " + numeroAleatorio);
        javax.swing.JOptionPane.showMessageDialog(null, "Número de intentos: " + intentos);
    }
}