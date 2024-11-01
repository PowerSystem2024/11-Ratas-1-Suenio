package Clase3;
import javax.swing.*;

/*

 */
public class clase0306 {
    public static void main(String[] args) {
        int numero, aleatorio, conteo = 0;
        aleatorio = (int)(Math.random()*100); //esto genera un numero aleatorio
        do{
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
            if(numero < aleatorio){
                JOptionPane.showInputDialog(null, "Digite un numero mayor");
            }else if(numero > aleatorio){
                JOptionPane.showInputDialog(null, "Digite un numero menor");
            }else{
                JOptionPane.showMessageDialog(null, "\t FELICIDADES has adivinado el numero");
            }
            conteo++;
        }while(numero != aleatorio);
        JOptionPane.showMessageDialog(null, "\t adivinaste el numero "+conteo+" intentos");
    }
}
