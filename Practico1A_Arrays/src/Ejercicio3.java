public class Ejercicio3 {

    public static int MaximaGanancia(int[] arreglo){
        if (arreglo.length < 2) return 0;

        int mejorProfit = 0;

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i+1; j < arreglo.length-1; j++) {
                if (arreglo[i] - arreglo[j] < mejorProfit){
                    mejorProfit = arreglo[i] - arreglo[j];
                }
            }
        }
        if (mejorProfit > 0) return 0;
        return Math.abs(mejorProfit);
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int[] prices2 = {7, 1};

        System.out.println("Mejor ganancia: "+Ejercicio3.MaximaGanancia(prices));
    }
}
