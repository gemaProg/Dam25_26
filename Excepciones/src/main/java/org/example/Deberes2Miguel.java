package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Deberes2Miguel {
    static void main() {
        Scanner sc = new Scanner(System.in);
        boolean longitud = false;
        do {
            try {
                System.out.println("Introduce longitud:");
                int longi = sc.nextInt();
                Comprobaciones.longOk(longi);
                longitud = true;
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número entero");
                sc.nextLine();
            } catch (LongException e) {
                System.out.println(e.getMessage());
            }
        } while (!longitud);
        System.out.println("Longitud registrada con éxito");
    }
}
