package stringMainBufferedReaderStringBuilder;

/*
 * Programa que convierte un texto en minúsculas a mayúsculas.
 */

import java.util.Scanner;

public class MiguelString5 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce palabra");
        String palabra = sc.nextLine();
        System.out.println(palabra.toUpperCase());
    }
}
