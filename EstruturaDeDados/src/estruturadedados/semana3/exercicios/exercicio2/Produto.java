package estruturadedados.semana3.exercicios.exercicio2;

public class Produto implements Comparable<Produto> {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto outro) {
        // Ordenar de forma decrescente pelo preço
        return Double.compare(outro.preco, this.preco);
    }
}
