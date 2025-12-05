import java.io.IOException;
import java.util.Scanner;

public class EntradaSalida {
    public static int dameOperando1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer operando: ");
        int num = sc.nextInt();
        return num;
    }

    public static int dameNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca numero: ");
        int num = sc.nextInt();
        return num;
    }

    public static int dameNumero(String frase) {
        Scanner sc = new Scanner(System.in);
        System.out.println(frase);
        int num = sc.nextInt();
        return num;
    }

    public static int dameOperando2() {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduzca el segundo operando: ");
            num = sc.nextInt();
        } while (num == 0);
        return num;
    }

    public static void imprimirNumero(int num) {
        System.out.println(num);
    }

    public static boolean imprimirArray(int num[]) {
        boolean resultado = true;
        if (num != null)
            for (int i = 0; i < num.length; i++) {
                System.out.printf("%2d-", num[i]);
            }
        else
            resultado = false;
        return resultado;
    }
    public static void imprimirArrayAnterior(int num[]) {
            for (int i = 0; i < num.length; i++) {
                System.out.printf("%2d-", num[i]);
            }
    }

    public static String dameString (String frase){
        System.out.println(frase);
        Scanner sc = new Scanner(frase);
        return sc.nextLine();
    }

    public static char dameCaracter(String intoduceCaracterAReemplazar) throws IOException {
        imprimir(intoduceCaracterAReemplazar);
        char letra = (char) System.in.read();
        return letra;
    }

    public static void imprimir(String s) {
        System.out.println(s);
    }
}
