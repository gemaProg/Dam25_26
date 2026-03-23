package org.example;

import java.util.Comparator;

public class CriteriosComparacion {
}
class porNombre implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}

class porEdad implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        //return o1.getEdad() - o2.getEdad();
        return Integer.compare(o1.getEdad(), o2.getEdad());
        //Devuelve 0 si son iguales, si son diferentes devuelve la diferencia
    }
}