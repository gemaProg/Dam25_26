import java.io.IOException;
import java.util.Scanner;

public class OperacionesString {
    /**
     * Operaciones:
     * Comparar
     * Contiene
     * Remplazar
     * CharAt
     * Paso a mayúsculas
     * Paso a minúsculas
     * Substring
     */
    public static void remplazarAutonónomo (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Intoduce texto");
        String texto = sc.nextLine();
        char car1;
        do {
            System.out.println("Intoduce caracter (que exista en el texto) a reemplazar");
            car1 = texto.charAt(0);
        }while(!OperacionesString.existeCaracter(texto, car1));

        System.out.println("Intoduce caracter final");
        char car2 = texto.charAt(0);
        texto=texto.replace(car1, car2);
        System.out.println(texto);
    }
    public static void remplazar() throws IOException {
        String texto = EntradaSalida.dameString("Introduce texto");
        /*String texto2 =EntradaSalida.dameString("Intoduce caracter a reemplazar");
        char car1 = texto2.charAt(0);
        // char car1 = EntradaSalida.dameString("Intoduce caracter a reemplazar").charAt(0);
        */
        char car1;
        do {
           car1 = EntradaSalida.dameCaracter("Intoduce caracter (que exista en el texto) a reemplazar");
        }while(!OperacionesString.existeCaracter(texto, car1));

        char car2 = EntradaSalida.dameCaracter("Intoduce caracter final");
        texto = texto.replace(car1, car2);
        EntradaSalida.imprimir("El texto queda" + texto);
    }
    public static boolean existeCaracter(String texto, char inicial) {
        //return texto.contains(inicial+"");
        return texto.contains(Character.toString(inicial));
        //return texto.contains(String.valueOf(inicial));

    }

    public static String reemplazar(String texto, char inicial, char fin){
        /*texto =  texto.replace(inicial, fin);
        return texto;*/
        return texto.replace(inicial, fin);
    }

}
