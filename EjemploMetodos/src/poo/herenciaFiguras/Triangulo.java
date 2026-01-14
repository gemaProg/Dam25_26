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
public class Triangulo extends Figura {
    
    public Triangulo() {
       super(7); 
    }

    public Triangulo(double lado) {
       super(lado);
    }

    

    @Override
    public String toString() {
        return super.toString()+ " triangulo";
    }

    @Override
    protected double area() {
        double sm = perimetro() / 2;
        double area = (double) Math.sqrt(sm * Math.pow((sm - dato),3));
        return area;
    }

    @Override
    protected double perimetro() {
        return dato * 3;

    }
}
