//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public static int suma(int a, int b){
    return a+b;
}

void main() throws IOException {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.

    /*System.out.println("Introduce dos números");
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println(OperacionesPrimitivos.suma(num1, num2));
    int resultado = OperacionesPrimitivos.multiplicacion(num1, num2);
    System.out.println(resultado);
    System.out.println(suma(num1, num2));
    if (num2!=0)
        System.out.println(OperacionesPrimitivos.division(num1,num2));
    else
        System.out.println("Sus números no se pueden dividir");*/
    /*int num1 = EntradaSalida.dameOperando1();
    int num2 = EntradaSalida.dameOperando2();
    System.out.println(OperacionesPrimitivos.division(num1,num2));*/

    /*int[] litros = OperacionesArrays.creaArray();
    OperacionesArrays.cargaManual(litros);
    //OperacionesArrays.imprimirArray(litros);
    EntradaSalida.imprimirArray(litros);*/
    String texto = EntradaSalida.dameString("Introduce texto");
    char car1;
    do {
        car1 = EntradaSalida.dameCaracter("Intoduce caracter (que exista en el texto) a reemplazar");
    }while(!OperacionesString.existeCaracter(texto, car1));
    char car2 = EntradaSalida.dameCaracter("Intoduce caracter final");
    texto= OperacionesString.reemplazar(texto, car1, car2);
    EntradaSalida.imprimir(texto);

}
