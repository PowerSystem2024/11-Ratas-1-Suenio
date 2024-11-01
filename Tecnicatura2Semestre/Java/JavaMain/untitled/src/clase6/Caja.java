/*
Proyecto caja:
Ejercicio 1: crear un proyecto segun las especificaciones
mostrar a continuacion.
la formula es: ancho * alto * profundidad
 */
package clase6;

public class Caja {
    //Atributos (caracteristicas)
    int ancho;
    int alto;
    int profundo;
    public Caja(){ // constructor 1 = vacio
    }
    public Caja(int ancho, int alto, int profundo){ // constructo 2
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    public int calcularVolumen(){ // calculamos
        return ancho*alto*profundo;
    }
}
