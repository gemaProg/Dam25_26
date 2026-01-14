package poo.molimorfismo;

import java.util.Scanner;

public class Tester {
    static void main() {
        /*Caballo caballoJavier= new Caballo(false,true,new Fecha(15,3,2010), "Acero");
        Caballo nisu = new Caballo();
        System.out.println(caballoJavier);
        System.out.println(nisu);
        Gato gatoMiguel = new Gato(true,new Fecha(21,9,2012), "Shoe", true );
        Perro perroLucas = new Perro(true, new Fecha(1,3,2023), "Leo", 5);
        System.out.println(perroLucas);
        System.out.println(gatoMiguel);*/
        Scanner sc = new Scanner(System.in);

        GestorAnimales gestorAnimales = new GestorAnimales();
        gestorAnimales.listarAnimales();

        System.out.println("---------------------------------------");
        gestorAnimales.listarCaballos();
        gestorAnimales.hacerRuido();
        System.out.println("Introduce nombre del perro cuyos paseos quieras modificar");
        String nombre = sc.nextLine();
        System.out.println("Introduce número de paseos nuevos");
        int paseos  = sc.nextInt();
        if (gestorAnimales.modificarPaseosPerro(nombre, paseos))
            System.out.println("Paseos modificdos con éxito");
        else
            System.out.println("No existe ese perro");

        System.out.println(gestorAnimales.eliminarAnimal(2010)?"Se ha eliminado correctamente":"No había animales que cumplieran la condición");;
        System.out.println("---------------------------------------");
        gestorAnimales.listarAnimales();
    }
}
