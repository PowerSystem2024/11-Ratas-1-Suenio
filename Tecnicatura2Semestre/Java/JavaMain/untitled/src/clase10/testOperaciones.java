package clase10;

public class testOperaciones {
    public static void main(String[] args) {
        var resultado = sobrecargaMetodos.sumar(7, 9);
        System.out.println("Resultado: " + resultado);

        var resultado2 = sobrecargaMetodos.sumar(5.0, 7); // si agregamos entero solo se ejecuta entero y no double
        System.out.println("resultado2 = " + resultado2);

        var resultado3 = sobrecargaMetodos.sumar(8, 6L);
        System.out.println("resultado3 = " + resultado3);
    }
}
