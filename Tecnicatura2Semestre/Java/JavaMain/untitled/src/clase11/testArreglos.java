package clase11;

public class testArreglos {
    public static void main(String[] args) { // instalamos un objeto de tipo object
        int edades[] = new int [3]; // declaramos la variable
        System.out.println("edades = "+edades);

        edades[0] = 17;
        System.out.println("edades 0 = " + edades[0]);

        edades[1] = 22;
        System.out.println("edades 1 = " + edades[1]);

        edades[2] = 18;
        System.out.println("edades 2 = " + edades[2]);

        //edades[3] = 7; // fuera de rango, error en tiempo de ejecuccion

        for(int i = 0; i < edades.length; i++){
            System.out.println("edades y sus elementos "+i+": "+edades[i]);
        }
    }
}
