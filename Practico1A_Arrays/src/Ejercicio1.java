/*
1 ) Escriba una función que tome un vector y devuelva otro que contenga todos los
elementos excepto el primero y el último.
        myArray = [1, 2, 3, 4]
middle(myArray)
# [2,3].
*/
public class Ejercicio1 {

    public static int[] obtenerElementosMedios(int[] arreglo){
        if (arreglo.length <= 2) return new int[0];

        int[] elementosMedio = new int[arreglo.length-2];

        for (int i = 1; i < arreglo.length - 1; i++) {
            elementosMedio[i-1] = arreglo[i];
        }
        return elementosMedio;
    }

    public static void imprimirArray(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

    public static void main(String[] args) {
        int[] vector = new int[]{1,2,3,4};

        int[] vectorNuevo = obtenerElementosMedios(vector);
        imprimirArray(vectorNuevo);
    }
}

