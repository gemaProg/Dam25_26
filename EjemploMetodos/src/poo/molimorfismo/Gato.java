package poo.molimorfismo;

import java.util.Random;

public class Gato extends Animal {
    private boolean arenero;

    public Gato(boolean sexo, Fecha nacimiento, String nombre, boolean arenero) {
        super(sexo, nacimiento, nombre);
        this.arenero = arenero;
    }

    public Gato() {
        super();
        Random rand = new Random();
        arenero = rand.nextBoolean();
    }

    @Override
    public String hazRuido() {
        return "miau";
    }

    @Override
    public String toString() {
        return super.toString().substring(0,super.toString().length()-1)+ (arenero?" Necesita arenero":" No lo necesita")+ '}';
    }
}