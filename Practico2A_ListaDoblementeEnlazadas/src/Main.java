public class Main {
    public static void main(String[] args) {
        ListaDobleEnlace lista = new ListaDobleEnlace();

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

    }
}
