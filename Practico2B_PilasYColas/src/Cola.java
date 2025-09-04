public class Cola {
    private Nodo front;
    private Nodo back;
    private int largo;
    public Cola(){
        largo = 0;
    }

    public char enqueue(char valor){
        Nodo nuevo = new Nodo(valor);
        if (front == null){
            front = nuevo;
            back = nuevo;
        }
        else{
            back.setSiguiente(nuevo);
            nuevo = back;
        }
        return nuevo.getValor();
    }

    public boolean isEmpty(){
        return front == null;
    }

    public char front(){
        if (front == null) return '\0';
        return front.getValor();
    }

    public char back(){
        if (back == null) return '\0';
        return back.getValor();
    }

    public char dequeue(){
        if (front == null) return '\0';
        char aux = front.getValor();
        front = front.getSiguiente();
        if (front == null){
            back = null;
        }
        return aux;
    }
}
