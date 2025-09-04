public class Nodo {
<<<<<<< HEAD
    private int valor;
=======
    public int valor;
>>>>>>> 0ad58052d6af32535b8a003077cdfd02fda4d790
    private Nodo siguiente;
    private Nodo anterior;

    public Nodo(int valor) {
        this.valor = valor;
    }

<<<<<<< HEAD
    public int getValor(){
        return valor;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo valor){
        siguiente = valor;
    }

    public void setAnterior(Nodo valor){
        anterior = valor;
    }
    public Nodo getAnterior(){
=======
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
>>>>>>> 0ad58052d6af32535b8a003077cdfd02fda4d790
        return anterior;
    }
}
