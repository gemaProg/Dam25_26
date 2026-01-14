package poo.molimorfismo;

import java.util.Random;

public class GestorAnimales {
    private Animal[] animales;

    public GestorAnimales(int tamanyo) {
        animales = new Animal[tamanyo];
        //int [] lista = new int[tamanyo];
        for (int i = 0; i < animales.length / 2; i++) {
            Random random = new Random();
            int numero = random.nextInt(3);
            if (numero == 0)
                animales[i] = new Gato();
            else if (numero == 1)
                animales[i] = new Caballo();
            else
                animales[i] = new Perro();
        }
    }
    public GestorAnimales() {
        this(18);
        /*animales = new Animal[18];
        for (int i = 0; i < animales.length / 2; i++) {
            Random random = new Random();
            int numero = random.nextInt(3);
            if (numero == 0)
                animales[i] = new Gato();
            else if (numero == 1)
                animales[i] = new Caballo();
            else
                animales[i] = new Perro();
        }*/
    }

    public GestorAnimales(Animal[] animales) {
        this.animales = animales;
    }

    public Animal[] getAnimales() {
        return animales;
    }

    public void listarAnimales() {
        for (int i = 0; i < animales.length; i++) {
            if (animales[i] != null)
                System.out.println(animales[i]);
        }
    }

    public void listarCaballos() {
        for (int i = 0; i < animales.length; i++) {
            if(animales[i] !=null && animales[i] instanceof Caballo)
            //if (animales[i] != null && animales[i].getClass().getSimpleName().equals("Caballo"))
                System.out.println(animales[i]);
        }
    }
    public boolean eliminarAnimal(int anyo) {
        boolean eliminado = false;
        for (int i = 0; i < animales.length; i++) {
            if (animales[i]!=null && animales[i].getNacimiento().getAnio() <= anyo) {
                animales[i] = null;//Has muerto...
                eliminado = true;
            }
        }
        return eliminado;
    }
    public int cunantosAnimalesPreviosAnyo(int anyo) {
        int contador =0;
        for (int i = 0; i < animales.length; i++) {
            if (animales[i]!=null && animales[i].getNacimiento().getAnio() <= anyo) {
                contador++;
                System.out.println(animales[i]);
            }
        }
        return contador;
    }

    public void hacerRuido(){
        for (int i = 0; i < animales.length; i++) {
            if (animales[i] != null)
                System.out.println(animales[i].hazRuido());
        }
    }

    public boolean modificarPaseosPerro(String nombre, int paseosNuevos){
        boolean modificado = false;
        for (int i = 0; i < animales.length && !modificado; i++) {
            if (animales[i]!=null && animales[i].getNombre().equalsIgnoreCase(nombre) && animales[i] instanceof Perro) {
               ((Perro)animales[i]).setNumPaseos(paseosNuevos);
               /* Perro aux = (Perro) animales[i];
                aux.setNumPaseos(paseosNuevos);*/
                modificado = true;
            }
        }
        return modificado;
    }
}

