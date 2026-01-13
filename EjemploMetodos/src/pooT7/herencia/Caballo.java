package pooT7.herencia;

import java.util.Random;

public class Caballo extends Animal{
   private boolean competidor;

    public Caballo() {
        Random rand = new Random();
        competidor = rand.nextBoolean();
    }

    @Override
    public String hazRuido() {
        return "relincho";
    }

    public Caballo(boolean esCompetidor, boolean sexo, Fecha nacimiento, String nombre) {
        //super(sexo,nacimiento,nombre);
        super(sexo,nacimiento,nombre);
        this.competidor = esCompetidor;
    }

    public boolean isCompetidor() {
        return competidor;
    }

    public String toString(){
       return super.toString().substring(0,super.toString().length()-1)+ (competidor?" esCompetidor":" noEsCompetidor")+ '}';
    }


}