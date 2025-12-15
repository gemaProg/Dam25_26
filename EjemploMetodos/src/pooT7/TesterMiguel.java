package pooT7;

import java.util.Scanner;

public class TesterMiguel {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Fecha fecha = new Fecha();
        fecha.setAnio(2025);
        fecha.setMes(12);
        fecha.setDia(9);
        int [] numeros = new int [5];
        GatoMiguel [] gatos = new GatoMiguel [10];
        for (int i = 0; i < gatos.length/2; i++) {
            gatos[i] = new GatoMiguel();
            System.out.println(gatos[i].toString());//no hace falta llamar al toString()
        }
        gatos[1] = null;
        gatos[gatos.length/2] = new GatoMiguel(false,"negro","persa","Gordo",new Fecha("02/05/2021"),"Lucifer",4.2f);



        //System.out.println(gatoMiguel.toString());

    }
}
