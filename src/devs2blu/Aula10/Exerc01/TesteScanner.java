package devs2blu.Aula10.Exerc01;

import java.util.Scanner;

public class TesteScanner {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Boolean flag = true;

		System.out.println("SELECIONE O MENU : ");
		System.out.println("   1 - CADASTRAR UM PROJETO E UM INTEGRANTE NA EQUIPE");
		System.out.println("   2 - CADASTRAR UM PROJETO E MAIS DE UM INTEGRANTE NA EQUIPE");
		System.out.println("   3 - CADASTRAR MAIS DE UM PROJETO E MAIS DE UM INTEGRANTE NA EQUIPE");

		System.out.println("SELECIONE O MENU : ");
		Integer opcao = Integer.parseInt(entrada.nextLine());

		switch (opcao) {
		case 1: {
		}
		case 2: {
		}
		case 3: {
		}
		default:
			System.out.printf("Valor Invalido: %s" , opcao);
		}

		entrada.close();
	}
}