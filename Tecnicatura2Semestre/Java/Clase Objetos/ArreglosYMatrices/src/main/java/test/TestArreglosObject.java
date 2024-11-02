package test;
import domain.Persona;

public class TestArreglosObject {
  public static void main(String[] args) {
    Persona personas[] = new Persona[2];

    personas[0] = new Persona("Chris");
    personas[1] = new Persona("Pepe");

    for (int i = 0; i < personas.length; i++) {
      System.out.println("Personas = " + i + ": "+ personas[i]);
    }

    String frutas[] = {"Banana", "Pera", "Manzana"};
    for (int i = 0; i < frutas.length; i++) {
      System.out.println("Frutas = "+ i +": " + frutas[i]);
    }
  }
}
