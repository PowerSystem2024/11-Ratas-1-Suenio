package test;
import domain.Empleado;
import domain.Cliente;
import domain.Persona;

import java.util.Date;

public class TestHerencia {
  public static void main(String[] args) {
    Empleado empleado1 = new Empleado("Daai", 24000);
    System.out.println("empleado1 = " + empleado1);
    //Si en la clase Empleado no hemos creado nada, nos mostraría valores por defecto.
    //Esto porque hereda los atributos de Persona

    Cliente cliente1 = new Cliente("Pepito", new Date(), false);
    System.out.println("cliente1 = " + cliente1);

    Persona persona1 = new Persona();
  }
}
