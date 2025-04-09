package estruturadedados.semana1.exercicios;

import estruturadedados.semana1.lista.ListaArray;

public class TesteLista {
    public static void main(String[] args) {
        ListaArray lista = new ListaArray(5);
        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);
        lista.imprimirLista();

        lista.adicionar(15, 1); // Inserindo 15 na posição 1
        lista.imprimirLista();
    }
}
