//juego 2 en eleccion


import java.util.Random;

public class Dados implements Juego {
    private Random random = new Random();

    @Override
    public int jugar(int apuesta) {
        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;
        int resultado = dado1 + dado2;

        System.out.println("Has sacado: " + dado1 + " y " + dado2 + " (Total: " + resultado + ")");

        if (resultado == 7) {
            int ganancia = apuesta * 4;
            System.out.println("¡Felicidades! Has ganado $" + ganancia);
            return ganancia; // Devuelve la ganancia
        } else {
            System.out.println("Has perdido.");
            return 0; // Devuelve 0 si se pierde
        }
    }
}
