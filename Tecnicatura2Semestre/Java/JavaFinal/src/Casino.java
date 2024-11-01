import java.util.Scanner;

public class Casino {
    private String nombre;
    private int balance;
    private Scanner scanner;

    // Constructor de la clase Casino
    public Casino() {
        scanner = new Scanner(System.in);
        System.out.print("Bienvenido al Casino! Por favor, ingresa tu nombre: ");
        nombre = scanner.nextLine();

        while (true) {
            System.out.print("Ingresa la cantidad de dinero con la que deseas jugar: ");
            try {
                balance = Integer.parseInt(scanner.nextLine());
                if (balance > 0) break;
                System.out.println("El saldo debe ser mayor a cero.");
            } catch (NumberFormatException e) {
                System.out.println("Por favor, ingresa un número válido.");
            }
        }
    }

    // Método para mostrar el menú principal y gestionar las opciones del usuario
    public void mostrarMenu() {
        while (true) {
            System.out.println("\nHola, " + nombre + "! ¿Qué te gustaría hacer?");
            System.out.println("1. Jugar Tragamonedas");
            System.out.println("2. Jugar Dados");
            System.out.println("3. Jugar Ruleta");
            System.out.println("4. Ver saldo");
            System.out.println("5. Salir");

            String opcion = scanner.nextLine();

            // Verifica el número y llama al juego o muestra el saldo
            if (opcion.equals("1")) {
                jugarJuego(new Tragamonedas());
            } else if (opcion.equals("2")) {
                jugarJuego(new Dados());
            } else if (opcion.equals("3")) {
                jugarJuego(new Ruleta());
            } else if (opcion.equals("4")) {
                System.out.println("Tu saldo actual es: $" + balance);
            } else if (opcion.equals("5")) {
                System.out.println("Gracias por jugar, " + nombre + ". ¡Hasta pronto!");
                break; // Cierra el bucle para terminar el programa
            } else {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }
    }

    // Método para gestionar la apuesta y jugar el juego elegido
    private void jugarJuego(Juego juego) {
        System.out.print("Ingresa tu apuesta: ");
        try {
            int apuesta = Integer.parseInt(scanner.nextLine());

            if (apuesta <= 0) {
                System.out.println("La apuesta debe ser mayor a cero.");
                return;
            }

            if (apuesta > balance) {
                System.out.println("No tienes suficiente saldo.");
            } else {
                int ganancia = juego.jugar(apuesta); // Llama al método jugar del juego seleccionado

                if (ganancia > 0) {
                    balance += ganancia; // Aumenta el saldo con las ganancias
                } else {
                    balance -= apuesta; // Resta la apuesta si pierde
                }
                System.out.println("Tu saldo actual es: $" + balance);
            }
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingresa un número válido.");
        }
    }

    // Método principal para iniciar el programa
    public static void main(String[] args) {
        Casino casino = new Casino(); // Llama al constructor
        casino.mostrarMenu(); // Llama al menú para que se ejecute el juego
    }
}
