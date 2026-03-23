package org.example;

import net.datafaker.Faker;

import java.util.Random;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private String nif;
    private int edad;


    public Persona(String nombre, String nif) {
        this.nombre = nombre;
        this.nif = nif;
    }

    public Persona() {
        Random rand = new Random();
        Faker faker = new Faker();
        nombre=faker.detectiveConan().characters();
        nif = String.valueOf(rand.nextLong(10000000,99999999))+(char)(rand.nextInt(65,90));
        edad = rand.nextInt(16,32);
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", nif='" + nif + '\'' +
                '}';
    }

    @Override
    public int compareTo(Persona o) {
        //return o.getNif().compareTo(this.getNif());
        return this.getNombre().compareTo(o.getNombre());
    }
}
