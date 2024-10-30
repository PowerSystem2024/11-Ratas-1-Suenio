//Paso por referencia
package clase6;

import CreacionMetodos1.PersonaN;

public class PasoPorReferencia {
    public static void main(String[] args) {
        PersonaN persona1 = new PersonaN();
        persona1.nombre = "Augusto";
        System.out.println("persona1 nombre = " + persona1.nombre);
        cambiarValor(persona1);
        System.out.println("El cambio que hicimos en el nombre es: "+persona1.nombre);
        persona1 = cambiarElValor(persona1);
        //PersonaN persona2 = null;
        PersonaN persona2 = new PersonaN();
        persona2 = cambiarElValor(persona2);
        System.out.println("El nuevo valor del objeto es: "+persona2.nombre);
    }

    public static void cambiarValor(PersonaN persona){ // parametro por referencia
        persona.nombre = "Julian";
    }
    public static PersonaN cambiarElValor(PersonaN persona){
        persona.nombre = "Romina";
        return persona;
    }
}
