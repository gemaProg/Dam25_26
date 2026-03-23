package org.example.ui;

import org.example.common.Constantes;
import org.example.service.GestionElementos;
import org.example.service.GestionElementosImplementacion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Constantes.BIENVENIDA);
        GestionElementos ge = new GestionElementosImplementacion();
        System.out.println(ge.getListaElementos());
        EntradaSalida es = new EntradaSalida(new GestionElementosImplementacion());
        //otra forma
        EntradaSalida es1 = new EntradaSalida();
        EntradaSalida.mostrarListaElementos(ge);
        System.out.println("Otra forma");
        es.mostrarListaElementos();
        es.getServicio().insertarElemento(EntradaSalida.insertarElemento());

        //En realidad lo anterior es para explicarlo y hacer pruebas, finalmente vuestro main tendrá dos líneas
        //EntradaSalida es = new EntradaSalida(new GestionElementosImplementacion());


    }
}