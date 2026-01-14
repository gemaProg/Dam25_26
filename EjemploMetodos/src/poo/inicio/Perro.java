package poo.inicio;

public class Perro {
    //Tareas pendientes 16: otra clase similar a gato y perro
    //GestorAnimal que contenga como atributo un array de objetos de la clase anterior
    private boolean sexo; //true femenino false masculino
    private String color; //manipularía como un StringBuilder
    private String raza;
    private String tamanyo; //Gordo o "canijo"
    private Fecha nacimiento;
    private String nombre;
    private float peso;
    public static final String TIPO = "Canino";

    public Perro(boolean sexo, String color, String raza, String tamanyo, Fecha nacimiento, String nombre, float peso) {
        this.sexo = sexo;
        this.color = color;
        this.raza = raza;
        this.tamanyo = tamanyo;
        this.nacimiento = nacimiento;
        this.nombre = nombre;
        this.peso = peso;
    }
    public Perro() {}

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

    @Override
    public String toString() {
        return "Perro{" +
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
