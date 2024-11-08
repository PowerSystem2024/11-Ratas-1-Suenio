package clase10;

public class sobrecargaMetodos {

    public static int sumar(int a, int b) { // no soporta tipo long
        System.out.println("Metodo para sumar enteros");
        return a + b;
    }
    public static double sumar(double a, double b) {
        System.out.println("metodo para sumar double");
        return a + b;
    }

}
