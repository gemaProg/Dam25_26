package org.example;

import java.util.Scanner;

public class EntradaSalida {
    public static Persona damePersona(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre y nif");
        String nombre = sc.nextLine();
        String nif = sc.nextLine();
        return new Persona(nombre,nif);
    }
}
