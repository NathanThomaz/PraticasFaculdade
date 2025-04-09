package estruturadedados.semana2.util;

import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    private int codigo;
    private String nome;
    private int quantidade;

    public Produto(int codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Quantidade: " + quantidade;
    }
}

class ListaProdutos {
    private ArrayList<Produto> produtos;

    public ListaProdutos() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(int codigo, String nome, int quantidade) {
        Produto produto = new Produto(codigo, nome, quantidade);
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!");
    }

    public void removerProduto(int codigo) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == codigo) {
                produtos.remove(i);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void buscarPorCodigo(int codigo) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == codigo) {
                System.out.println("Produto encontrado: " + produto);
                return;
            }
        }
        System.out.println("Produto não encontrado.");
    }

    public void buscarPorNome(String nome) {
        boolean encontrado = false;
        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Produto encontrado: " + produto);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("Nenhum produto encontrado com o nome: " + nome);
        }
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de Produtos:");
            for (Produto produto : produtos) {
                System.out.println(produto);
            }
        }
    }
}

public class TesteListaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaProdutos lista = new ListaProdutos();

        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar produto");
            System.out.println("2. Remover produto");
            System.out.println("3. Buscar produto por código");
            System.out.println("4. Buscar produto por nome");
            System.out.println("5. Listar todos os produtos");
            System.out.println("6. Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o código do produto: ");
                    int codigo = scanner.nextInt();
                    scanner.nextLine(); // Consumir a nova linha
                    System.out.print("Digite o nome do produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();
                    lista.adicionarProduto(codigo, nome, quantidade);
                    break;

                case 2:
                    System.out.print("Digite o código do produto a ser removido: ");
                    int codigoRemover = scanner.nextInt();
                    lista.removerProduto(codigoRemover);
                    break;

                case 3:
                    System.out.print("Digite o código do produto a ser buscado: ");
                    int codigoBuscar = scanner.nextInt();
                    lista.buscarPorCodigo(codigoBuscar);
                    break;

                case 4:
                    System.out.print("Digite o nome do produto a ser buscado: ");
                    String nomeBuscar = scanner.nextLine();
                    lista.buscarPorNome(nomeBuscar);
                    break;

                case 5:
                    lista.listarProdutos();
                    break;

                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}