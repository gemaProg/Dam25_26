package org.example;

import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class GestionFicheros {
    public static final String NOMBRE_DE_FICHERO = "Fichero";
    public static final String NOMBRE_DE_FICHERO_BINARIO = "Binary";

    public static String crearFichero(String nombreFichero) throws FileNotFoundException {
        File f = new File(nombreFichero);
        String respuesta = null;

        if (f.exists()) {
            respuesta = "Fichero ya existe y su tamaño es: " + f.length();
        } else {

            try {
                respuesta = f.createNewFile() ? "Fichero creado" : "Fichero no creado porque no tiene permisos";
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
        //El flujo se puede establecer no sólo con el nombre del fichero sino también con un objeto de tipo File, el manejador
        // PrintWriter pw = new PrintWriter(f);


        return respuesta;
    }

    public static void escribirFicheroPW1(String nombreFichero) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(nombreFichero);
        pw.println("Hola, ya estamos escribiendo un fichero");
        pw.close();
    }

    public static void escribirFicheroPW2(String nombreFichero) {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(nombreFichero);
            pw.println("Hola, ya estamos escribiendo un fichero");
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
    }

    public static void escribirFicheroPW3(String nombreFichero) {
        // try catch con recursos, el cierre del fichero lo hace java automáticamente
        try (PrintWriter pw = new PrintWriter(nombreFichero)) {
            pw.println("Hola, ya estamos escribiendo un fichero");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void escribirFicheroPW() {
        escribirFicheroPW2(NOMBRE_DE_FICHERO);
    }

    public static void escribirFicheroFW1(String nombreFichero, String texto, boolean append) {
        try {
            FileWriter fw = new FileWriter(nombreFichero, append);
            fw.write(texto + "\n");
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribirFicheroFW2(String nombreFichero, String texto, boolean append) {
        // try catch con recursos, el cierre del fichero lo hace java automáticamente

        try (FileWriter fw = new FileWriter(nombreFichero, append)) {
            fw.write(texto + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void escribirFicheroPWFW(String nombreFichero, String texto, boolean append) {
        try {
           /* FileWriter fw = new FileWriter(nombreFichero, append);
            PrintWriter pw = new PrintWriter(fw);*/
            PrintWriter pw = new PrintWriter(new FileWriter(nombreFichero, append));
            pw.println(texto);
            //pw.printf("%s\n",texto);
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void escribirFicheroPW(String nombreFichero, String[] coches) {
        try {
            PrintWriter pw = new PrintWriter(nombreFichero);
            for (int i = 0; i < coches.length; i++) {
                pw.println(coches[i]);
            }
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Escribir el contenido del ArrayList en un fichero
     *
     * @param nombreFichero
     * @param coches
     */
    public static void escribirFicheroPWArrayList(String nombreFichero, List<String> coches) {
        try (PrintWriter pw = new PrintWriter(nombreFichero)){
        //try{
            //PrintWriter pw = new PrintWriter(nombreFichero);
            for (int i = 0; i < coches.size(); i++) {
                pw.println(coches.get(i));
            }
        //    pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    //Ficheros Binarios
    public static void escribirBinary(String texto){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_DE_FICHERO_BINARIO));
            oos.writeObject(texto);
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    //Así no
    public static void escribirBinaryPalabras(List<Palabra> lista){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_DE_FICHERO_BINARIO));
            for (int i = 0; i < lista.size(); i++) {
                oos.writeObject(lista.get(i));
            }
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    //Así no
    public static List<Palabra> leerBinaryPalabras(){
        List<Palabra> palabras = new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_DE_FICHERO_BINARIO))) {
            for (int i = 0; i < 4 ; i++) { //y si no son 4
                palabras.add((Palabra)ois.readObject() );
            }

        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return palabras;
    }

    public static void leerFichero() {
       /* File f = new File(NOMBRE_DE_FICHERO);
        Scanner sc = new Scanner(f);*/
        try {
            Scanner lectorFichero = new Scanner(new File(NOMBRE_DE_FICHERO));
            while (lectorFichero.hasNextLine()) {
                String texto = lectorFichero.nextLine();
                System.out.println(texto);
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
    }

    public static String leerFicheroFR(String nombreFichero) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader lectorFichero = new BufferedReader(new FileReader(nombreFichero));
            String linea = null;
            do {
                linea = lectorFichero.readLine();
                sb.append(linea).append("\n");
            } while (linea != null);
        } catch (IOException e) { //incluye a la FileNotFound por herencia
            System.out.println(e.getMessage());
        }
       return sb.delete(sb.length() - 5, sb.length()).toString(); //en vez de poner un if (linea!=null)
       //return sb.toString(); //imprime null, lo quito con la sentencia de arriba
    }

    public static String leerFichero(String nombreFichero) {
       /* File f = new File(nombreFichero);
        Scanner sc = new Scanner(f);*/
        StringBuilder sb = new StringBuilder();
        try {
            Scanner lectorFichero = new Scanner(new File(nombreFichero));
            while (lectorFichero.hasNextLine()) {
                String texto = lectorFichero.nextLine();
                sb.append(texto).append("\n");
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        return sb.toString();
    }

    /**
     * Método que lee el fichero que contiene una lista de colores y nos devuelve un array donde en cada posición tenemos un color
     *
     * @param nombreFichero que contiene los colores a cargar en RAM
     * @return el array con los colores
     */
    public static String[] leerFicheroColoresCochesMiguel(String nombreFichero) {
        int cuantos = cuantosColoresHayFichero(nombreFichero);
        String[] colores = new String[cuantos];
        try {
            Scanner lectorFichero = new Scanner(new File(nombreFichero));
            //for (int i = 0; lectorFichero.hasNextLine(); i++) {
            for (int i = 0; i<cuantos; i++) {
                colores[i] = lectorFichero.nextLine();
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        return colores;
    }

    /**
     * Método que  que lee el fichero que contiene una lista de colores y nos devuelve un arrayList donde en cada posición tenemos un color
     *
     * @param nombreFichero
     * @return ArrayList con los colores del fichero
     */
    public static List<String> leerFicheroArrayList(String nombreFichero) {
        List<String> colores = new ArrayList<String>();
        try {
            Scanner lectorFichero = new Scanner(new File(nombreFichero));
            for (int i = 0; lectorFichero.hasNextLine(); i++) {
                colores.add(lectorFichero.nextLine());
                //colores.add(new Elemento(lectorFichero.nextLine()));
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        return colores;
    }

    /**
     * Método que  que lee el fichero que contiene una lista de colores y nos devuelve un treeSet donde en cada posición tenemos un texto, odenado y sin duplicados
     *
     * @param nombreFichero
     * @return ArrayList con los colores del fichero
     */
    public static Set<String> leerFicheroTreeSet(String nombreFichero) {
        Set<String> colores = new TreeSet<String>();
        try {
            Scanner lectorFichero = new Scanner(new File(nombreFichero));
            for (int i = 0; lectorFichero.hasNextLine(); i++) {
                colores.add(lectorFichero.nextLine());
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        return colores;
    }


    /**
     * Método que devuelve el número de líneas, en el caso concreto del fichero de colores, la cantidad de colores
     *
     * @param nombreFichero
     * @return el número de líneas
     */
    private static int cuantosColoresHayFichero(String nombreFichero) {
        int contadorColores = 0;
        try {
            Scanner lectorFichero = new Scanner(new File(nombreFichero));
            while (lectorFichero.hasNextLine()) {
                lectorFichero.nextLine(); //no almaceno en ningún sitio lo leido
                contadorColores++;
            }
            lectorFichero.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");
        }
        return contadorColores;
    }
    //Ficheros Binarios
    //Así sí
    public static void escribirBinaryPalabrasDeUna(List<Palabra> lista){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_DE_FICHERO_BINARIO));
            oos.writeObject(lista);
            oos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    //Así sí
    public static List<Palabra> leerFicheroBinario() {
        List<Palabra> palabras = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_DE_FICHERO_BINARIO))) {
            palabras = (List<Palabra>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado");;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return palabras;
    }
}