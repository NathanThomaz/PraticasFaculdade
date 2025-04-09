package estruturadedados.semana1.exercicios;

import estruturadedados.semana1.pilha.PilhaEncadeada;

public class TestePilhaEncadeadas {
    public static void main(String[] args) {
        PilhaEncadeada pilha = new PilhaEncadeada();

        // Inserindo elementos na pilha
        pilha.push(5);
        pilha.push(15);
        pilha.push(25);
        pilha.imprimirPilha();

        // Verificando o topo da pilha
        System.out.println("Topo da pilha: " + pilha.peek());

        // Removendo um elemento
        System.out.println("Removendo: " + pilha.pop());
        pilha.imprimirPilha();

        // Verificando o tamanho da pilha
        System.out.println("Tamanho da pilha: " + pilha.size());

        // Testando a remoção até esvaziar a pilha
        pilha.pop();
        pilha.pop();
        pilha.pop(); // Tentando remover de uma pilha vazia
    }
}