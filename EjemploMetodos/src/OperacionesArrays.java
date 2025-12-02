public class OperacionesArrays {
    /**
     * Operaciones:
     * Carga Manual
     * Carga Aleatoria
     * Imprimir
     * ValorPosición
     */
    public static int [] creaArray(){
        int tamanyo = EntradaSalida.dameNumero("Cuántos días vas a hacer el registro de precipitaciones?");
        int []lluvias = new int[tamanyo];
        return lluvias;
    }

    public static void cargaManual(int []precipitaciones){
        for (int i = 0; i < precipitaciones.length; i++) {
            precipitaciones[i] = EntradaSalida.dameNumero("Introduce un número "+(i+1));
        }
    }
    public static void imprimirArray(int []precipitaciones){
        for (int i = 0; i < precipitaciones.length; i++) {
           EntradaSalida.imprimirNumero(precipitaciones[i]);
            //System.out.println(precipitaciones[i]);
        }

    }
}
