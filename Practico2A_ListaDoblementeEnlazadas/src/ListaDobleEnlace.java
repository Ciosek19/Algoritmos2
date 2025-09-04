import java.util.List;

public class ListaDobleEnlace {
    private Nodo cabeza;
    private int largo;

<<<<<<< HEAD
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
=======
    public ListaDobleEnlace() {
>>>>>>> 0ad58052d6af32535b8a003077cdfd02fda4d790
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
<<<<<<< HEAD
        nuevo.setSiguiente(this.cabeza);
=======
        nuevo.setSiguiente(cabeza);
>>>>>>> 0ad58052d6af32535b8a003077cdfd02fda4d790
        this.cabeza.setAnterior(nuevo);
        this.cabeza = nuevo;
        largo++;
    }

<<<<<<< HEAD
    public int valorCabeza(){
        return cabeza.getValor();
=======
    public int valorCabeza() {
        return cabeza.valor;
>>>>>>> 0ad58052d6af32535b8a003077cdfd02fda4d790
    }

    public void insertarNodoAlFinal(int valor) {
        Nodo nuevo = new Nodo(valor);
        if (largo == 0) {
            this.cabeza = nuevo;
            largo++;
            return;
        }
        Nodo aux = cabeza;
<<<<<<< HEAD
        while(aux.getSiguiente() != null){
=======
        while (aux.getSiguiente() != null) {
>>>>>>> 0ad58052d6af32535b8a003077cdfd02fda4d790
            aux = aux.getSiguiente();
        }
        nuevo.setAnterior(aux);
        aux.setSiguiente(nuevo);
<<<<<<< HEAD
=======
        largo++;
>>>>>>> 0ad58052d6af32535b8a003077cdfd02fda4d790
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
<<<<<<< HEAD
        while(indice != pos){
=======
        while (indice != pos) {
>>>>>>> 0ad58052d6af32535b8a003077cdfd02fda4d790
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
