package org.example;

import net.datafaker.Faker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main5 {
    static void main() {
        List<String> personajes = new ArrayList<>();
        Faker faker = new Faker();
        for (int i = 0; i < 20; i++) {
            personajes.add(faker.simpsons().character());
        }
        GestionFicheros.escribirFicheroPWArrayList("Simpsons",personajes );
        List<String> personajesFichero = GestionFicheros.leerFicheroArrayList("Simpsons");
        for (int i = 0; i < personajesFichero.size(); i++) {
            System.out.println(personajesFichero.get(i));
        }
        //lo volveré a explicar
        Set<String> personajesFicheroSet = GestionFicheros.leerFicheroTreeSet("Simpsons");
        System.out.println(personajesFichero);

        Iterator<String> iterator = personajesFichero.iterator();
        while(iterator.hasNext()) {
            String personajeFichero = iterator.next();
            System.out.println(personajeFichero);
        }
        for (String personajeFichero : personajesFichero) {
            System.out.println(personajeFichero);
        }


    }
}
