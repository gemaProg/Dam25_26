package org.example;
//13/4
public class Main6 {
    static void main() {
        Palabras palabras = new Palabras();
        System.out.println(palabras.getLista());
        GestionFicheros.escribirBinaryPalabrasDeUna(palabras.getLista());
        //--------------------------------------Lectura Fichero
        System.out.println(GestionFicheros.leerFicheroBinario());
    }
}
