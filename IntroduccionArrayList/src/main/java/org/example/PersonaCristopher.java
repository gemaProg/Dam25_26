package org.example;
import java.util.Random;

public class PersonaCristopher{
    private String nombre;
    private String nif;
    private int edad;


    public PersonaCristopher(String nombre, String nif, int edad) {
        Random random = new Random();
        this.nombre = nombre;
        this.nif = nif;
        this.edad = edad;
    }

    public PersonaCristopher() {
        Random rand = new Random();
        nombre = Constantes.NOMBRES[rand.nextInt(Constantes.NOMBRES.length)];
        nif = String.valueOf(rand.nextLong(10000000,99999999))+(char)(rand.nextInt(65,90));
        edad = rand.nextInt(18,30);
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
                ", edad=" + edad +
                '}';
    }
}
