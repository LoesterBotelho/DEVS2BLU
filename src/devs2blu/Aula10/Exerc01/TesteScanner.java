/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula10.Exerc01;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TesteScanner {

	private static Scanner entrada;
	final static String BARRA = "-----------------------------------";
	final static String QUEBRA_LINHA_DUPLA = "\n\n";
	final static String QUEBRA_LINHA = "\n";
	final static String STRING_EMPTY = "";
	
	public static void main(String[] args) throws MinhaExcecao {

		entrada = new Scanner(System.in).useLocale(Locale.US);
		
		imprimirMenu();		
		Integer opcao = Integer.parseInt( entrada.nextLine() );

		imprimirMenuProf();		
		Integer idProf = Integer.parseInt( entrada.nextLine() );		
		imprimir(BARRA);
		
		try {
			
			Professor profSelecionado = retornarProf(idProf);

			switch (opcao) {
			case 1: { opcao01(profSelecionado); break; }
			case 2: { opcao02(profSelecionado); break; }	
			case 3: { opcao03(profSelecionado); break; }		
			default: throw new MinhaExcecao(  String.format("Menu Invalido: %s" , opcao) );
			}
			
		} catch (Exception e) {
			
			imprimir("Erro : Aconteceu alguma coisa !!!");
			
			imprimir( e.getMessage() );
			
			e.printStackTrace();
		}
		
		entrada.close();
	}
	
	public static void imprimirAutor() {
		imprimir("Autor : Loester Botelho - Java \n");
		imprimir(BARRA);
		imprimir(QUEBRA_LINHA_DUPLA);
	} 
	
	
	public static Professor retornarProf(Integer opcao) throws MinhaExcecao {
		
		Professor prof01;
		Professor prof02;
		Professor prof03;
		
		prof01 = new Professor( new BigDecimal("7000.0") , new BigInteger("74982164") , "Heloisa" );
		prof02 = new Professor( new BigDecimal("7000.0") , new BigInteger("84982264") , "Abelardo" );
		prof03 = new Professor( new BigDecimal("7000.0") , new BigInteger("63331364") , "Vilson" );
		
		switch (opcao) {
		case 1: { return prof01; }
		case 2: { return prof02; }	
		case 3: { return prof03; }		
		default:			
			throw new MinhaExcecao( String.format("Prof. Invalido: %s" , opcao) );
		}
	}
	
	public static void imprimirMenu() {		
		imprimir(BARRA);
		imprimir("SELECIONE O MENU : ");
		imprimir("   1 - CADASTRAR UM PROJETO E UM INTEGRANTE NA EQUIPE");
		imprimir("   2 - CADASTRAR UM PROJETO E MAIS DE UM INTEGRANTE NA EQUIPE");
		imprimir("   3 - CADASTRAR MAIS DE UM PROJETO E MAIS DE UM INTEGRANTE NA EQUIPE");
		imprimir("SELECIONE O MENU : ", false);		
	}
	
	public static void imprimirMenuProf() {		
		imprimir(BARRA);
		imprimir("SELECIONE UM PROFESSOR : ");
		imprimir("   1 - Heloisa");
		imprimir("   2 - Abelardo");
		imprimir("   3 - Vilson");
		imprimir("SELECIONE O PROF : ", false);		
	}	
	
	public static void imprimir(String texto, Boolean naoQuebrarLinha) {		
		System.out.printf("%s",texto);
	}	
	
	public static void imprimir(String texto) {		
		System.out.printf("%s \n",texto);
	}
	
	public static String perguntaTexto(String texto) {
		imprimir(texto, false);
		return entrada.nextLine();
	}
	
	public static LocalDate perguntaData(String texto) throws ParametrosInvalidosException {
		imprimir("Digite uma data (formato: dd/MM/yyyy)");		
		imprimir(texto, false);		
		
		try {
			return LocalDate.parse( entrada.nextLine() , DateTimeFormatter.ofPattern("dd/MM/yyyy") );
		} catch (Exception e ) {			
			throw new ParametrosInvalidosException("Data em formato inválido. Por favor, use o formato dd/MM/yyyy.");
		}
	}
	
	public static void opcao01(Professor profSelecionado) throws MinhaExcecao, ParametrosInvalidosException {
		imprimir("SELECIONADO OPÇÃO 01 - CADASTRAR UM PROJETO E UM INTEGRANTE NA EQUIPE");
		
		String nomeAluno = STRING_EMPTY;
		String nomeProjeto = STRING_EMPTY;
		
		List<Pesquisador> grupo = new ArrayList<>();
	
		
		nomeProjeto = perguntaTexto("Digite o nome do projeto : ");		
		if ( nomeProjeto == STRING_EMPTY ) {
			throw new MinhaExcecao("ERRO : NÃO DIGITADO NOME DO PROJETO !!!");
		}
		
		
		nomeAluno = perguntaTexto("Digite o nome do aluno : ");
		if ( nomeAluno != STRING_EMPTY ) {
			Aluno aluno01 = new Aluno(nomeAluno);
			grupo.add(aluno01);
		} else {			
			throw new MinhaExcecao("ERRO : NÃO DIGITADO NOME DO ALUNO !!!");
		}
		
		
		LocalDate dataInicio = perguntaData("Digite a Data Inicial : ");
		
		
		LocalDate dataFinal = perguntaData("Digite a Data Final : ");
		
			
		ProjetoPesquisa projeto = new ProjetoPesquisa(1, nomeProjeto, dataInicio, dataFinal, profSelecionado, grupo);		

		imprimir( projeto.toString() );		
	}
	
	public static void opcao02(Professor profSelecionado) throws ParametrosInvalidosException, MinhaExcecao {
		imprimir("SELECIONADO OPÇÃO 02 - CADASTRAR UM PROJETO E MAIS DE UM INTEGRANTE NA EQUIPE");
		imprimir("ATENÇÃO - QUANDO TERMINAR DE CADASTRAR DEIXAR EM BRANCO NOME !!!");
		
		String nomeAluno = STRING_EMPTY;
		String nomeProjeto = STRING_EMPTY;
		
		List<Pesquisador> grupo = new ArrayList<>();
		
		Boolean flagVazioAluno = true;
		
		nomeProjeto = perguntaTexto("Digite o nome do projeto : ");
		if ( nomeProjeto == STRING_EMPTY ) {
			throw new MinhaExcecao("ERRO : NÃO DIGITADO NOME DO PROJETO !!!");
		}
		
		do {
		
		nomeAluno = perguntaTexto("Digite o nome do aluno : ");
				
		if ( nomeAluno != STRING_EMPTY ) {
			Aluno aluno = new Aluno(nomeAluno);		
			grupo.add(aluno);
		} else {
			flagVazioAluno = false;
		}
		
		} while (flagVazioAluno);
		
		if ( grupo.isEmpty() ) {
			throw new MinhaExcecao("ERRO : SEM ALUNOS !!!");
		}
		
		
	LocalDate dataInicio = perguntaData("Digite a Data Inicial : ");
	LocalDate dataFinal = perguntaData("Digite a Data Final : ");
	
	ProjetoPesquisa projeto = new ProjetoPesquisa(1, nomeProjeto, dataInicio, dataFinal, profSelecionado, grupo);		

	imprimir( projeto.toString() );		
		

	}
	
	public static void opcao03(Professor profSelecionado) throws ParametrosInvalidosException, MinhaExcecao {
		imprimir("SELECIONADO OPÇÃO 03 - CADASTRAR MAIS DE UM PROJETO E MAIS DE UM INTEGRANTE NA EQUIPE");
		imprimir("ATENÇÃO - QUANDO TERMINAR DE CADASTRAR DEIXAR EM BRANCO NOME !!!");
		
		String nomeAluno = STRING_EMPTY;
		String nomeProjeto = STRING_EMPTY;
		
		List<Pesquisador> grupo = new ArrayList<>();
		List<ProjetoPesquisa> projetos = new ArrayList<>();
		
		Boolean flagVazioProjeto = true;
		Boolean flagVazioAluno = true;
		Integer contadorProjeto = 0;
		
		do {
			
			// gerar um grupo para cada projeto a cada interação
			grupo = new ArrayList<>();
			
			nomeProjeto = perguntaTexto("Digite o nome do projeto : ");
			if ( nomeProjeto == STRING_EMPTY ) {
				imprimir("COD : 01 - PARADA EFETUADA PELO USUÁRIO - NÃO PREENCHEU NOME DO PROJETO");
				break;
				// throw new MinhaExcecao("ERRO : NÃO DIGITADO NOME DO PROJETO !!!");
			}

			
			
			do {
				
			nomeAluno = perguntaTexto("Digite o nome do aluno : ");
			
			if (nomeAluno != "") {
				Aluno aluno = new Aluno(nomeAluno);		
				grupo.add(aluno);
			} else {
				flagVazioAluno = false;
				break;
			}
			
			} while (flagVazioAluno);
				
			
		if ( grupo.isEmpty() ) {
			imprimir("COD : 02 - PARADA EFETUADA PELO USUÁRIO - NÃO PREENCHEU NOME ALUNO");
			flagVazioProjeto = false;
			break;
			//throw new MinhaExcecao("ERRO : SEM ALUNOS !!!");
		}

		
		contadorProjeto++;
						
			
		LocalDate dataInicio = perguntaData("Digite a Data Inicial : ");
		LocalDate dataFinal = perguntaData("Digite a Data Final : ");
		
		// ATENÇÃO
		// TEVE QUE SER CRIADO UMA NOVA LISTA 
		// new ArrayList<>(grupo)
		// PORQUE QUANDO PASSA PELO LIMPAR VARIAVEIS ELE APAGAVA : grupo.clear();
		
		ProjetoPesquisa projeto = new ProjetoPesquisa(contadorProjeto, nomeProjeto, dataInicio, dataFinal, profSelecionado, new ArrayList<>(grupo) );
		projetos.add(projeto);
		
		// LIMPAR VARIAVEIS
		grupo.clear();
		
		//imprimir( projeto.toString() );
			
		} while (flagVazioProjeto);
		
		imprimir(QUEBRA_LINHA_DUPLA);
		
		imprimir("Resultados");
		
		imprimir(QUEBRA_LINHA);
		
		
		// foreach
		
		for (var projeto : projetos) {		
			imprimir( projeto.toString() );
		}
		
	}
	
	
}