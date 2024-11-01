package clase5;

import javax.swing.*;

public class clase0504 {
    public static void main(String[] args) {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el dia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Digite el año: "));
        if((dia != 0)&&(dia <= 30)){
            if((mes != 0)&&(mes <= 12)){
                if((anio != 0)&&(anio <= 2024)){
                    JOptionPane.showMessageDialog(null, "La fecha ingresada es: \n{"+dia+"/"+mes+"/"+anio+"}");
                }else{
                    JOptionPane.showMessageDialog(null,"Fecha ingresada, año incorrecto");
                }
            }else{
                JOptionPane.showMessageDialog(null,"Fecha ingresada, mes incorrecto");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Fecha ingresada, dia incorrecto");
        }

    }
}
