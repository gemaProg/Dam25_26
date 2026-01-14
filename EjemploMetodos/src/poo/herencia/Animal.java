package poo.herencia;

import java.util.Random;

public class Animal {
    protected boolean sexo; //true femenino false masculino
    protected Fecha nacimiento;
    protected String nombre;

    public Animal(boolean sexo, Fecha nacimiento, String nombre) {
        this.sexo = sexo;
        this.nacimiento = nacimiento;
        this.nombre = nombre;
    }

    public Animal() {
        Random rand = new Random();
        sexo = rand.nextBoolean();
        nacimiento = new Fecha();
        nombre = Constantes.NOMBRES[rand.nextInt(Constantes.NOMBRES.length)];
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
        return this.getClass().getSimpleName() + '{'+
                "sexo=" + sexo +
                ", nacimiento=" + nacimiento +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}