package org.example;

import java.util.Scanner;

//24_3
public class Main5 {
    static void main() {
        Database db = new Database();
        db.listar();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 1. ordenar por nif ascendente \n2.ordenar por nombre descendente");
        int orden = sc.nextInt();
        if (orden == 1)
            db.ordenar(true);
        else
            db.ordenarNombre(false);
        db.listar();
    }
}
