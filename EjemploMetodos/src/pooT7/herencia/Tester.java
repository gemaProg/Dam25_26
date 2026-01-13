package pooT7.herencia;

import java.util.Random;

public class Tester {
    static void main() {
        Caballo caballoJavier= new Caballo(false,true,new Fecha(15,3,2010), "Acero");
        /*Caballo nisu = new Caballo();
        System.out.println(caballoJavier);
        System.out.println(nisu);
        Gato gatoMiguel = new Gato(true,new Fecha(21,9,2012), "Shoe", true );
        Perro perroLucas = new Perro(true, new Fecha(1,3,2023), "Leo", 5);
        System.out.println(perroLucas);
        System.out.println(gatoMiguel);*/
        GestorAnimales gestorAnimales = new GestorAnimales(12);
        gestorAnimales.listarAnimales();
        System.out.println("---------------------------------------");
        gestorAnimales.listarCaballos();
        System.out.println(gestorAnimales.eliminarAnimal(2010)?"Se ha eliminado correctamente":"No había animales que cumplieran la condición");;
        System.out.println("---------------------------------------");
        gestorAnimales.listarAnimales();
    }
}
