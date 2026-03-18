package org.example;

import java.util.ArrayList;

public class DatabaseMiguel {

    private ArrayList<PersonaMiguel> personas;

    public DatabaseMiguel() {
        this(20);
    }

    public DatabaseMiguel(int n) {
        personas = new ArrayList<PersonaMiguel>();
        for (int i = 0; i < n; i++) {
            personas.add(new PersonaMiguel());
        }
    }

    public ArrayList<PersonaMiguel> getPersonas() {
        return personas;
    }


    public void setPersonas(ArrayList<PersonaMiguel> personas) {
        this.personas = personas;
    }

    public String listarArrayList() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < personas.size(); i++) {
            sb.append(i + 1+". ").append(personas.get(i)).append("\n");
        }
        return sb.toString();
    }

    public void consultarInicial(char inicial) {
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getNombre().charAt(0) == inicial) {
                System.out.println(personas.get(i));
            }
        }
    }

    public String toString() {
        return "Personas{" + personas +
                '}';
    }

    public String eliminarPersonaEspec(String s) {
        String respuesta = null;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(s)) {
                personas.remove(i);
                respuesta = "Persona eliminada con éxito";
                i--; //así o recorrerlo al revés
            }
        }
        return respuesta;
    }
    public String eliminarPersonaEspecRecorridoAlrevés(String s) {
        String respuesta = null;
        for (int i = personas.size()-1; i>=0; i--) {
            if (personas.get(i).getDni().equals(s)) {
                personas.remove(i);
                respuesta = "Persona eliminada con éxito";
            }
        }
        return respuesta;
    }

    public String modificarPersona(String dni, String nombre) {
        String respuesta = null;
        for (int i = 0; i < personas.size(); i++) {
            if (personas.get(i).getDni().equals(dni)) {
                personas.get(i).setNombre(nombre);
                respuesta = "Persona modificada con éxito";
            }
        }
        return respuesta;
    }

}
