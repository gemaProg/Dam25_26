package poo.herencia;

import java.util.Arrays;
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

    public Animal[] ordenar(){
        Animal copia[] = new Animal[cuantosAnimales()];
        for (int i = 0,j=0; i < animales.length; i++) {
            if (animales[i]!=null){
                copia[j] = animales[i];
                j++;
            }
        }
        System.out.println(copia.length);

        Arrays.sort(copia);
        return copia;
    }

    private int cuantosAnimales() {
        int contador=0;
        for (int i = 0; i < animales.length; i++) {
            if (animales[i]!=null)
                contador++;
        }
        System.out.println(contador);
        return contador;
    }


}

