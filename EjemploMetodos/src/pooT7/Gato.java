package pooT7;

import java.util.Random;

public class Gato {
    private boolean sexo; //true femenino false masculino
    private String color; //manipularía como un StringBuilder
    private String raza;
    private String tamanyo; //Gordo o "canijo"
    private Fecha nacimiento;
    private String nombre;
    private float peso;
    public static String TIPO = "cachorro";
    //private String []Hermanos;

    //Tareas
    //1. Crear constructor por defecto(), inicializando todos los atributos random
    //2. Crear constructor personalizado al máximo, reciba tantos argumentos de entrada como atributos no estáticos tenga
    //3. Todos los getter y setter
    public Gato(String nombre) {
        this.nombre = nombre;
    }

    public Gato(){
        Random random = new Random();
        int posicion = random.nextInt(Constantes.NOMBRES.length);
        nombre = Constantes.NOMBRES[posicion];
       //nombre = Constantes.NOMBRES[ random.nextInt(Constantes.NOMBRES.length);
        nacimiento =  new Fecha(random.nextInt(31),2,1900); //esto genera fecha nacimiento aletoria
    }
}
