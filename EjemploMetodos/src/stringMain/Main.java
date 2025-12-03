package stringMain;

public class Main {
    static void main() {
        String cadena = "1";
        System.out.println(cadena);
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
