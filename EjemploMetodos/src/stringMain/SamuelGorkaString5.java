package stringMain;


import java.util.Scanner;

public class SamuelGorkaString5 {
    static void main(String[] args)  {
       System.out.println("Ingrese el texto a pasar a mayusculas");
        Scanner sc =new Scanner(System.in);
        String texto = sc.nextLine();
        String textoMayus =texto.toUpperCase();
        System.out.println(textoMayus);
    }
}
