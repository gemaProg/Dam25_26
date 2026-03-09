package org.example;

public class Comprobaciones {
    /**
     * comprueba el valor de la bandera y si no es amarilla, verde o roja lanza una excepción
     *
     * @param flag bandera cuyo valor se ha de evaluar
     * @throws FlagException se lanza cuando la bandera no es la adecuada
     */
    public static void flagOk(String flag) throws FlagException {
        if (!(flag.equalsIgnoreCase("amarilla") || flag.equalsIgnoreCase("verde") || flag.equalsIgnoreCase("roja"))) {
            throw new FlagException();
            //throw new FlagException("La bandera no puede ser "+ flag+ ", tiene que ser amarilla, verde o roja");
        }
    }


    public static void longOk(int longitud) throws LongException {

        if (longitud < 1000 || longitud > 2000) {
            throw new LongException(longitud > 2000 ? "debería ser más baja" : "debería ser más alta");
        }
    }



}
