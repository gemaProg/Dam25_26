package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//deberes
//1. Usar DataFaker para los nombres
//2. Crear consultas
//3. Borrar
//4. Modificar
//5. Listar devuelve un String con el contenido del ArrayList formateado para que desde otra clase se imprima
// o directamente hacer el examen de la 2ev de gestión con ArrayList
public class DatabaseCristopher {
    private ArrayList<PersonaCristopher> personas;

    public DatabaseCristopher(ArrayList<PersonaCristopher> personas) {
        this.personas = personas;
    }

    public DatabaseCristopher() {
        this(20);
    }

    public DatabaseCristopher(int cuantos) {
        personas = new ArrayList<PersonaCristopher>();
        for (int i = 0; i < cuantos ; i++) {
            personas.add(new PersonaCristopher());
        }
    }
    public ArrayList<PersonaCristopher> getPersonas() {
        return personas;
    }

    public void setPersonas(ArrayList<PersonaCristopher> personas) {
        this.personas = personas;
    }


    public void crearConsultas(){

    }

    public void filtrarXedad(int edad){
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getEdad()==edad){
                System.out.println(personas.get(i));
            }
        }
    }


    public boolean addPersona(PersonaCristopher persona){ return personas.add(persona);}
    public void listar(){
        for (int i = 0; i < personas.size(); i++) {
            System.out.println(personas.get(i));
        }
    }

    @Override
    public String toString() {
        return "Database{" +
                "personas=" + personas +
                '}';
    }
}
