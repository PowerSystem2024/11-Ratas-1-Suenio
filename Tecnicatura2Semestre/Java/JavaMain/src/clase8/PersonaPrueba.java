package clase8;

import clase7.Persona;

public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57.000, false);
        System.out.println("persona1 su nombre es: "+persona1.getNombre());
        //modificar a traves de los metodos
        persona1.setNombre("juan ignacio");
        //persona1.nombre = "juan ignacio"; // ya no se puede utilizar
        //System.out.println("nombre es: "+persona1.nombre); //Error
        System.out.println("persona1 con su nombre modificado: "+persona1.getNombre());
        System.out.println("persona1 el resultado para el sueldo: "+persona1.getSueldo());
        System.out.println("persona1 para obtener el booleano: "+persona1.isEliminado());
        /*
        Tarea: crea otro objeto de tipo persona, asignar valores de manera inicial
        e imprime, luego modificar sus valores y volver a imprimir
         */
        Persona persona2 = new Persona("María", 65.500, true);
        System.out.println("persona2 su nombre es: " + persona2.getNombre());
        System.out.println("persona2 el resultado para el sueldo: " + persona2.getSueldo());
        System.out.println("persona2 para obtener el booleano: " + persona2.isEliminado());

        persona2.setNombre("Ana");
        persona2.getSueldo(70.000);
        persona2.setEliminado(false);

        System.out.println("persona2 con nombre modificado: " + persona2.getNombre());
        System.out.println("persona2 con sueldo modificado: " + persona2.getSueldo());
        System.out.println("persona2 con booleano modificado: " + persona2.isEliminado());
        System.out.println("persona1: "+persona1);
    }
}
