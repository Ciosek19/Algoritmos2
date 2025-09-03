import java.util.List;

public class ListaDobleEnlace {
    public Nodo cabeza;
    public int largo;



    public ListaDobleEnlace(){
        largo = 0;
    }

    public void EliminarLista(){
        this.cabeza = null;
    }

    public void insertarNodoAlInicio(int valor){
        Nodo nuevo = new Nodo(valor);
        if (largo == 0){
            cabeza = nuevo;
            largo++;
            return;
        }
        nuevo.siguiente = this.cabeza;
        this.cabeza.anterior = nuevo;
        this.cabeza = nuevo;
        largo++;
    }

    public int valorCabeza(){
        return cabeza.valor;
    }

    public void insertarNodoAlFinal(int valor){
        Nodo nuevo = new Nodo(valor);
        if (largo == 0){
            this.cabeza = nuevo;
            largo++;
            return;
        }
        Nodo aux = cabeza;
        while(aux.siguiente != null){
            aux = aux.siguiente;
        }
        nuevo.anterior = aux;
        aux.siguiente = nuevo;
    }

    public void insertarValorEnPosicion(int pos, int valor){
        if (pos > largo || pos < 1) return;
        Nodo nuevo = new Nodo(valor);
        Nodo aux = cabeza;
        int indice = 1;
        while(indice != pos){
            aux = aux.siguiente;
            indice++;
        }
        
        //1 -> 2 -> 3 -> 4 (pos 2)
    }

    public void listaAlRevez(List<Integer> lista){

    }
}
