public class ListaDobleEnlace {
    private Nodo cabeza;
    private int largo;

    public ListaDobleEnlace() {
        largo = 0;
    }

    public int getLargo() {
        return largo;
    }

    public void imprimirLista(){
        if (cabeza == null) {
            System.out.println("La lista esta vacia.");
            return;
        }
        Nodo aux = this.cabeza;

        System.out.print(this.cabeza.valor);
        while (aux.getSiguiente() != null){
            aux = aux.getSiguiente();
            System.out.print(" <-> "+aux.getValor());
        }
        System.out.println();
    }

    public void EliminarLista() {
        this.cabeza = null;
    }

    public void insertarNodoAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (largo == 0) {
            cabeza = nuevo;
            largo++;
            return;
        }
        nuevo.setSiguiente(cabeza);
        this.cabeza.setAnterior(nuevo);
        this.cabeza = nuevo;
        largo++;
    }

    public int valorCabeza() {
        return cabeza.valor;
    }

    public void insertarNodoAlFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (largo == 0) {
            this.cabeza = nuevo;
            largo++;
            return;
        }
        Nodo aux = cabeza;
        while (aux.getSiguiente() != null) {
            aux = aux.getSiguiente();
        }
        nuevo.setAnterior(aux);
        aux.setSiguiente(nuevo);
        largo++;
    }

    public void insertarValorEnPosicion(int pos, int valor) {
        if (pos > largo || pos < 1) return;
        if (pos == 1) {
            insertarNodoAlInicio(valor);
            return;
        }
        Nodo nuevo = new Nodo(valor);
        Nodo aux = cabeza;
        int indice = 1;
        while (indice != pos) {
            aux = aux.getSiguiente();
            indice++;
        }
        aux.getAnterior().setSiguiente(nuevo);
        //1 <->(5) 2 <-> 3 <-> 4 (pos = 2,valor = 5)
        nuevo.setSiguiente(aux);
        //1 <->(5) -> 2 <-> 3 <-> 4 (pos = 2,valor = 5)
        aux.setAnterior(nuevo);
        largo++;
    }
}
