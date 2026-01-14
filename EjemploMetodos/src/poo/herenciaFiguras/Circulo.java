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
public class Circulo extends Figura{
   
    public Circulo() {
        super(3);
    }

    public Circulo(double radio) {
        dato = radio;
    }

   
    @Override
    public String toString() {
        return "Circulo{" + "radio=" + dato + '}';
    }
    public double area(){
        
        
        double a = Math.PI * Math.pow(dato,2);
        
        return a;
    }
    @Override
    public double perimetro(){
        
        double p = 2*Math.PI*dato;
        
        return p;
        
    }
}
