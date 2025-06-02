import java.io.*;
import java.util.*;

public class AutomovelManager {
    @SuppressWarnings("FieldMayBeFinal")
    private List<Automovel> lista = new ArrayList<>();
    private final String arquivo = "data/automoveis.txt";

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public AutomovelManager() {
        new File("data").mkdirs();
        carregarArquivo();
    }

    // Inclusão
    public boolean inserirAutomovel(Automovel a) {
        if (buscarPorPlaca(a.getPlaca()) != null) {
            return false;
        }
        lista.add(a);
        return true;
    }

    // Exclusão
    public boolean removerAutomovel(String placa) {
        Automovel a = buscarPorPlaca(placa);
        if (a != null) {
            lista.remove(a);
            return true;
        }
        return false;
    }

    // Alteração
    public boolean alterarAutomovel(String placa, String modelo, String marca, int ano, double valor) {
        Automovel a = buscarPorPlaca(placa);
        if (a != null) {
            a.setModelo(modelo);
            a.setMarca(marca);
            a.setAno(ano);
            a.setValor(valor);
            return true;
        }
        return false;
    }

    // Consulta
    public Automovel buscarPorPlaca(String placa) {
        for (Automovel a : lista) {
            if (a.getPlaca().equalsIgnoreCase(placa)) {
                return a;
            }
        }
        return null;
    }

    // Listagem ordenada
    public void listarOrdenado(String criterio) {
        Comparator<Automovel> comparador;

        comparador = switch (criterio.toLowerCase()) {
            case "modelo" -> Comparator.comparing(Automovel::getModelo);
            case "marca" -> Comparator.comparing(Automovel::getMarca);
            default -> Comparator.comparing(Automovel::getPlaca);
        };

        lista.stream()
             .sorted(comparador)
             .forEach(a -> System.out.println(a.toDisplayString()));
    }

    // Carregar dados do arquivo
    public void carregarArquivo() {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length == 5) {
                    String placa = partes[0];
                    String modelo = partes[1];
                    String marca = partes[2];
                    int ano = Integer.parseInt(partes[3]);
                    double valor = Double.parseDouble(partes[4]);
                    lista.add(new Automovel(placa, modelo, marca, ano, valor));
                }
            }
        } catch (IOException e) {
            System.out.println("Arquivo não encontrado, iniciando lista vazia.");
        }
    }

    // Salvar dados no arquivo
    public void salvarArquivo() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Automovel a : lista) {
                bw.write(a.toString());
                bw.newLine();
            }
            System.out.println("Dados salvos com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}
