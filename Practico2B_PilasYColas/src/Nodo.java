public class Nodo {
    private char valor;
    private Nodo siguiente;

    public Nodo(char valor){
        this.valor = valor;
    }
    public char getValor(){
        return valor;
    }
    public Nodo getSiguiente(){
        return siguiente;
    }
    public void setSiguiente(Nodo valor){
        siguiente = valor;
    }
}
