package org.example;

import javax.xml.transform.Source;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    //entrada salida

    /**
     * Lista el contenido de un directorio dado.
     *
     * @param ruta Ruta del directorio
     */
    public static void listarContenido(String ruta) {
        File directorio = new File(ruta);

        // Validar que exista y sea un directorio
        if (!directorio.exists()) {
            System.out.println("Error: el directorio no existe -> " + ruta);
        } else if (!directorio.isDirectory()) {
            System.out.println("Error: la ruta no es un directorio -> " + ruta);
        } else {
            // Obtener lista de archivos y carpetas
            File[] elementos = directorio.listFiles();
            if (elementos == null) {
                System.out.println("Error: el directorio está vacío.");
            } else {
                System.out.println("Contenido de: " + directorio.getAbsolutePath());
                System.out.println("--------------------------------------------");

                for (int i = 0; i < elementos.length; i++) {
                    String tipo = elementos[i].isDirectory() ? "[DIR]" : "[FILE]";

                    long tamanyo = elementos[i].isFile() ? elementos[i].length() : 0;

                    System.out.printf("%6s %-100s Tamaño: %-8d bytes\n",tipo, elementos[i].getName(), tamanyo);
                }
            }
        }
    }

    static void main() {
        Scanner lector = new Scanner(System.in);


        //System.out.println("Pulsa enter para empezar");
        //File file = new File("C:/prueba");
        //File file = new File("C:\\Users\\Gema\\Downloads");
        //File file = new File("C:/Users/Gema/Downloads");
        //File file = new File(".");//directorio actual
        System.out.println("Introduce el nombre del directorio");
        File file = new File(lector.nextLine());

        String[] listaFicheros = file.list();
        System.out.println(Arrays.toString(file.list()));
        System.out.println("Elige una opción \n");
        for (int i = 0; i < listaFicheros.length; i++) {
            System.out.println((i + 1) + ": " + listaFicheros[i]);
        }
        String rutaDirectorio = ".";


        listarContenido(file.getAbsolutePath());


    }
}
