// Classe que representa a Pilha usando Lista Encadeada
class PilhaEncadeada {
    private Nodo topo; // Referência para o topo da pilha
    private int tamanho; // Contador para rastrear o tamanho da pilha

    public PilhaEncadeada() {
        this.topo = null;
        this.tamanho = 0;
    }

    // Verifica se a pilha está vazia
    public boolean isEmpty() {
        return topo == null;
    }

    // Retorna o tamanho da pilha
    public int size() {
        return tamanho;
    }

    // Insere um elemento no topo da pilha
    public void push(int elemento) {
        Nodo novoNodo = new Nodo(elemento);
        novoNodo.proximo = topo; // Novo nó aponta para o antigo topo
        topo = novoNodo; // Atualiza o topo da pilha
        tamanho++; // Incrementa o tamanho da pilha
    }

    // Remove e retorna o elemento do topo da pilha
    public int pop() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
        int valor = topo.dado;
        topo = topo.proximo; // Atualiza o topo para o próximo nó
        tamanho--; // Decrementa o tamanho da pilha
        return valor;
    }

    // Retorna o elemento do topo sem removê-lo
    public int peek() {
        if (isEmpty()) {
            System.out.println("Erro: Pilha vazia!");
            return -1;
        }
        return topo.dado;
    }

    // Imprime os elementos da pilha
    public void imprimirPilha() {
        if (isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }
        Nodo temp = topo;
        System.out.print("Pilha: ");
        while (temp != null) {
            System.out.print(temp.dado + " ");
            temp = temp.proximo;
        }
        System.out.println();
    }
}