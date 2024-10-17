package diome.java.basico.aula02;

import java.util.Scanner;

public class OperadorTernario {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Entrada das notas
	        System.out.print("Digite a primeira nota: ");
	        double nota1 = scanner.nextDouble();

	        System.out.print("Digite a segunda nota: ");
	        double nota2 = scanner.nextDouble();

	        System.out.print("Digite a terceira nota: ");
	        double nota3 = scanner.nextDouble();

	        System.out.print("Digite a quarta nota: ");
	        double nota4 = scanner.nextDouble();

	        // Cálculo da média
	        double media = (nota1 + nota2 + nota3 + nota4) / 4;

	        // Condição com operador ternário
	        String resultado = (media >= 7) ? "Aprovado" :
	                           (media >= 5) ? "Recuperação" :
	                           "Reprovado";

	        System.out.println("Média: " + media + " - Status: " + resultado);

	        scanner.close();
	    }
	}