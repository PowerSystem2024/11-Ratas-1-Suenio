package CreacionMetodos2;

public class AritmeticaAction {
    public static void main(String[] args) {
        var a = 10;// variables locales, se puede utilizar var pero en el tipo de funcion (Aritmetica(int a, int b)) no se puede ni se debe utilizar var
        int b = 7; // tambien es una memoria stack (*memorias locales son stack)
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 7;
        miMetodo(); // Llamamos el metodo nuevo
        aritmetica1.sumarNumeros();

        //Para almacenar un objeto se utiliza la memoria heap
        int resultado = aritmetica1.sumarConRetorno(); // (*memoria que funciona con objetos o atributos es heap)
        System.out.println("resultado = " + resultado);

        resultado = aritmetica1.sumarConArgumentos(12, 26);
        System.out.println("resultado usando argumentos = " + resultado);

        System.out.println("aritmetica a: "+aritmetica1.a);
        System.out.println("aritmetica a: "+aritmetica1.b);

        Aritmetica aritmetica2 = new Aritmetica(5, 8); // Creamos un nuevo objeto que trata con el constructor 2
        System.out.println("aritmetica2 = " + aritmetica2.a);
        System.out.println("aritmetica2 = " + aritmetica2.b);
        //aritmetica1 = null; nunca utilizar esto, no se debe hacer
        //System.gc(); funciona para limpiar informacion (no muy recomendado por la prioridad que tiene)
        Persona persona = new Persona("Ariel", "Betancud");
        System.out.println("persona = " + persona);
        System.out.println("Persona nombre: "+persona.nombre);
        System.out.println("Persona apellido: "+persona.apellido);
    }

    public static void miMetodo(){ //Metodo dentro de modularidad
        //int a = 10; // una variable esta limitada
        System.out.println("Aqui hay otro metodo");
    }
}


//modularidad creamos un nuevo metodo
class Persona{
    String nombre;
    String apellido;
// creamos una nueva clase
    Persona(String nombre, String apellido){
        super(); // llamamos al conbstructo clase padre object
        //Imprimir imprimir = new Imprimir();
        new Imprimir().imprimir(this);
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this: "+this);
    }
}
class Imprimir{
    public Imprimir(){
        super();
    }
    public void imprimir(Persona persona){
        System.out.println("Persona desde la clase imprimir: "+persona);
        System.out.println("Impresion del objeto actual (this): "+this);
    }

}