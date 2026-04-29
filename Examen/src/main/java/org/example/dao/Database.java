package org.example.dao;

import org.example.domain.Elemento;

import java.util.ArrayList;
import java.util.List;

public class Database {
    private List<Elemento> elementos;

    public Database(List<Elemento> elementos) {
        this.elementos = elementos;
    }

    public Database() {
        //si existe el fichero directamente elementos = leerFichero, sino ejecutar código similar al de abajo, es decir generándolos aleatoriamente
        this.elementos = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            elementos.add(new Elemento());
        }
    }

    public List<Elemento> getElementos() {
        return elementos;
    }
    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }



    @Override
    public String toString() {
        return "Database{" +
                "elementos=" + elementos +
                '}';
    }

    public boolean modificar(String id, String palabra) {
        boolean resultado = false;
        for (int i = 0; i < elementos.size() && !resultado; i++) {
            if (elementos.get(i).getId().equals(id)) {
                elementos.get(i).setPalabra(palabra);
                resultado = true;
            }
        }
        return resultado;
    }
}
