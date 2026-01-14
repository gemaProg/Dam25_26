package poo.molimorfismo;

import java.util.Random;

public class Perro extends Animal {
    private int numPaseos;

    public Perro(boolean sexo, Fecha nacimiento, String nombre, int numPaseos) {
        super(sexo, nacimiento, nombre);
        this.numPaseos = numPaseos;
    }

    public Perro() {
        Random rand = new Random();
        numPaseos = rand.nextInt(7);
    }

    public int getNumPaseos() {
        return numPaseos;
    }

    public void setNumPaseos(int numPaseos) {
        this.numPaseos = numPaseos;
    }

    @Override
    public String hazRuido() {
        return "guau";
    }

    @Override
    public String toString() {
        //return super.toString().substring(0,super.toString().length()-1)+ " numero de paseos "+ numPaseos+'}';
        return super.toString()+"paseos: "+ numPaseos;

    }
}