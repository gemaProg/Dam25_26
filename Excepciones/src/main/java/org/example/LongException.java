package org.example;

public class LongException extends Exception {

    public LongException(){
       super("Longitud incorrecta. Solo se pueden registrar playas entre 1000 y 2000 metros");
    }

    public LongException(String message) {
        super(message);
    }
}
