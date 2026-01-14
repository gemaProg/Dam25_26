package poo.inicio;

import java.util.Random;

/**
 * Tarea menú con array de objetos con opciones CRUD:
 * Create (alta, manual o random)
 * Read (listar, consulta filtrada)
 * Update (cambiar atributo)
 * Delete (buscar al que eliminar y ponerlo a null)
 */
public class GatoMiguel {
    private boolean sexo; //true femenino false masculino
    private String color; //manipularía como un StringBuilder
    private String raza;
    private String tamanyo; //Gordo o "canijo"
    private Fecha nacimiento;
    private String nombre;
    private float peso;
    public static final String TIPO = "Felino";
    //private String []Hermanos;

    //Tareas
    //1. Crear constructor por defecto(), inicializando todos los atributos random
    //2. Crear constructor personalizado al máximo, reciba tantos argumentos de entrada como atributos no estáticos tenga
    //3. Todos los getter y setter
    public GatoMiguel(String nombre) {
        this.nombre = nombre;
    }


    public GatoMiguel(boolean sexo, String color, String raza, String tamanyo, Fecha nacimiento, String nombre, float peso) {
        this.sexo = sexo;
        this.color = color;
        this.raza = raza;
        this.tamanyo = tamanyo;
        this.nacimiento = nacimiento;
        this.nombre = nombre;
        this.peso = peso;
    }

    public GatoMiguel() {
        Random random = new Random();
        sexo = random.nextBoolean();
        String color = "";
        StringBuilder sb = new StringBuilder(color);
        int coloresRandom= random.nextInt(1,4);
        for (int i = 1; i <= coloresRandom; i++) {
            do {
                color = Constantes.COLORES[random.nextInt(Constantes.COLORES.length)];
            }while (sb.toString().contains(color));
            sb.append(color);
        }
        this.color = sb.toString();
        raza = Constantes.RAZAS[random.nextInt(Constantes.RAZAS.length)];
        tamanyo = Constantes.TAMANYOS[random.nextInt(Constantes.TAMANYOS.length)];
        nombre = Constantes.NOMBRES[random.nextInt(Constantes.NOMBRES.length)];
        nacimiento = new Fecha(); //esto genera fecha nacimiento aletoria
        peso = random.nextFloat();
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamanyo() {
        return tamanyo;
    }

    public void setTamanyo(String tamanyo) {
        this.tamanyo = tamanyo;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public static String getTIPO() {
        return TIPO;
    }

/*
    public String toString(){
        return GatoMiguel.TIPO.substring(0,GatoMiguel.TIPO.length()-1) + (sexo?"a":"o") + " me llamo "+ nombre + ", con color "+ color +",con raza "+ raza+ ", con tamaño "+  tamanyo+ ",que nací "+ nacimiento.toString()+ " y peso "+ String.format("%.2f",peso);
    }
*/

    @Override
    public String toString() {
        return "GatoMiguel{" +
                "sexo=" + sexo +
                ", color='" + color + '\'' +
                ", raza='" + raza + '\'' +
                ", tamanyo='" + tamanyo + '\'' +
                ", nacimiento=" + nacimiento +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                '}';
    }
}
