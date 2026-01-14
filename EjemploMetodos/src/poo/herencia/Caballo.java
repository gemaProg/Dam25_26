package poo.herencia;

import java.util.Random;

public class Caballo extends Animal {
   private boolean competidor;

    public Caballo() {
        Random rand = new Random();
        competidor = rand.nextBoolean();
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
       //return super.toString().substring(0,super.toString().length()-1)+ (competidor?" esCompetidor":" noEsCompetidor")+ '}';
        String info="es competidor";
        if (!competidor)
            info= "no es competidor";
        return super.toString()+info;
        //return super.toString()+ (competidor?" es Competidor":" no Es Competidor");
    }


}