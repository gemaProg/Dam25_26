package org.example;

import java.io.IOException;
import java.util.Scanner;

public class EntradaSalidaMiguel {

    public static void imprimir(String s) {
        System.out.println(s);
    }

    public static void imprimirLinea(String s) {
        System.out.print(s);
    }

    public static void menu(DatabaseMiguel db) {
        int opcion;
        do {
            opcion = dameOpcion();
            switch (opcion) {
                case 1:
                    db.consultarInicial(dameLetraConsulta());
                    break;
                case 2:
                    String respuesta = db.eliminarPersonaEspec(dameDni());
                    if (respuesta == null) {
                        imprimir("No existe el usuario que desea consultar");
                    } else {
                        imprimir(respuesta);
                    }
                    break;
                case 3:
                    String modif = dameNuevoNombre();
                    String respuesta2 = db.modificarPersona(dameDni(), modif);
                    if (respuesta2 == null) {
                        imprimir("No existe el usuario que desea consultar");
                    } else {
                        imprimir(respuesta2);
                    }
                    break;
                case 4:
                    String lista = db.listarArrayList();
                    imprimirLinea(lista);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
            }
        } while (opcion != 5);
    }

    private static String dameNuevoNombre() {
        Scanner sc = new Scanner(System.in);
        imprimir("Introduce el nuevo nombre de la persona");
        return sc.nextLine();
    }

    private static String dameDni() {
        Scanner sc = new Scanner(System.in);
        imprimir("Introduce el DNI de la persona que desea eliminar");
        return sc.nextLine();
    }

    private static char dameLetraConsulta() {
        Scanner sc = new Scanner(System.in);
        char letra;
        imprimir("\nIntroduce una inicial para buscar a todas las personas cuyo nombre empieza por eso");
        try {
            letra = (char) System.in.read();
            sc.nextLine();
            return letra;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static int dameOpcion() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            imprimir("\nIntroduce una opción para operar:\n1. Consultar por inicial\n2. Borrar una persona\n3. Modificar\n4. Listar base de datos\n");
            opcion = Integer.parseInt(sc.nextLine());
        } while (opcion < 1 || opcion > 4);
        return opcion;
    }
}
