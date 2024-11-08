/*
uso de la palabra final esta palabra tiene diferentes significados
dependiendo donde se aplique
        variables: evita cambiar el valor que almacena la variable
        metodos: evita que se modifique la definicion o el comportamiento
                de un metodo desde una subclase (hija)
        clases: Evita que se creen clases hijas
    otra caracteristica es qie normalmente, cuando trabajamos con variables
    se combina con el modificador de acceso estatico para convertir una
    variable en una constante, es decir que no se puede modificar su valor,
    el ekemplo de esto es la clase math en la cual todos sus atributos son de
    tipos tatic y final, es por esto que la variable pi* se conoce como una constante
 */
package clase10;

public class TestFinal {
    public static void main(String[] args) {

        final int miDni = 43242587;
        System.out.println("miDni = " + miDni);
        //miDni = 20312321; // no se puede modificar

        //Persona.CONSTANTE_AQUI = 9; //no se modifica
        System.out.println("Mi atributo constante es: "+Persona.CONSTANTE_AQUI);

        final Persona persona1 = new Persona();
        // persona1 = new Persona(); // no se puede asignar una nueva referencia
        persona1.setNombre("augusto Vernengo");
        System.out.println("nombre de persona1 = " + persona1.getNombre());
        // no se puede hacer una nueva referencia pero si se pouede modificar el valor del atributo 
        persona1.setNombre("romina");
        System.out.println("nombre de persona1 = " + persona1.getNombre());
    }
}
