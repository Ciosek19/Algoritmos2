/*
2) Dado un vector de calificaciones que pueden ir del 0 al 100, escriba una función para
obtener el primer y segundo mejor puntaje, devuélvalo en un nuevo vector.
myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
firstSecond(myArray)
# [90,87].
 */

public class Ejercicio2 {
    public static int[] mejores2Calificaciones(int[] arreglo){
        if (arreglo.length < 2) return new int[0];
        int primerNota = 0;
        int segundaNota = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > primerNota){
                segundaNota = primerNota;
                primerNota = arreglo[i];
            }
        }
        int[] top = {primerNota,segundaNota};
        return top;
    }

    public static void main(String[] args) {
        int[] arrayPrueba = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};

        int[] resultados = Ejercicio2.mejores2Calificaciones(arrayPrueba);

        Ejercicio2.mejores2Calificaciones(resultados);
        System.out.println("Resultados:");
        Ejercicio1.imprimirArray(resultados);
    }
}
