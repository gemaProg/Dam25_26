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
public abstract class Figura {
    protected double dato;
    
    public Figura (){
        this(25); 
    }
    public Figura(double dato) {
        this.dato = dato;
    }

    public double getDato() {
        return dato;
    }

    public void setDato(double dato) {
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Figura{" + "dato=" + dato + '}';
    }
  protected abstract double area(); 

  protected abstract double perimetro();
   
}
