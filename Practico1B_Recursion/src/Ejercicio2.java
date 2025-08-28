public class Ejercicio2 {
    public static int SumaRegresiva(int numero,int resultado){
        if (numero == 0) return resultado;
        return SumaRegresiva(numero-1, resultado+numero);
    }

    public static int SumaRegresiva2(int numero){
        if (numero == 0) return 0;
        return numero + SumaRegresiva2(numero-1);
    }
    public static void main(String[] args) {
        System.out.println("Resultado: "+SumaRegresiva(6,0));
        System.out.println("Resultado funcion 2: "+SumaRegresiva2(6));
    }
}
