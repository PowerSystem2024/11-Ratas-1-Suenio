//juego 1 en eleccion

import java.util.Random;

public class Tragamonedas implements Juego {
    private static final String[] simbolos = {"🍒", "🍋", "🔔", "⭐", "💎"};
    private Random random = new Random();

    @Override
    public int jugar(int apuesta) {
        String resultado1 = simbolos[random.nextInt(simbolos.length)];
        String resultado2 = simbolos[random.nextInt(simbolos.length)];
        String resultado3 = simbolos[random.nextInt(simbolos.length)];

        System.out.println("Resultado: " + resultado1 + " | " + resultado2 + " | " + resultado3);

        if (resultado1.equals(resultado2) && resultado2.equals(resultado3)) {
            int ganancia = apuesta * 5;
            System.out.println("¡Felicidades! Has ganado $" + ganancia);
            return ganancia; // Devuelve la ganancia
        } else {
            System.out.println("Has perdido.");
            return 0; // Devuelve 0 si se pierde
        }
    }
}
