package stringMain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    static void main() throws IOException {
        System.out.println("Introduce número");
        /*Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();*/


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String cadena = br.readLine();
        int numero = Integer.parseInt(cadena);
        System.out.println(numero);

        StringBuilder sb = new StringBuilder(cadena);
        for (int i = 0; i <= 10; i++) {
            /*estas formas concatenando String provocan la creación de un objeto distinto en cada iteración, pérdida de RAM
            //cadena += i;
            cadena = cadena.concat(String.valueOf(i));*/
            sb.append(i);
            System.out.println(sb.toString());

        }

    }
}
