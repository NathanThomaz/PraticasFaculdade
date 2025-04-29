package estruturadedados.semana2.lista;

import java.util.Scanner;

class ListaArray {
    @SuppressWarnings("FieldMayBeFinal")
    private int[] array;
    private int tamanho;

    public ListaArray(int capacidade) {
        this.array = new int[capacidade];
        this.tamanho = 0;
    }

    public void adicionar(int elemento) {
        if (tamanho == array.length) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        array[tamanho++] = elemento;
    }

    public void adicionar(int elemento, int posicao) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Erro: Posição inválida!");
            return;
        }
        if (tamanho == array.length) {
            System.out.println("Erro: Lista cheia!");
            return;
        }
        for (int i = tamanho; i > posicao; i--) {
            array[i] = array[i - 1];
        }
        array[posicao] = elemento;
        tamanho++;
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
        System.out.print("Lista: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class TesteLista {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a capacidade da lista: ");
        int capacidade = scanner.nextInt();
        ListaArray lista = new ListaArray(capacidade);

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar elemento ao final");
            System.out.println("2. Adicionar elemento em posição específica");
            System.out.println("3. Remover elemento");
            System.out.println("4. Imprimir lista");
            System.out.println("5. Sair");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite o elemento a ser adicionado: ");
                int elemento = scanner.nextInt();
                lista.adicionar(elemento);
            } else if (opcao == 2) {
                System.out.print("Digite o elemento a ser adicionado: ");
                int elemento = scanner.nextInt();
                System.out.print("Digite a posição: ");
                int posicao = scanner.nextInt();
                lista.adicionar(elemento, posicao);
            } else if (opcao == 3) {
                System.out.print("Digite a posição do elemento a ser removido: ");
                int posicao = scanner.nextInt();
                lista.remover(posicao);
            } else if (opcao == 4) {
                lista.imprimirLista();
            } else if (opcao == 5) {
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}