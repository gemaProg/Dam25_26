public class OperacionesPrimitivos {
    /**
     * Operaciones:
     * Suma
     * Resta
     * Multiplicación
     * División
     */
    //Son métodos estáticos porque son métodos a nivel de clase. Aunque creara diferentes objetos de tipo OperacionesPrimitivos sus métodos serían iguales
    public static int suma (int a, int b){
        /*int suma = a + b;
        return suma;*/
        return a+b;
    }
    public static int resta (int a, int b){
        return a-b;
    }
    public static int multiplicacion (int a, int b){
        return a*b;
    }
    public static int division (int a, int b){
            return a/b;
    }


}
