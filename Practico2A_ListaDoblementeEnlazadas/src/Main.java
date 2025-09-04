public class Main {
    public static void main(String[] args) {
        ListaDobleEnlace lista = new ListaDobleEnlace();
        lista.insertarNodoAlFinal(1);
        lista.insertarNodoAlFinal(2);
        lista.insertarNodoAlFinal(3);

        ListaDobleEnlace lista2 = new ListaDobleEnlace();
        lista2.insertarNodoAlFinal(4);
        lista2.insertarNodoAlFinal(5);
        lista2.insertarNodoAlFinal(6);

        lista.unirDosListas(lista2);
        lista.imprimirLista();
    }
}