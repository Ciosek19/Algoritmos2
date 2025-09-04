public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        pila.push('a');
        pila.push('b');
        pila.push('c');
        pila.push('d');
        System.out.println(pila.top());

        Cola cola = new Cola();
        System.out.println(cola.enqueue('a'));
        System.out.println(cola.enqueue('b'));
        System.out.println(cola.enqueue('c'));
        System.out.println(cola.enqueue('d'));
        System.out.println(cola.dequeue());
        System.out.println(cola.dequeue());
        System.out.println("Back: "+cola.back());
        System.out.println("Front: "+cola.front());
        System.out.println("esta vacia?: "+cola.isEmpty());
    }
}