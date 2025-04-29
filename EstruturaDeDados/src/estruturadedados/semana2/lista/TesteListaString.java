package estruturadedados.semana2.lista;

import java.util.Scanner;

class ListaArrayString {
    private String[] array;
    private int tamanho;

    public ListaArrayString(int capacidade) {
        this.array = new String[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(String elemento) {
        if (tamanho == array.length) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        array[tamanho++] = elemento;
    }

    public void remover(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Erro: Posição inválida!");
            return;
        }
        for (int i = posicao; i < tamanho - 1; i++) {
            array[i] = array[i + 1];
        }
        tamanho--;
    }

    public void imprimirLista() {
        System.out.print("Lista de Nomes: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int buscar(String nome) {
        for (int i = 0; i < tamanho; i++) {
            if (array[i].equals(nome)) {
                return i;
            }
        }
        return -1;
    }
}

public class TesteListaString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a capacidade da lista: ");
        int capacidade = scanner.nextInt();
        ListaArrayString lista = new ListaArrayString(capacidade);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar nome");
            System.out.println("2. Remover nome");
            System.out.println("3. Imprimir lista");
            System.out.println("4. Buscar nome");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            if (opcao == 1) {
                System.out.print("Digite o nome a ser adicionado: ");
                String nome = scanner.nextLine();
                lista.adicionar(nome);
            } else if (opcao == 2) {
                System.out.print("Digite a posição do nome a ser removido: ");
                int posicao = scanner.nextInt();
                lista.remover(posicao);
            } else if (opcao == 3) {
                lista.imprimirLista();
            } else if (opcao == 4) {
                System.out.print("Digite o nome a ser buscado: ");
                String nome = scanner.nextLine();
                int posicao = lista.buscar(nome);
                if (posicao != -1) {
                    System.out.println("Nome encontrado na posição: " + posicao);
                } else {
                    System.out.println("Nome não encontrado.");
                }
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}