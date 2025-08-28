public class Ejercicio4 {
    public static String ConvertirABinario(int numero){
        if (numero == 0) return "0";
        if (numero == 1) return "1";
        return ConvertirABinario(numero/2)+numero%2+"";
    }

    public static void main(String[] args) {
        System.out.println("Conversion a binario:"+ConvertirABinario(10));
    }

}
/*
* [10] -> [10/2]] + 0 -> ? + 0 -> "101" + "1"
* [5] -> [5/2]] + 1 -> ? + 1 -> "10" + "1"
* [2] -> [2/2]] + 0 -> ? + 0 -> "1"+"0"
* [1] -> 1

* 10 / 2 = 5 -> r = 0
* 5 / 2 = 2 -> r = 1
* 2 / 2 = 1 -> r = 0
* 1 / 2 = 0 -> r = 1
*
* 1010 -> del ultimo al primero
* */