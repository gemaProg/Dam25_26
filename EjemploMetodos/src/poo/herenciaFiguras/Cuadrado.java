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
public class Cuadrado extends Figura{
   
    public Cuadrado() {
        super(9);
    }

    public Cuadrado(double lado) {
        super(lado);
    }

    @Override
    public String toString() {
        return "Cuadrado{" + dato+'}';
    }

    

    public double area(){
         return dato*dato;
    }
    public double perimetro(){
         return 4*dato;
        
    }
}
