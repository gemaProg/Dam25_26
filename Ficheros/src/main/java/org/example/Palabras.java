package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Palabras  {
    private List<Palabra> lista;

    public Palabras() {
        File fichero = new File(GestionFicheros.NOMBRE_DE_FICHERO_BINARIO);
        if (fichero.exists())
            lista = GestionFicheros.leerFicheroBinario();
        else{
            lista = new ArrayList<>();
            lista.add(new Palabra("Bart", "TheSimpsons"));
            lista.add(new Palabra("Hommer", "TheSimpsons"));
            lista.add(new Palabra("Juan", "TheSimpsons"));
            lista.add(new Palabra("Pedro", "TheSimpsons"));
            }

        }


    public Palabras(List<Palabra> lista) {
        this.lista = lista;
    }
    public List<Palabra> getLista() {
        return lista;
    }

    @Override
    public String toString() {
        return "Palabras{" +
                "lista=" + lista +
                '}';
    }
}
