package org.example;
//18/3
public class Main3 {
    static void main() {
        Database db = new Database();
        db.listar();
        System.out.println("---------------------------------");
        System.out.println(db.addPersona(EntradaSalida.damePersona()));
        db.listar();

    }
}
