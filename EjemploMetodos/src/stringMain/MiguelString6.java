package stringMain;

import java.util.Scanner;

public class MiguelString6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce cadena de carácteres");
        String palabra= sc.nextLine();
        int caracteres;
        do {
            System.out.println("Introduce cuántas caracteres quieres que extraiga desde la izquierda");
            caracteres = sc.nextInt();
            if (caracteres>palabra.length()) {
                System.err.println("Error el número de caracteres introducidos es superior a la longitud");
            }
        }while(caracteres>palabra.length());

        System.out.println(palabra.substring(0,caracteres));
    }
}
