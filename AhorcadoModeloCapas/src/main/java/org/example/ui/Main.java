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
        EntradaSalida es = new EntradaSalida(ge);
        EntradaSalida.mostrarListaElementos(ge);
        System.out.println("Otra forma");
        es.mostrarListaElementos();

        ge.insertarElemento(EntradaSalida.insertarElemento());

    }
}