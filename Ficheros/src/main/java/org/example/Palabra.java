package org.example;

import java.io.Serializable;

public class Palabra implements Serializable {
    private String palabraSecreta;
    private String categoria;
    private String dificultad;
    private static final long serialId = 231344543;

    public Palabra(String palabraSecreta, String categoria) {
        this.palabraSecreta = palabraSecreta;
        this.categoria = categoria;
    }

    public String getPalabraSecreta() {
        return palabraSecreta;
    }

    public void setPalabraSecreta(String palabraSecreta) {
        this.palabraSecreta = palabraSecreta;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Palabra{" +
                "palabraSecreta='" + palabraSecreta + '\'' +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
