package devs2blu.Aula10.Exerc01;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {

		Professor prof01 = new Professor( new BigDecimal("7000.0") , new BigInteger("74982164") , "Heloisa" );
		Professor prof02 = new Professor( new BigDecimal("7000.0") , new BigInteger("74982164") , "Abelardo" );
		Professor prof03 = new Professor( new BigDecimal("7000.0") , new BigInteger("74982164") , "Vilson" );
		
	
		Aluno aluno01 = new Aluno("Loester");
		Aluno aluno02 = new Aluno("Antonio");
		Aluno aluno03 = new Aluno("Leandro");
		
	
		List<Pesquisador> oMelhorGrupo = new ArrayList<>();
		oMelhorGrupo.add(aluno01);
		oMelhorGrupo.add(aluno02);
		oMelhorGrupo.add(aluno03);
		
		LocalDate dataInicio = LocalDate.of(2024, 01, 01);
		LocalDate dataFinal = LocalDate.of(2024, 05, 30);
		
		ProjetoPesquisa projetoDev = new ProjetoPesquisa(1, "API SPRING JAVA", dataInicio, dataFinal, prof01, oMelhorGrupo);
		
		ProjetoPesquisa projetoDB = new ProjetoPesquisa(2, "BANCO DE DADOS POSTGRESQL", dataInicio, dataFinal, prof02, oMelhorGrupo);
		
		ProjetoPesquisa projetoEnglish = new ProjetoPesquisa(3, "PITCH IN ENGLISH", dataInicio, dataFinal, prof03, oMelhorGrupo);
		
		System.out.println( projetoDev.toString() );
		System.out.println( projetoDB.toString() );
		System.out.println( projetoEnglish.toString() );
		
	}

}
