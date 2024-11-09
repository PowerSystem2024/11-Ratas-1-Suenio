package clase11;

public class TestArreglosObject {
    public static void main(String[] args) {

        Persona persona[] = new Persona[2];

        persona[0] = new Persona("Augusto");
        persona[1] = new Persona("julian");

        System.out.println("persona 0 = " + persona[0]);
        System.out.println("persona 1 = " + persona[1]);

        for(int i = 0; i < persona.length; i++) {
            System.out.println("persona = "+i+" = "+ persona[i]);
        }
        //trabajamos con arreglos en la sintaxis resumida
        String frutas[] = {"Banana", "Pera", "Durazno"};
        for(int i = 0; i < frutas.length; i++) {
            System.out.println("frutas = "+ frutas[i]);
        }
    }
}
