package PilhasEncadeadas;

// Classe que representa um nó da lista encadeada
public class Nodo {
    int dado; // Dado armazenado no nó
    Nodo proximo; // Referência para o próximo nó

    public Nodo(int dado) {
        this.dado = dado;
        this.proximo = null;
    }
}