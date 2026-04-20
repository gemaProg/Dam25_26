/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example;

import java.util.*;

/**
 * 14/4
 * @author gema
 */
public class ListSetEjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> lista = new ArrayList();
        lista.add("Nerea");
        lista.add("Kiarash");
        lista.add("Miguel");
        lista.add("Cristopher Orellana");
        lista.add("Marco");
        lista.add("Alejandra");
        lista.add("Álvaro");
        lista.add("Álvaro");
        lista.add("Álvaro");
        lista.add("Álvaro");
        lista.add("Álvaro");
        lista.add("Álvaro");
        lista.add("Álvaro");
        lista.add("Deyvid");
        lista.add("Rodrigo");
        lista.add("Esaú");
        lista.add("Gorka");
        lista.add("Sophia");
        lista.add("Alejandro");


        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(new porLongitud());
        lista.sort(new porLongitud());
        System.out.println(lista);
        lista.sort(new porLongitudAlfabeticoReves());
        System.out.println(lista);

        System.out.println("----------------TreeSet------------------------------------");
        SortedSet<String> conjunto = new TreeSet<>();
        conjunto.add("Nerea");
        conjunto.add("Kiarash");
        conjunto.add("Miguel");
        conjunto.add("Cristopher Orellana");
        conjunto.add("Marco");
        conjunto.add("Alejandra");
        conjunto.add("Álvaro");
        conjunto.add("Álvaro");
        conjunto.add("Álvaro");
        conjunto.add("Álvaro");
        conjunto.add("Álvaro");
        conjunto.add("Álvaro");
        conjunto.add("Álvaro");
        conjunto.add("Deyvid");
        conjunto.add("Rodrigo");
        conjunto.add("Esaú");


        Iterator<String> it = conjunto.iterator();
        System.out.println("-------------------------------ITERATOR------------------------");
       // boolean salir = false;
        while(it.hasNext() /*&& !salir*/){
           String aux = it.next();
          // if (aux.equalsIgnoreCase("Nerea"))
          //      salir=true;

           System.out.println(aux);
           System.out.println(aux.toUpperCase());
            /*System.out.println(it.next());
            System.out.println(it.next().toUpperCase());*/
       }
        System.out.println("-------------------------------FOR EACH------------------------");
        for (String elemento : conjunto) {
            System.out.println(elemento);
            System.out.println(elemento.toUpperCase());
        }


        ArrayList<String> listaTree = new ArrayList<>(conjunto);

        for (int i = 0; i < listaTree.size(); i++) {
            System.out.println(listaTree.get(i));
        }
        System.out.println(conjunto.size());


        System.out.println("----------------------------HashSet----------------------------------");
        Set<String> conjunto2 = new HashSet<>();
        conjunto2.add("Nerea");
        conjunto2.add("Kiarash");
        conjunto2.add("Miguel");
        conjunto2.add("Cristopher Orellana");
        conjunto2.add("Marco");
        conjunto2.add("Alejandra");
        conjunto2.add("Álvaro");
        conjunto2.add("Álvaro");
        conjunto2.add("Álvaro");
        conjunto2.add("Álvaro");
        conjunto2.add("Álvaro");
        conjunto2.add("Álvaro");
        conjunto2.add("Álvaro");
        conjunto2.add("Deyvid");
        conjunto2.add("Rodrigo");
        conjunto2.add("Esaú");
        Iterator<String> itH = conjunto2.iterator();
        while(itH.hasNext()){
            System.out.println(itH.next());
        }
        System.out.println(conjunto2.size());



        TreeSet<Palabra> ts = new TreeSet<>(); //compareTo
        ts.add(new Palabra(1,4,"comida","arroz"));
        ts.add(new Palabra(2,4,"comida","patatas"));
        System.out.println(ts.add(new Palabra(3,2,"comida","arroz")));
        ts.add(new Palabra(4,3,"comida","pollo"));
        ts.add(new Palabra(5,1,"comida","pizza"));
        System.out.println(ts); //toString de Object
        ArrayList<Palabra> al = new ArrayList<>(ts);
        al.sort(new porNivel());
        System.out.println(al);

        TreeSet<Palabra> ts1 = new TreeSet<>(new porCategoria()); // compare (comparator)
        ts1.add(new Palabra(1,1,"comida","arroz"));
        ts1.add(new Palabra(2,2,"comida","patatas"));
        System.out.println(ts1.add(new Palabra(3,1,"chino","arroz")));
        ts1.add(new Palabra(4,3,"Kfc","pollo"));
        ts1.add(new Palabra(5,3,"comidaBasura","pizza"));
        System.out.println(ts1); //toString de Object


        HashSet<Palabra> hs = new HashSet<>(); //equals
        hs.add(new Palabra(1,1,"comida","arroz"));
        hs.add(new Palabra(2,1,"comida","patatas"));
        hs.add(new Palabra(2,1,"comida","hamburguesa"));
        hs.add(new Palabra(2,1,"comida","pollo"));
        hs.add(new Palabra(1,1,"comida","arroz"));
        System.out.println(hs.size());
        System.out.println(hs);

    }

}
