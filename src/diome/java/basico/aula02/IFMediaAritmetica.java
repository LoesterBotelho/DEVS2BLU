package diome.java.basico.aula02;

import java.util.Scanner;

public class IFMediaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as notas ao usuário
        System.out.print("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a nota 4: ");
        double nota4 = scanner.nextDouble();

        // Calcula a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibe a média
        System.out.println("A média aritmética é: " + media);

        // Condicional para verificar a situação do aluno
        if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        // Fecha o scanner
        scanner.close();
    }
}

