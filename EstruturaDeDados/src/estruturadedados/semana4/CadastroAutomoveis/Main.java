import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            AutomovelManager manager = new AutomovelManager();
            int opcao;
            
            do {
                System.out.println("\n====== MENU ======");
                System.out.println("1 - Incluir automóvel");
                System.out.println("2 - Remover automóvel");
                System.out.println("3 - Alterar dados de automóvel");
                System.out.println("4 - Consultar automóvel por placa");
                System.out.println("5 - Listar automóveis (ordenado)");
                System.out.println("6 - Salvar e sair");
                System.out.print("Escolha uma opção: ");
                opcao = sc.nextInt();
                sc.nextLine(); // Limpa o buffer
                
                switch (opcao) {
                    case 1 -> {
                        System.out.print("Placa: ");
                        String placa = sc.nextLine();
                        System.out.print("Modelo: ");
                        String modelo = sc.nextLine();
                        System.out.print("Marca: ");
                        String marca = sc.nextLine();
                        System.out.print("Ano: ");
                        int ano = sc.nextInt();
                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();
                        sc.nextLine(); // limpar buffer
                        
                        boolean inserido = manager.inserirAutomovel(new Automovel(placa, modelo, marca, ano, valor));
                        System.out.println(inserido ? "Automóvel incluído com sucesso!" : "Placa já existente!");
                    }
                    
                    case 2 -> {
                        System.out.print("Informe a placa do automóvel a remover: ");
                        String placaRemover = sc.nextLine();
                        boolean removido = manager.removerAutomovel(placaRemover);
                        System.out.println(removido ? "Automóvel removido com sucesso!" : "Placa não encontrada!");
                    }
                    
                    case 3 -> {
                        System.out.print("Informe a placa do automóvel a alterar: ");
                        String placaAlterar = sc.nextLine();
                        System.out.print("Novo modelo: ");
                        String novoModelo = sc.nextLine();
                        System.out.print("Nova marca: ");
                        String novaMarca = sc.nextLine();
                        System.out.print("Novo ano: ");
                        int novoAno = sc.nextInt();
                        System.out.print("Novo valor: ");
                        double novoValor = sc.nextDouble();
                        sc.nextLine();
                        
                        boolean alterado = manager.alterarAutomovel(placaAlterar, novoModelo, novaMarca, novoAno, novoValor);
                        System.out.println(alterado ? "Automóvel alterado com sucesso!" : "Placa não encontrada!");
                    }
                    
                    case 4 -> {
                        System.out.print("Informe a placa do automóvel a consultar: ");
                        String placaConsulta = sc.nextLine();
                        Automovel a = manager.buscarPorPlaca(placaConsulta);
                        if (a != null) {
                            System.out.println(">> " + a.toDisplayString());
                        } else {
                            System.out.println("Automóvel não encontrado.");
                        }
                    }
                    
                    case 5 -> {
                        System.out.print("Ordenar por (placa/modelo/marca): ");
                        String criterio = sc.nextLine();
                        manager.listarOrdenado(criterio);
                    }
                    
                    case 6 -> {
                        manager.salvarArquivo();
                        System.out.println("Encerrando o programa...");
                    }
                    
                    default -> System.out.println("Opção inválida!");
                }
                
            } while (opcao != 6);
        }
    }
}
