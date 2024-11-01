package CreacionMetodos2;
//clases 5
public class Aritmetica {
    //atributos de la clase
    int a;
    int b;
    //El constructor es un metodo especial
    public Aritmetica(){//constructor 1
        System.out.println("Se esta ejecutando este constructor numero uno");
    }
    public Aritmetica(int a, int b){//Constructor 2
        this.a = a;
        this.b = b;
        System.out.println("Se esta ejecutando el  contructor numero dos");
    }


    //metodo
    public void sumarNumeros(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    public int sumarConRetorno(){
        //int resultado = a + b;
        return a + b; // parentesis es opcional
    }
    public int sumarConArgumentos(int arg1, int arg2){
        this.a = arg1; //el argumento ase asigna al atributo this.a
        this.b = arg2; //en este momento el uso es opcional
        //return a + b;
        return sumarConRetorno(); //llamamos un metodo para que haga lo mismo de la inea de arriba
    }
}
