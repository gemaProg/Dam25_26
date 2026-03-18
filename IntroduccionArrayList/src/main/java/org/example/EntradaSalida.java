package org.example;

import java.util.Scanner;

public class EntradaSalida {
    public static Persona damePersona() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce nombre y nif");
        String nombre = sc.nextLine();
        String nif = sc.nextLine();
        return new Persona(nombre, nif);
    }

    public static int dameEdad() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una edad que esté entre el 18 y 30:  ");
        return sc.nextInt();
    }

    public static String leernifLuna() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nif de la persona sobre la que quiere modificar algun dato");
        return scanner.nextLine();
    }

    public static String menuModificarLuna() {
        Scanner scanner = new Scanner(System.in);
        StringBuilder respuesta = new StringBuilder();
        int opcion;
        do {
            System.out.println("""
                    Elija qué quiere modificar:
                    1. Nombre
                    2. DNI
                    3. Edad
                    4. Salir""");
            opcion = scanner.nextInt();
            scanner.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca el nuevo nombre");
                    respuesta.append("1;").append(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Introduzca el nuevo DNI");
                    respuesta.append("2;").append(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Introduzca la nueva edad");
                    respuesta.append("3;").append(scanner.nextLine());
                default:
                    System.out.println("Introduzca una opción válida");
            }
        } while (opcion != 4);
        return respuesta.toString();
    }
}
