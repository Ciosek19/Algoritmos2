public class Nodo {
    public int valor;
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo valor) {
        siguiente = valor;
    }

    public void setAnterior(Nodo valor) {
        anterior = valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }
}
