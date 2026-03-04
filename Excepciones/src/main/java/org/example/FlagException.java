package org.example;

public class FlagException extends Exception{
    public FlagException() {
        super("La bandera debe ser de color verde, amarilla o roja");
    }

    public FlagException(String message) {
        super(message);
    }
}
