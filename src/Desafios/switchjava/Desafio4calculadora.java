package Desafios.switchjava;

import java.util.Scanner;

public class Desafio4calculadora {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    double num1 = scanner.nextDouble();

    System.out.print("Digite o segundo número: ");
    double num2 = scanner.nextDouble();

    System.out.println("\n=== MENU ===");
    System.out.println("1 - Somar");
    System.out.println("2 - Subtrair");
    System.out.println("3 - Multiplicar");
    System.out.println("4 - Dividir");
    System.out.print("Escolha uma opção: ");

    int opcao = scanner.nextInt();

    switch (opcao) {
        case 1:
            System.out.println("Resultado: " + (num1 + num2));
            break;

        case 2:
            System.out.println("Resultado: " + (num1 - num2));
            break;

        case 3:
            System.out.println("Resultado: " + (num1 * num2));
            break;

        case 4:
            if (num2 != 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Erro: divisão por zero não é permitida.");
            }
            break;

        default:
            System.out.println("Opção inválida!");
    }

    scanner.close();
}

   }



