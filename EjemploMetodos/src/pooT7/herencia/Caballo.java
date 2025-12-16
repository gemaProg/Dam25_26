package pooT7.herencia;

import pooT7.inicio.Fecha;

public class Caballo extends Animal{
   private boolean esCompetidor;

    public Caballo() {

    }
    public Caballo(boolean esCompetidor, boolean sexo, Fecha nacimiento, String nombre) {
        //super(sexo,nacimiento,nombre);
        super(sexo,nacimiento,nombre);
        this.esCompetidor = esCompetidor;
    }

}