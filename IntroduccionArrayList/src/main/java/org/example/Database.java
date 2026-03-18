package org.example;

import java.util.ArrayList;
//deberes
//1. Usar DataFaker para los nombres
//2. Crear consultas
//3. Borrar
//4. Modificar
//5. Listar devuelve un String con el contenido del ArrayList formateado para que desde otra clase se imprima
// o directamente hacer el examen de la 2ev de gestión con ArrayList
public class Database {
    private ArrayList<Persona> personas;

    public Database(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public Database() {
        this(20);
    }

    public Database(int cuantos) {
        personas = new ArrayList<Persona>();
        for (int i = 0; i < cuantos ; i++) {
            personas.add(new Persona());
        }
    }
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }

    public void listar(){
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }

    public boolean addPersona(Persona persona){
        return personas.add(persona);
    }



    @Override
    public String toString() {
        return "Database{" +
                "personas=" + personas +
                '}';
    }
}
