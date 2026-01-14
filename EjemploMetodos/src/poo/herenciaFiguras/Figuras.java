/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.herenciaFiguras;

/**
 *
 * @author gema
 */
public class Figuras {
    protected Figura [] listaFiguras;

    public Figuras(Figura[] listaFiguras) {
        this.listaFiguras = listaFiguras;
    }

    public Figuras() {
        listaFiguras = new Figura[5];
        for (int i = 0; i < listaFiguras.length; i++) {
            if (i%2==0)
                listaFiguras[i]= new Circulo();
            else{
                int dado = (int)(Math.random()*2);
                if (dado==0)
                    listaFiguras[i]= new Cuadrado();
                else
                    listaFiguras[i]= new Triangulo();
            }
        }
     }

    public void mostrarInfo() {
        for (int i = 0; i < listaFiguras.length; i++) {
            if (listaFiguras[i]!=null)
                System.out.println(listaFiguras[i]);
        }
    }
    
    
    
    
    
}
