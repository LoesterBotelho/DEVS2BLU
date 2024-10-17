package diome.java.basico.aula01;

import java.util.Locale;
import java.util.Scanner;

public class Aula07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
		
		
		System.out.printf("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.printf("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.printf("Digite sua altura: ");
		double altura = entrada.nextDouble();
				
		System.out.printf("Digite sua idade: ");
		int idade = entrada.nextInt();

		System.out.printf("Nome : %s, Sobrenome : %s, Altura : %.2f, Idade : %d"
				, nome
				, sobrenome
				, altura
				, idade);
		
		entrada.close();
	}
}
