package test;
import org.example.Persona.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false);

        System.out.println("Nombres es: " + persona1.getNombre());
        //Modificamos a través de los métodos
        persona1.setNombre("Flauta");
        System.out.println("Nombres es: " + persona1.getNombre());

        //Creando otro objeto de tipo Persona
        Persona persona2 = new Persona("Christian", 10.000, false);
        System.out.println(persona2);

        persona2.setNombre("Alex");
        persona2.setSueldo(25.000);
        persona2.setEliminado(true);
        System.out.println(persona2);
    }
}
