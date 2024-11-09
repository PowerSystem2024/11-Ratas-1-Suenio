package clase11;

public class testMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = "+edades);
        edades[0][0] = 5; // llenado manual
        edades[0][1] = 7; // es una diferente columna
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[2][0] = 2;// terminamos la tarea
        edades[2][1] = 9;

        System.out.println("edades 0-0 = "+edades[0][0]);
        System.out.println("edades 0-1 = "+edades[0][1]);
        System.out.println("edades 1-0 = "+edades[1][0]);
        System.out.println("edades 1-1 = "+edades[1][1]);
        System.out.println("edades 2-0 = "+edades[2][0]);
        System.out.println("edades 2-1 = "+edades[2][1]);
        System.out.println("Recorremos la matriz a tracez del ciclo for");

        for(int fila = 0; fila < edades.length; fila++) {
            for(int col = 0; col < edades[fila].length; col++) {
                System.out.println("edades "+fila+"-"+col+": "+edades[fila][col]);
            }
        }
        //Sintaxis clasica
        //String frutas[][] = new String3][2];

        //Sintaxis Simplifaicada
        String frutas[][] = {{"limon", "pomelo"},{"Ciruela", "Kiwi"},{"Banana","manzana"}};
        imprimir(frutas);
        //for(int i = 0; i < edades.length; i++) {
        //    for(int j = 0; j < edades[i].length; j++) {
        //        System.out.println("edades "+i+"-"+j+": "+edades[i][j]);
        //    }
        //}

        Persona persona[][] = new Persona[2][3];
        //asignamos valores a la matriz
        persona[0][0] = new Persona("Augusto");
        persona[0][1] = new Persona("Julian");
        persona[0][2] = new Persona("romina");
        persona[1][0] = new Persona("liliana");
        persona[1][1] = new Persona("natalia");
        persona[1][2] = new Persona("debora");
        System.out.println("matriz de personas: ");
        imprimir(persona);
    }

    public static void imprimir(Object matriz[][]) {
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[i].length; j++) {
                System.out.println("edades "+i+"-"+j+": "+matriz[i][j]);
            }
        }
    }
}
