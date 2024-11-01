import javax.swing.*;
import java.util.Random;

public class prueba {
    static Random random = new Random();
    static int saldo;

    public static void main(String[] args) {
        String saldoInicial = JOptionPane.showInputDialog(null, "Bienvenido al casino. Por favor, ingresa el monto inicial de dinero:");
        saldo = Integer.parseInt(saldoInicial);

        while (saldo > 0) {
            String opcion = mostrarMenu();

            switch (opcion) {
                case "1":
                    jugarRuleta();
                    break;
                case "2":
                    jugarDados();
                    break;
                case "3":
                    jugarTragamonedas();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Gracias por jugar. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
            }

            if (saldo <= 0) {
                JOptionPane.showMessageDialog(null, "Te has quedado sin dinero. El programa se cerrará.");
                System.exit(0);
            }

            JOptionPane.showMessageDialog(null, "Tu saldo actual es: $" + saldo);
        }
    }

    public static String mostrarMenu() {
        return JOptionPane.showInputDialog(null,
                "Elige un juego para jugar:\n" +
                        "1. Ruleta\n" +
                        "2. Dados\n" +
                        "3. Tragamonedas\n" +
                        "4. Salir",
                "Menú del Casino", JOptionPane.QUESTION_MESSAGE);
    }

    public static void jugarRuleta() {
        JOptionPane.showMessageDialog(null, "Jugando a la ruleta...");
        String apuestaStr = JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas apostar:");
        int apuesta = Integer.parseInt(apuestaStr);

        if (apuesta > saldo) {
            JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para esa apuesta.");
            return;
        }

        int resultado = random.nextInt(36) + 1;
        String eleccionStr = JOptionPane.showInputDialog(null, "Apuesta a un número del 1 al 36:");
        int eleccion = Integer.parseInt(eleccionStr);

        if (eleccion == resultado) {
            JOptionPane.showMessageDialog(null, "¡Ganaste! El número fue " + resultado);
            saldo += apuesta * 35; // Ganancia 35 a 1 en ruleta
        } else {
            JOptionPane.showMessageDialog(null, "Perdiste. El número fue " + resultado);
            saldo -= apuesta;
        }
    }

    public static void jugarDados() {
        JOptionPane.showMessageDialog(null, "Jugando a los dados...");
        String apuestaStr = JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas apostar:");
        int apuesta = Integer.parseInt(apuestaStr);

        if (apuesta > saldo) {
            JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para esa apuesta.");
            return;
        }

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int suma = dado1 + dado2;

        JOptionPane.showMessageDialog(null, "El resultado de los dados fue: " + dado1 + " y " + dado2 + " (Total: " + suma + ")");

        if (suma == 7 || suma == 11) {
            JOptionPane.showMessageDialog(null, "¡Ganaste!");
            saldo += apuesta;
        } else {
            JOptionPane.showMessageDialog(null, "Perdiste.");
            saldo -= apuesta;
        }
    }

    public static void jugarTragamonedas() {
        JOptionPane.showMessageDialog(null, "Jugando a las tragamonedas...");
        String apuestaStr = JOptionPane.showInputDialog(null, "Ingresa la cantidad que deseas apostar:");
        int apuesta = Integer.parseInt(apuestaStr);

        if (apuesta > saldo) {
            JOptionPane.showMessageDialog(null, "No tienes suficiente dinero para esa apuesta.");
            return;
        }

        int simbolo1 = random.nextInt(3);
        int simbolo2 = random.nextInt(3);
        int simbolo3 = random.nextInt(3);

        JOptionPane.showMessageDialog(null, "El resultado fue: " + simbolo1 + " | " + simbolo2 + " | " + simbolo3);

        if (simbolo1 == simbolo2 && simbolo2 == simbolo3) {
            JOptionPane.showMessageDialog(null, "¡Ganaste! Todos los símbolos coinciden.");
            saldo += apuesta * 10; // Multiplicador por ganar
        } else {
            JOptionPane.showMessageDialog(null, "Perdiste.");
            saldo -= apuesta;
        }
    }
}
