package estruturadedados.semana1.pilha;

public class Pilha<T> {
    private int topo;
    private T[] elementos;
    private int capacidade;

    @SuppressWarnings("unchecked")
    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = (T[]) new Object[capacidade]; // Array genérico
        this.topo = -1;
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public boolean isFull() {
        return topo == capacidade - 1;
    }

    public void push(T elemento) {
        if (isFull()) {
            throw new RuntimeException("Erro: Pilha cheia!");
        }
        elementos[++topo] = elemento;
    }

    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Erro: Pilha vazia!");
        }
        return elementos[topo--];
    }

    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Erro: Pilha vazia!");
        }
        return elementos[topo];
    }

    public int size() {
        return topo + 1;
    }

    public void imprimirPilha() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        System.out.print("Pilha: ");
        for (int i = 0; i <= topo; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }
}


