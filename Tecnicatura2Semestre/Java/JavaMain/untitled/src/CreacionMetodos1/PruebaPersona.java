
package CreacionMetodos1;


public class PruebaPersona{
    public static void main() {
        PersonaN persona1 = new PersonaN(); // llamamos el contructo
        persona1.nombre = "augusto"; // el valor hexadecimal normalemnte comienza con 0x
        persona1.apellido = "vernengo";
        persona1.obtenerInformacion();

        PersonaN persona2 = new PersonaN();
        System.out.println("persona2 = "+persona2);
        System.out.println("persona1 = "+persona1);
        persona2.obtenerInformacion();
        persona2.nombre = "osvaldo";
        persona2.apellido = "giordanini";
        persona2.obtenerInformacion();

    }
}
