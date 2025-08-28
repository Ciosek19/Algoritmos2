public class Ejercicio5 {
    public static int SumaDigitos(int numero){
        if (numero == 0) return 0;
        return numero%10 + SumaDigitos(numero/10);
    }

    /*
    * [1230] -> numero%10 + [numero/10] -> 0 + ? ->
    * [123] -> numero%10 + [numero/10] -> 3 + ? ->
    * [12] -> numero%10 + [numero/10] -> 2 + ? ->
    * [1] -> numero%10 + [numero/10] -> 1 + ? ->
    * [0] -> 0
    * */

    public static void main(String[] args) {
        System.out.println("Resultado suma digitos: "+ SumaDigitos(1230));
    }
}
