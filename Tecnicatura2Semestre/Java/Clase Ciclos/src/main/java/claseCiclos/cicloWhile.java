package claseCiclos;

public class cicloWhile {
    public static void main(String[] args){
        var conteo = 0; //Inferencia de tipos

        System.out.println("<--------- Ciclo While -------->");

        while (conteo <= 10){
            System.out.println("conteo " + conteo);
            conteo++; //Aumentamos en 1 la variable
        }

        System.out.println("<--------- Ciclo do While -------->");

        var contador = 0;
        do {
            System.out.println("contador " + contador);
            contador++;
        }while(contador <= 10);

        System.out.println("<--------- Ciclo For -------->");

        for (var contando = 0; contando < 10; contando++) {
            System.out.println("contando = " + contando);
        }

        System.out.println("<--------- break -------->");

        for (var contandoBreak = 0; contandoBreak < 10; contandoBreak++) {
            if (contandoBreak % 2 == 0) {
                System.out.println("contando Break = " + contandoBreak);
                break; //Interrumpe la ejecución del ciclo
            }
        }

        System.out.println("<--------- continue -------->");

        for (var contandoContinue = 0; contandoContinue < 10; contandoContinue++) {
            if (contandoContinue % 2 != 0) {
                continue; //Pasa inmediatamente a la siguiente iteración sin pasar por lo que queda del mismo ciclo
            }
            System.out.println("contando Continue = " + contandoContinue);
        }

        System.out.println("<--------- Etiquetas Labels -------->");

        inicioBreak:
        for (var contandoInicioBreak = 0; contandoInicioBreak < 10; contandoInicioBreak++) {
            if (contandoInicioBreak % 2 == 0) {
                System.out.println("contando Labels break = " + contandoInicioBreak);
                break inicioBreak; //Interrumpe la ejecución del ciclo
            }
        }

        inicioContinue:
        for (var contandoInicioContinue = 0; contandoInicioContinue < 10; contandoInicioContinue++) {
            if (contandoInicioContinue % 2 != 0) {
                continue inicioContinue; //Pasa inmediatamente a la siguiente iteración sin pasar por lo que queda del mismo ciclo
            }
            System.out.println("contando labels continue = " + contandoInicioContinue);
        }
    }
}
