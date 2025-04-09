// Package: TesteQualidadeDeSoftware.semana2.util
package TesteQualidadeDeSoftware.semana2;

import java.util.Scanner;
import TesteQualidadeDeSoftware.semana2.util.ConversorTemperatura;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorTemperatura conversor = new ConversorTemperatura();

        System.out.println("=== Conversor de Temperatura ===");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        System.out.print("Escolha uma opção (1 ou 2): ");
        int opcao = scanner.nextInt();

        System.out.print("Digite a temperatura: ");
        double temperatura = scanner.nextDouble();

        if (!conversor.temperaturaEhValida(temperatura)) {
            System.out.println("Erro: Temperatura inválida (menor que o zero absoluto).");
        } else {
            double resultado;

            if (opcao == 1) {
                resultado = conversor.celsiusParaFahrenheit(temperatura);
                System.out.printf("Resultado: %.2f °C = %.2f °F%n", temperatura, resultado);
            } else if (opcao == 2) {
                resultado = conversor.fahrenheitParaCelsius(temperatura);
                System.out.printf("Resultado: %.2f °F = %.2f °C%n", temperatura, resultado);
            } else {
                System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
