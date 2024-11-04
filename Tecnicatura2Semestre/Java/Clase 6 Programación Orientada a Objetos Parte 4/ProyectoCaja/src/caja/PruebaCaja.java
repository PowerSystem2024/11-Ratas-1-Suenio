package caja;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(5, 5, 5);
        int volumen = caja1.calcularVolumen();
        System.out.println("El volumen de la caja es: " + volumen);
    }
}