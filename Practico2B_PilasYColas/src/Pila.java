public class Pila {
    private Nodo tope;
    private int largo;

    public Pila(){
        largo = 0;
    }

    public char top(){
        if (tope == null) return '\0';
        return tope.getValor();
    }
    public void push(char valor){
        Nodo nuevo = new Nodo(valor);
        if (tope == null){
            tope = nuevo;
            largo++;
            return;
        }
        tope.setSiguiente(nuevo);
        tope = nuevo;
        largo++;
    }
    public int getLargo(){
        return largo;
    }

    public boolean isEmpty(){
        return tope == null;
    }

    public char pop(){
        if (tope == null) return '\0';
        char aux = tope.getValor();
        tope = tope.getSiguiente();
        largo--;
        return aux;
    }

    void clean(){
        tope = null;
        largo = 0;
    }
}
