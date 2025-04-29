package estruturadedados.semana3.exercicios.exercicio2;

import java.util.Arrays;
import java.util.Scanner;

public class MainExercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[10];

        System.out.println("Digite o nome e preço de 10 produtos:");

        for (int i = 0; i < produtos.length; i++) {
            System.out.print((i + 1) + "º produto - Nome: ");
            String nome = scanner.nextLine();
            System.out.print((i + 1) + "º produto - Preço: ");
            double preco = scanner.nextDouble();
            scanner.nextLine(); // Consumir a quebra de linha
            produtos[i] = new Produto(nome, preco);
        }

        Arrays.sort(produtos);

        System.out.println("\nProdutos do mais caro para o mais barato:");
        for (Produto produto : produtos) {
            System.out.println(produto.getNome() + " - R$ " + produto.getPreco());
        }

        scanner.close();
    }
}
