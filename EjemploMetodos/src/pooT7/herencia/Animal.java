package pooT7.herencia;

import pooT7.inicio.Fecha;

public class Animal {
    private boolean sexo; //true femenino false masculino
    private Fecha nacimiento;
    private String nombre;

    public Animal(boolean sexo, Fecha nacimiento, String nombre) {
        this.sexo = sexo;
        this.nacimiento = nacimiento;
        this.nombre = nombre;
    }

    public Animal() {

    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "sexo=" + sexo +
                ", nacimiento=" + nacimiento +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}