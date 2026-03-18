package org.example;

import net.datafaker.Faker;

import java.util.Random;

public class PersonaMiguel {
    private String nombre;
    private String dni;

    public PersonaMiguel() {
        Faker faker=new Faker();
        Random random = new Random();
        nombre = faker.ruPaulDragRace().queen();
        dni = String.valueOf(random.nextLong(00000000, 99999999));
    }

    public PersonaMiguel(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Nombre= " + nombre +
                ", DNI= " + dni;
    }
}
