package test;

import domain.Persona;

public class PersonaPrueba2 {
    private int contador;

    public static void main(String[] args) {
        Persona persona1 = new Persona("Ariel");
        Persona persona2 = new Persona("Pepe");

        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        imprimir(persona1);
        imprimir(persona2);
        PersonaPrueba2 personaP1 = new PersonaPrueba2();
        System.out.println(personaP1.getContador());
    }

    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    public int getContador(){
        imprimir(new Persona("Liliana"));
        return this.contador;
    }
}
