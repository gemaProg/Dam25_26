package org.example;

import java.util.Scanner;
//deberes 1. bucle con booleano hasta que introduzca una bandera bien
//deberes 2. chequear que la longitud de la playa esté en un rango

    public class Deberes1Miguel {
        static void main() {
            Scanner sc = new Scanner(System.in);
            boolean bandera = false;
            do {
                try {
                    System.out.println("Introduce el color de la bandera");
                    String flag = sc.nextLine();
                    Comprobaciones.flagOk(flag);
                    bandera=true;
                } catch (FlagException e) {
                    System.out.println(e.getMessage());
                }
            } while (!bandera);
            System.out.println("Bandera registrada con éxito!");
        }

}
