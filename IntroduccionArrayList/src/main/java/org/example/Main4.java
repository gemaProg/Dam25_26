package org.example;
//23/3
public class Main4 {
    static void main() {
        Database db = new Database();
        db.listar();
        db.ordenar(false);
        System.out.println("-----------------------------------");
        db.listar();
        System.out.println("------------------PERSONA ELIMINADA-----------------");
        System.out.println(db.eliminar(0));
        System.out.println("--------------------TRAS ELIMINAR EL PRIMER ELEMENTO----------------");
        db.listar();

    }
}
