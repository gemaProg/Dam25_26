package pooT7.herencia;

import java.util.Random;

public class Caballo extends Animal{
   private boolean esCompetidor;

    public Caballo() {
        Random rand = new Random();
        esCompetidor = rand.nextBoolean();
    }
    public Caballo(boolean esCompetidor, boolean sexo, Fecha nacimiento, String nombre) {
        //super(sexo,nacimiento,nombre);
        super(sexo,nacimiento,nombre);
        this.esCompetidor = esCompetidor;
    }

    public String toString(){
       return super.toString().substring(0,super.toString().length()-1)+ (esCompetidor?" esCompetidor":" noEsCompetidor")+ '}';
    }


}