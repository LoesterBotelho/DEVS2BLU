/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula10.Exerc01;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Professor extends Funcionario implements Pesquisador {

	private String nome;

	public Professor() {
		this.setNome("");
	}

	
	public Professor(String nome) {
		this.nome = nome;
	}

	public Professor(BigDecimal salario, BigInteger matricula, String nome) {
		super(salario, matricula);
		this.nome = nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getTipo() {
		return "Professor";
	}

	@Override
	public String toString() {
		return String.format("Professor [nome=%s])"
				, this.getNome()
				);
	}

	
}
