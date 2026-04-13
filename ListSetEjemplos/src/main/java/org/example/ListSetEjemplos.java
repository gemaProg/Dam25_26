/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.example;

import java.util.*;

/**
 *
 * @author gema
 */
public class ListSetEjemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
/*
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

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
        Collections.sort(lista,new porLongitud());
        lista.sort(new porLongitud());
        System.out.println(lista);
        Collections.sort(lista,new porLongitudAlfabeticoReves());
        System.out.println(lista);
*/
        System.out.println("----------------TreeSet------------------------------------");
        SortedSet<String> conjunto = new TreeSet();
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

/*
        Iterator<String> it = conjunto.iterator();
        while(it.hasNext()){
            //String aux = it.next();
            //System.out.println(aux.toUpperCase());
            System.out.println(it.next());
        }

        for (String x : conjunto) {
            System.out.println(x.toUpperCase());
        }
*/

        ArrayList<String> listaTree = new ArrayList<>(conjunto);

        for (int i = 0; i < listaTree.size(); i++) {
            System.out.println(listaTree.get(i));
        }
        System.out.println(conjunto.size());
/*

        System.out.println("----------------------------HashSet----------------------------------");
        HashSet<String> conjunto = new HashSet();
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
        Iterator<String> itH = conjunto.iterator();
        while(itH.hasNext()){
            System.out.println(itH.next());
        }
        System.out.println(conjunto.size());

        TreeSet<Palabra> ts = new TreeSet(); //compareTo
        ts.add(new Palabra(1,4,"comida","arroz"));
        ts.add(new Palabra(2,4,"comida","patatas"));
        System.out.println(ts.add(new Palabra(3,2,"comida","arroz")));
        ts.add(new Palabra(4,3,"comida","pollo"));
        ts.add(new Palabra(5,1,"comida","pizza"));
        System.out.println(ts); //toString de Object
        ArrayList<Palabra> al = new ArrayList(ts);
        Collections.sort(al, new porNivel());
        System.out.println(al);

        TreeSet<Palabra> ts1 = new TreeSet(new porCategoria()); // compare (comparator)
        ts1.add(new Palabra(1,1,"comida","arroz"));
        ts1.add(new Palabra(2,2,"comida","patatas"));
        System.out.println(ts1.add(new Palabra(3,1,"chino","arroz")));
        ts1.add(new Palabra(4,3,"Kfc","pollo"));
        ts1.add(new Palabra(5,3,"comidaBasura","pizza"));
        System.out.println(ts1); //toString de Object

        HashSet<Palabra> hs = new HashSet(); //equals
        hs.add(new Palabra(1,1,"comida","arroz"));
        hs.add(new Palabra(2,1,"comida","patatas"));
        hs.add(new Palabra(2,1,"comida","hamburguesa"));
        hs.add(new Palabra(2,1,"comida","pollo"));
        hs.add(new Palabra(1,1,"comida","arroz"));
        System.out.println(hs.size());
*/
    }

}
