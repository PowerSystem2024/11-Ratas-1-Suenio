package claseCiclos.ejercicios;
import javax.swing.JOptionPane;

//Ejercicio: Pedir al usuario dia, mes y año y validar la fecha (todos los meses tienen 30 días)

public class EjerciciosCiclos09a {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un día: "));
        if (dia > 0 && dia < 31) {
            int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un mes: "));
            if (mes > 0 && mes < 13){
                int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un año: "));
                if (anio < 2025){
                    JOptionPane.showMessageDialog(null, "La fecha es correcta: " + dia + '/' + mes + '/' + anio);
                }
            }
        }     
    }
}