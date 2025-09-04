import java.util.List;

public class ListaDobleEnlace {
    private Nodo cabeza;
    private int largo;

    public Nodo getCabeza() {
        return cabeza;
    }

    public void imprimirLista(){
        if (largo == 0 || cabeza == null) return;
        Nodo aux = cabeza;
        while (aux != null){
            System.out.print(aux.getValor()+" -> ");
            aux = aux.getSiguiente();
        }
        System.out.print("NULL");
    }

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
        nuevo.setSiguiente(this.cabeza);
        this.cabeza.setAnterior(nuevo);
        this.cabeza = nuevo;
        largo++;
    }

    public int valorCabeza(){
        return cabeza.getValor();
    }

    public void insertarNodoAlFinal(int valor){
        Nodo nuevo = new Nodo(valor);
        if (largo == 0){
            this.cabeza = nuevo;
            largo++;
            return;
        }
        Nodo aux = cabeza;
        while(aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        nuevo.setAnterior(aux);
        aux.setSiguiente(nuevo);
    }

    public void insertarValorEnPosicion(int pos, int valor){
        if (pos > largo || pos < 1) return;
        Nodo nuevo = new Nodo(valor);
        Nodo aux = cabeza;
        int indice = 1;
        while(indice != pos){
            aux = aux.getSiguiente();
            indice++;
        }
        
        //1 -> 2 -> 3 -> 4 (pos 2)
    }

    public void imprimirListaAlRevez(){
        if (cabeza == null || largo == 0) return;
        Nodo aux = cabeza;
        while (aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        System.out.print("NULL");
        while (aux != null){
            System.out.print(" -> "+aux.getValor());
            aux = aux.getAnterior();
        }
    }

    public void insercionEnOrden(int valor){
        Nodo nuevo = new Nodo(valor);
        if (cabeza == null) {
            cabeza = nuevo;
            return;
        };
        Nodo aux = cabeza;
        // 1 -> 1 -> 2 -> 2 -> 3 -> 4 -> 4
        while(aux.getSiguiente() != null){
            if (aux.getSiguiente().getValor() > valor){
                nuevo.setSiguiente(aux.getSiguiente());
                aux.setSiguiente(nuevo);
                return;
            }
            aux = aux.getSiguiente();
        }
    }
    
    public void unirDosListas(ListaDobleEnlace lista){
        if (lista == null) return;
        if (cabeza == null) {
            cabeza = lista.getCabeza();
            return;
        };
        Nodo aux = cabeza;
        while (aux.getSiguiente() != null){
            aux = aux.getSiguiente();
        }
        aux.setSiguiente(lista.getCabeza());
    }
}
