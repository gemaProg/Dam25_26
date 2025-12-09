package pooT7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tester {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Fecha fecha = new Fecha();
        System.out.println(fecha.getDia());
        System.out.println(fecha.getMes());
        System.out.println(fecha.getAnio());
        fecha.setAnio(2025);
        fecha.setMes(12);
        fecha.setDia(9);
        System.out.printf("%02d/%02d/%02d",fecha.getDia(),fecha.getMes(),fecha.getAnio());
        Fecha fecha1 = new Fecha(31,12,2025);
        Gato gato = new Gato();
        Gato gatoNerea = new Gato("Lukas");
        Gato gatoLucas = new Gato("Ateneo");
        Gato gatoKiarash = new Gato("Cookie");
        Gato gataGema   = new Gato ("Nala");
        Gato gatoGema   = new Gato ("Simba");
        Gato gatoLuna   = new Gato("Lucifer");
        Gato gatoDani = new  Gato ("Groucho");
        System.out.println(Gato.TIPO);
        Gato.TIPO = "ADULTO";
        System.out.println(Gato.TIPO);




    }
}
