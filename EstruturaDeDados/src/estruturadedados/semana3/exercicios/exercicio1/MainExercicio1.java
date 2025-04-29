package estruturadedados.semana3.exercicios.exercicio1;

import java.util.Arrays;
import java.util.Scanner;

public class MainExercicio1 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        System.out.println("Digite 10 números inteiros:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("\nNúmeros em ordem crescente:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }
}
