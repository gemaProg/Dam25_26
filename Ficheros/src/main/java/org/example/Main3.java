package org.example;

import java.io.File;
import java.util.Arrays;
//16_3
public class Main3 {
    static void main() {
        GestionFicheros.escribirFicheroPW("Hello", Constantes.COCHES);
        System.out.println(Arrays.toString(GestionFicheros.leerFicheroColoresCochesMiguel("Hello")));
        //Imprimir color por línea
        String [] colores= GestionFicheros.leerFicheroColoresCochesMiguel("Hello");
        for (int i = 0; i < colores.length ; i++) {
            System.out.println(colores[i]);
        }
    }
}
