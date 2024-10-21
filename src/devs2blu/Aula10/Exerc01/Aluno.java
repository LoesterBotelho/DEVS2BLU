/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula10.Exerc01;

public class Aluno implements Pesquisador {

	private String nome;

	public Aluno() {
	}

	public Aluno(String nome) {		
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Boolean estaVazio() {
		return this.getNome().equals("");
	}

	@Override
	public String getNome() {
		return this.nome;
	}

	@Override
	public String getTipo() {
		return "Aluno";
	}

	@Override
	public String toString() {
		
		return String.format("Aluno [nome=%s]"
				, this.getNome()
				);
	}

	
}
