// Package: TesteQualidadeDeSoftware.semana2.util
package TesteQualidadeDeSoftware.semana1;

import java.util.Scanner;
import TesteQualidadeDeSoftware.semana1.util.Calculadora;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora Simples");
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        String operador = scanner.next();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        boolean valido = true;

        try {
            switch (operador) {
                case "+":
                    resultado = calculadora.somar(num1, num2);
                    break;
                case "-":
                    resultado = calculadora.subtrair(num1, num2);
                    break;
                case "*":
                    resultado = calculadora.multiplicar(num1, num2);
                    break;
                case "/":
                    resultado = calculadora.dividir(num1, num2);
                    break;
                default:
                    System.out.println("Operador inválido.");
                    valido = false;
                    break;
            }

            if (valido) {
                System.out.println("Resultado: " + resultado);
            }
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
