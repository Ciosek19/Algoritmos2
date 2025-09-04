public class Main {
    public static void main(String[] args) {
        ListaDobleEnlace lista = new ListaDobleEnlace();
<<<<<<< HEAD
        lista.insertarNodoAlFinal(1);
        lista.insertarNodoAlFinal(2);
        lista.insertarNodoAlFinal(3);

        ListaDobleEnlace lista2 = new ListaDobleEnlace();
        lista2.insertarNodoAlFinal(4);
        lista2.insertarNodoAlFinal(5);
        lista2.insertarNodoAlFinal(6);

        lista.unirDosListas(lista2);
        lista.imprimirLista();
=======

        lista.insertarNodoAlFinal(1);
        lista.insertarNodoAlFinal(2);
        lista.insertarNodoAlFinal(3);
        lista.insertarNodoAlFinal(4);

//        System.out.println("Valor cabeza: "+lista.valorCabeza());
        lista.imprimirLista();
        System.out.println("Largo lista: "+lista.getLargo());
        lista.insertarValorEnPosicion(2,5);
        lista.imprimirLista();
        lista.insertarValorEnPosicion(1,7);
        lista.imprimirLista();
        lista.insertarValorEnPosicion(6,6);
        lista.imprimirLista();

>>>>>>> 0ad58052d6af32535b8a003077cdfd02fda4d790
    }
}
