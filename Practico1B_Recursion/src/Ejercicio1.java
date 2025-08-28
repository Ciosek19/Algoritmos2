public class Ejercicio1 {
    public static int RecibirProducto(int[] vector, int indice, int resultado){
        if (indice == vector.length-1) return resultado;
        return RecibirProducto(vector,indice+1,resultado*vector[indice+1]);
    }

    public static void main(String[] args) {
        int[] vector = {1,2,3,4,5};

        System.out.println("Resultado producto = "+Ejercicio1.RecibirProducto(vector,0,1));
    }
}
/*
* {1,2,3,4,5}
*
* vector, 0+1, 1*2,
* vector, 1+1, 2*3,
* vector, 2+1, 6*3,
* vector, 3+1, 18*4,
* vector, 4+1, 72*4,
* */
