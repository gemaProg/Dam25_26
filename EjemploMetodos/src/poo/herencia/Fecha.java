package poo.herencia;

import java.util.Random;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anyo;
    }
    public Fecha() {
        Random rand = new Random();
        dia = rand.nextInt(30) + 1;
        mes = rand.nextInt(1,13);;
        anio = rand.nextInt(1980,2030);
    }

    public Fecha(String fecha) {
        //opcion1 substring
        String diaString = fecha.substring(0, 2);
        dia = Integer.parseInt(diaString);
        //int dia = Integer.parseInt(fecha.substring(0,2));
        //opcion2
        String []trozos = fecha.split("/");
        dia = Integer.parseInt(trozos[0]);


    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }
    public int getAnio(){
        return anio;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    /*public void setDia(int diaNuevo){
        dia = diaNuevo;
    }*/
    public void setMes(int mes){
        this.mes = mes;
    }
    public void setAnio(int anio){
        this.anio = anio;
    }

    @Override
    public String toString(){
        return String.format("%02d/%02d/%02d", dia, mes, anio);
    }

    /*@Override
    public String toString() {
        return "Fecha{" +
                "dia=" + dia +
                ", mes=" + mes +
                ", anio=" + anio +
                '}';
    }*/
}
