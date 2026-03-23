package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//deberes
//1. Usar DataFaker para los nombres
//2. Crear consultas
//3. Borrar
//4. Modificar
//5. Listar devuelve un String con el contenido del ArrayList formateado para que desde otra clase se imprima
// o directamente hacer el examen de la 2ev de gestión con ArrayList


//6. Ordenar pero que no ordene el atributo en RAM sino que devuelva una copia ordenada.
//7. Eliminar con recorrido del ArrayList y buscando el elemento a eliminar

public class Database {
    private List<Persona> personas;

    public Database(List<Persona> personas) {
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
    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
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

    public void modificarLuna(String nif, String modificacion){
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getNif().equals(nif)){
                String trozos[] = modificacion.split(";");
                switch (trozos[0]){
                    case "1":
                        personas.get(i).setNombre(trozos[1]);
                        break;
                    case "2":
                        personas.get(i).setNif(trozos[1]);
                        break;
                    case "3":
                        personas.get(i).setEdad(Integer.parseInt(trozos[1]));
                        break;
                }
                System.out.println(personas.get(i));
            }
        }
    }

    public void ordenar(boolean ascendente){
        Collections.sort(personas);
        if (!ascendente)
            Collections.reverse(personas);

    }
    public List<Integer> crearListasDeOtras(){
        List <Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        //List <Integer> lista2 = new ArrayList<Integer>(lista);
        List <Integer> lista2 = new ArrayList<Integer>();
        lista2.addAll(lista);
        return lista2;
    }


    public Persona eliminar(int indice){
        return personas.remove(indice);
    }

    public boolean eliminar(Persona eliminar){
        return personas.remove(eliminar);
    }
    @Override
    public String toString() {
        return "Database{" +
                "personas=" + personas +
                '}';
    }
}
