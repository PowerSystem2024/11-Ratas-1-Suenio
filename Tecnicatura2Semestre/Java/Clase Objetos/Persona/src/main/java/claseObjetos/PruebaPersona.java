package claseObjetos;

public class PruebaPersona {
    public static void main(String[] args){
        Persona persona1 = new Persona(); //Llamamos al constructor de la persona
        persona1.nombre = "Pablo";
        persona1.apellido = "Ibañez";
        persona1.obtenerInformacion();

        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);

        persona2.obtenerInformacion();

        persona2.nombre = "Ignacio";
        persona2.apellido = "Ibañez";

        persona2.obtenerInformacion();
    }
}
