package org.example.dao;

import org.example.domain.Elemento;

import java.util.ArrayList;
import java.util.List;

public class DaoElementosImplementacion implements DaoElementos{
    private Database database;
    @Override
    public boolean isEmptyElementosList() {
        return false;
    }

    @Override
    public boolean insertarElemento(Elemento Elemento) {
        /*List<Elemento> listaElementos = database.getElementos();
        boolean respuesta = listaElementos.add(Elemento);
        return respuesta;*/
        return database.getElementos().add(Elemento);
    }

    @Override
    public boolean insertarElemento(int id, String palabra, String categoria) {
        return false;
    }

    @Override
    public List<Elemento> getElementos() {
        return List.of();
    }

    @Override
    public List<Elemento> getElementosCategoria(String categoria) {
        return List.of();
    }

    @Override
    public List<Elemento> listadoOrdenado(boolean ascendente) {
        return List.of();
    }

    @Override
    public boolean modificarCategoria(int id, String categoria) {
        return false;
    }

    @Override
    public boolean modificarElemento(String id, String palabra) {
        return database.modificar(id,palabra);
    }

    @Override
    public void eliminarElemento(Elemento Elemento) {

    }

    @Override
    public boolean eliminarElemento(int id) {
        return false;
    }

    @Override
    public String getPalabraAdivinar(String categoria) {
        return "";
    }
}
