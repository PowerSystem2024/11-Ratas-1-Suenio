package claseCiclos.ejercicios;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

//Ejercicio: Pedir un numero al usuario e imprimir todos los numeros hasta llegar al ingresado.

public class EjerciciosCiclos08a {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        List lista = new ArrayList<>();

        for(int i = 1; i<= numero; i++) {
           lista.add(i);
        }
        JOptionPane.showMessageDialog(null,lista);
    }
}
