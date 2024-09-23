package caja;

public class Caja {
    private int ancho;
    private int alto;
    private int profundidad;

    public Caja(int ancho, int alto, int profundidad) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public int calcularVolumen() {
        return ancho * alto * profundidad;
    }
}