import java.util.Random;
import java.util.Scanner;

public class Ruleta implements Juego {
    private Random random = new Random();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public int jugar(int apuesta) {
        System.out.print("Elige 'rojo', 'negro' o 'verde': ");
        String eleccion = scanner.nextLine().toLowerCase();
        String[] colores = {"rojo", "negro", "verde"};
        String resultado = colores[random.nextInt(colores.length)];

        System.out.println("La ruleta ha caído en: " + resultado);

        if (eleccion.equals(resultado)) {
            int ganancia = resultado.equals("verde") ? apuesta * 15 : apuesta * 2;
            System.out.println("¡Felicidades! Has ganado $" + ganancia);
            return ganancia; // Devuelve la ganancia
        } else {
            System.out.println("Has perdido.");
            return 0; // Devuelve 0 si se pierde
        }
    }
}
